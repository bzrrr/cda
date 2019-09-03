package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.CriticalCareRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.CriticalCareRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈病重病危护理记录〉
 */
@Service
public class GenerateService18 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private CriticalCareRecordDao criticalCareRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //病危(病重)护理记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        CriticalCareRecord criticalCareRecord = criticalCareRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        criticalCareRecord.set护理等级(criticalCareRecordDao.find护理等级By护理等级代码(criticalCareRecord.get护理等级代码()));
        criticalCareRecord.set护理类型(criticalCareRecordDao.find护理类型By护理类型代码(criticalCareRecord.get护理类型代码()));
        criticalCareRecord.set疾病诊断名称(criticalCareRecordDao.find疾病诊断名称By疾病诊断名称(criticalCareRecord.get疾病诊断编码()));
        criticalCareRecord.set饮食情况(criticalCareRecordDao.find饮食情况By饮食情况代码(criticalCareRecord.get饮食情况代码()));
        sourceMap.put("criticalCareRecord",criticalCareRecord);
    }
}
