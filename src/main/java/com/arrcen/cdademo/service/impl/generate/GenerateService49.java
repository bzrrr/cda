package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.DischargeRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.DischargeRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈出院记录〉
 */
@Service
public class GenerateService49 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private DischargeRecordDao dischargeRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //出院记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        DischargeRecord dischargeRecord = dischargeRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        dischargeRecord.set性别(dischargeRecordDao.find性别By性别代码(dischargeRecord.get性别代码()));
        dischargeRecord.set入院诊断名称(dischargeRecordDao.find入院诊断名称By入院诊断编码(dischargeRecord.get入院诊断编码()));
        sourceMap.put("dischargeRecord",dischargeRecord);
    }
}
