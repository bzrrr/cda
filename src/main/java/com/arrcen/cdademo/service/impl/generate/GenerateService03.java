package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.EmergencyMedicalRecordDao;
import com.arrcen.cdademo.dao.cdadao.EmergencyMedicalRecordDetailDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.EmergencyMedicalRecord;
import com.arrcen.cdademo.pojo.cdapojo.EmergencyMedicalRecordDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈急诊留观病历〉
 */
@Service
public class GenerateService03 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private EmergencyMedicalRecordDao emergencyMedicalRecordDao;
    @Autowired
    private EmergencyMedicalRecordDetailDao emergencyMedicalRecordDetailDao;

    public void addData(Map sourceMap, Patient patient) {

        //居民健康卡号
        String patientHealthCardId = patient.get居民健康卡号();

        //卫生事件
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patientHealthCardId);

        //门急诊号
        String emergencyNumber = healthIncidentInfo.get门急诊号();

        //急诊留观病历
        EmergencyMedicalRecord emRecord = emergencyMedicalRecordDao.findBy门急诊号(emergencyNumber);
        sourceMap.put("emRecord",emRecord);

        //急诊留观病历医嘱详情 -> 假定电子申请单号==门急诊号
        EmergencyMedicalRecordDetail emRecordDetail = emergencyMedicalRecordDetailDao.findBy电子申请单编号(emergencyNumber);
        sourceMap.put("emRecordDetail",emRecordDetail);
    }
}
