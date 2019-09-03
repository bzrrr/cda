package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.PreanesthesiaVisitRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.PreanesthesiaVisitRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈麻醉术前访视记录〉
 */
@Service
public class GenerateService10 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private PreanesthesiaVisitRecordDao preanesthesiaVisitRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //麻醉术前访视记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        PreanesthesiaVisitRecord preanesthesiaVisitRecord = preanesthesiaVisitRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        preanesthesiaVisitRecord.setABO血型(preanesthesiaVisitRecordDao.findABO血型名称ByABO血型代码(preanesthesiaVisitRecord.getABO血型代码()));
        preanesthesiaVisitRecord.setRH血型(preanesthesiaVisitRecordDao.findRH血型名称ByRH血型代码(preanesthesiaVisitRecord.getRH血型代码()));
        preanesthesiaVisitRecord.set拟实施手术及操作名称(preanesthesiaVisitRecordDao.find拟实施手术及操作名称By拟实施手术及操作编码(preanesthesiaVisitRecord.get拟实施手术及操作编码()));
        preanesthesiaVisitRecord.set拟实施麻醉方法名称(preanesthesiaVisitRecordDao.find拟实施麻醉方法名称By拟实施麻醉方法代码(preanesthesiaVisitRecord.get拟实施麻醉方法代码()));
        preanesthesiaVisitRecord.set术前诊断名称(preanesthesiaVisitRecordDao.find术前诊断名称By术前诊断编码(preanesthesiaVisitRecord.get术前诊断编码()));
        sourceMap.put("preanesthesiaVisitRecord",preanesthesiaVisitRecord);

    }
}
