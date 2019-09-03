package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.VitalSignMeasureRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.VitalSignMeasureRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈生命体征测量记录〉
 */
@Service
public class GenerateService20 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private VitalSignMeasureRecordDao vitalSignMeasureRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //生命体征测量记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        VitalSignMeasureRecord vitalSignMeasureRecord = vitalSignMeasureRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        vitalSignMeasureRecord.set疾病诊断名称(vitalSignMeasureRecordDao.find疾病诊断名称By疾病诊断名称(vitalSignMeasureRecord.get疾病诊断编码()));
        sourceMap.put("vitalSignMeasureRecord",vitalSignMeasureRecord);
    }
}
