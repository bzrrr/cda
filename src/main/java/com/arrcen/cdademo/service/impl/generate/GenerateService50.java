package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.DeathRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.DeathRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈死亡记录〉
 */
@Service
public class GenerateService50 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private DeathRecordDao deathRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //死亡记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        DeathRecord deathRecord = deathRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        deathRecord.set性别(deathRecordDao.find性别By性别代码(deathRecord.get性别代码()));
        sourceMap.put("deathRecord",deathRecord);
    }

}
