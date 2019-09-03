package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.SuperiorDoctorRoundsRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.SuperiorDoctorRoundsRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈上级医师查房记录〉
 */
@Service
public class GenerateService39 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private SuperiorDoctorRoundsRecordDao superiorDoctorRoundsRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //上级医师查房记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        SuperiorDoctorRoundsRecord superiorDoctorRoundsRecord = superiorDoctorRoundsRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        superiorDoctorRoundsRecord.set性别(superiorDoctorRoundsRecordDao.find性别By性别代码(superiorDoctorRoundsRecord.get性别代码()));
        sourceMap.put("superiorDoctorRoundsRecord",superiorDoctorRoundsRecord);
    }
}
