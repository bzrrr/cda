package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.HighValueThingUseRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.HighValueThingUseRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈高值耗材使用记录〉
 */
@Service
public class GenerateService22 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private HighValueThingUseRecordDao highValueThingUseRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //高值耗材使用记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        HighValueThingUseRecord highValueThingUseRecord = highValueThingUseRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        highValueThingUseRecord.set疾病诊断名称(highValueThingUseRecordDao.find疾病诊断名称By疾病诊断编码(highValueThingUseRecord.get疾病诊断编码()));
        sourceMap.put("highValueThingUseRecord",highValueThingUseRecord);
    }
}
