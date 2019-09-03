package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalExpenseRecordDao;
import com.arrcen.cdademo.dao.PatientHealthDocInfoDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.MedicalExpenseRecord;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientHealthDocInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈病历概要〉
 */
@Service
public class GenerateService01 {
    @Autowired
    private PatientHealthDocInfoDao patientHealthDocInfoDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalExpenseRecordDao medicalExpenseRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        String patientHealthCardId = patient.get居民健康卡号();
		PatientHealthDocInfo patientHealthDocInfo = patientHealthDocInfoDao.findBy居民健康卡号(patientHealthCardId);
		sourceMap.put("patientHealthDocInfo", patientHealthDocInfo);

		HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patientHealthCardId);
		sourceMap.put("healthIncidentInfo", healthIncidentInfo);

		MedicalExpenseRecord medicalExpenseRecord = medicalExpenseRecordDao.findBy居民健康卡号(patientHealthCardId);
		sourceMap.put("medicalExpenseRecord", medicalExpenseRecord);
    }
}
