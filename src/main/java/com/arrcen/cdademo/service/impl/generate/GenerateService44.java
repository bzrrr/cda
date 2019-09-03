package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.RescueRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.RescueRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈抢救记录〉
 */
@Service
public class GenerateService44 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private RescueRecordDao rescueRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //抢救记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        RescueRecord rescueRecord = rescueRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        rescueRecord.set性别(rescueRecordDao.find性别By性别代码(rescueRecord.get性别代码()));
        rescueRecord.set专业技术职务类别名称(rescueRecordDao.find专业技术职务类别名称By专业技术职务类别代码(rescueRecord.get专业技术职务类别代码()));
        sourceMap.put("rescueRecord",rescueRecord);
    }
}
