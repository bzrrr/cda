package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.DischargeAssessGuideRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.DischargeAssessGuideRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈出院评估与指导〉
 */
@Service
public class GenerateService25 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private DischargeAssessGuideRecordDao dischargeAssessGuideRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //出院评估与指导
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        DischargeAssessGuideRecord dischargeAssessGuideRecord = dischargeAssessGuideRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        dischargeAssessGuideRecord.set出院诊断名称(dischargeAssessGuideRecordDao.find出院诊断名称By出院诊断编码(dischargeAssessGuideRecord.get出院诊断编码()));
        dischargeAssessGuideRecord.set离院方式(dischargeAssessGuideRecordDao.find离院方式By离院方式代码(dischargeAssessGuideRecord.get离院方式代码()));
        dischargeAssessGuideRecord.set饮食情况(dischargeAssessGuideRecordDao.find饮食情况By饮食情况代码(dischargeAssessGuideRecord.get饮食情况代码()));
        dischargeAssessGuideRecord.set饮食指导(dischargeAssessGuideRecordDao.find饮食指导By饮食指导代码(dischargeAssessGuideRecord.get饮食指导代码()));
        dischargeAssessGuideRecord.set自理能力(dischargeAssessGuideRecordDao.find自理能力By自理能力代码(dischargeAssessGuideRecord.get自理能力代码()));
        sourceMap.put("dischargeAssessGuideRecord",dischargeAssessGuideRecord);
    }
}
