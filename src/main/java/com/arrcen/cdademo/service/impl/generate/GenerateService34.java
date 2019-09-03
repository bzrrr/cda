package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.AdmissionRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.AdmissionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈入院记录〉
 */
@Service
public class GenerateService34 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private AdmissionRecordDao admissionRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //入院记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        AdmissionRecord admissionRecord = admissionRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        admissionRecord.set婚姻状况(admissionRecordDao.find婚姻状况By婚姻状况代码(admissionRecord.get婚姻状况代码()));
        admissionRecord.set民族(admissionRecordDao.find民族名称By民族(admissionRecord.get民族()));
        admissionRecord.set职业类别(admissionRecordDao.find职业类别By职业类别代码(admissionRecord.get职业类别代码()));
        admissionRecord.set陈述者与患者的关系(admissionRecordDao.find陈述者与患者的关系(admissionRecord.get陈述者与患者的关系代码()));
        sourceMap.put("admissionRecord",admissionRecord);
    }
}
