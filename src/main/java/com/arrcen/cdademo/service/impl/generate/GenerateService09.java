package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.GeneralSurgicalRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.GeneralSurgicalRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈一般手术记录〉
 */
@Service
public class GenerateService09 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private GeneralSurgicalRecordDao generalSurgicalRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //一般手术记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        GeneralSurgicalRecord generalSurgicalRecord = generalSurgicalRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        generalSurgicalRecord.set手术体位名称(generalSurgicalRecordDao.find手术体位名称By手术体位代码(generalSurgicalRecord.get手术体位代码()));
        generalSurgicalRecord.set麻醉方法(generalSurgicalRecordDao.find麻醉方法By麻醉方法代码(generalSurgicalRecord.get麻醉方法代码()));
        generalSurgicalRecord.set手术级别(generalSurgicalRecordDao.find手术级别By手术级别代码(generalSurgicalRecord.get手术级别代码()));
        generalSurgicalRecord.set术前诊断名称(generalSurgicalRecordDao.find术前诊断名称By术前诊断编码(generalSurgicalRecord.get术前诊断编码()));
        generalSurgicalRecord.set术后诊断名称(generalSurgicalRecordDao.find术后诊断名称By术后诊断编码(generalSurgicalRecord.get术后诊断编码()));
        sourceMap.put("generalSurgicalRecord",generalSurgicalRecord);

    }
}
