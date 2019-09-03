package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.BloodTransfusionCureConsentDao;
import com.arrcen.cdademo.dao.cdadao.BloodTransfusionRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.BloodTransfusionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈输血记录〉
 */
@Service
public class GenerateService13 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private BloodTransfusionRecordDao bloodTransfusionRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //输血记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        BloodTransfusionRecord bloodTransfusionRecord = bloodTransfusionRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        bloodTransfusionRecord.setABO血型(bloodTransfusionRecordDao.findABO血型名称ByABO血型代码(bloodTransfusionRecord.getABO血型代码()));
        bloodTransfusionRecord.setRH血型(bloodTransfusionRecordDao.findRH血型名称ByRH血型代码(bloodTransfusionRecord.getRH血型代码()));
        bloodTransfusionRecord.set申请ABO血型(bloodTransfusionRecordDao.find申请ABO血型By申请ABO血型代码(bloodTransfusionRecord.get申请ABO血型代码()));
        bloodTransfusionRecord.set申请RH血型(bloodTransfusionRecordDao.find申请RH血型By申请RH血型代码(bloodTransfusionRecord.get申请RH血型代码()));
        bloodTransfusionRecord.set输血性质(bloodTransfusionRecordDao.find输血性质By输血性质代码(bloodTransfusionRecord.get输血性质代码()));
        bloodTransfusionRecord.set输血品种(bloodTransfusionRecordDao.find输血品种By输血品种代码(bloodTransfusionRecord.get输血品种代码()));
        bloodTransfusionRecord.set疾病诊断名称(bloodTransfusionRecordDao.find疾病诊断名称By疾病诊断编码(bloodTransfusionRecord.get疾病诊断编码()));
        bloodTransfusionRecord.set输血反应类型(bloodTransfusionRecordDao.find输血反应类型By输血反应类型代码(bloodTransfusionRecord.get输血反应类型代码()));
        bloodTransfusionRecord.set输血史标识(bloodTransfusionRecordDao.find输血史标识By输血史标识代码(bloodTransfusionRecord.get输血史标识代码()));
        sourceMap.put("bloodTransfusionRecord",bloodTransfusionRecord);
    }
}
