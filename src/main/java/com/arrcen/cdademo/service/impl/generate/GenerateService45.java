package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.ConsultationRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.ConsultationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈会诊记录〉
 */
@Service
public class GenerateService45 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private ConsultationRecordDao consultationRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //会诊记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        ConsultationRecord consultationRecord = consultationRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        consultationRecord.set性别(consultationRecordDao.find性别By性别代码(consultationRecord.get性别代码()));
        sourceMap.put("consultationRecord",consultationRecord);
    }
}
