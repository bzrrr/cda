package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.SurgicalCareRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.SurgicalCareRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈手术护理记录〉
 */
@Service
public class GenerateService19 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private SurgicalCareRecordDao surgicalCareRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //手术护理记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        SurgicalCareRecord surgicalCareRecord = surgicalCareRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        surgicalCareRecord.setABO血型(surgicalCareRecordDao.findABO血型名称ByABO血型代码(surgicalCareRecord.getABO血型代码()));
        surgicalCareRecord.setRH血型(surgicalCareRecordDao.findRH血型名称ByRH血型代码(surgicalCareRecord.getRH血型代码()));
        surgicalCareRecord.set手术及操作名称(surgicalCareRecordDao.find手术及操作名称By手术及操作编码(surgicalCareRecord.get手术及操作编码()));
        surgicalCareRecord.set护理等级(surgicalCareRecordDao.find护理等级By护理等级代码(surgicalCareRecord.get护理等级代码()));
        surgicalCareRecord.set护理类型(surgicalCareRecordDao.find护理类型By护理类型代码(surgicalCareRecord.get护理类型代码()));
        surgicalCareRecord.set术前诊断名称(surgicalCareRecordDao.find术前诊断名称By术前诊断编码(surgicalCareRecord.get术前诊断编码()));
        sourceMap.put("surgicalCareRecord",surgicalCareRecord);
    }
}
