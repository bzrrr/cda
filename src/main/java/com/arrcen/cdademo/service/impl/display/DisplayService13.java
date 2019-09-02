package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.BloodTransfusionRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.BloodTransfusionRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService13 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private BloodTransfusionRecordDao bloodTransfusionRecordDao;

    @Override
    public Map<String, Object> getInfo(PatientCdaDocument patientCdaDocument) {

        Map resultMap = Maps.newHashMap();

        //文档信息
        DocInfo docInfo = new DocInfo();
        docInfo.setDocId(patientCdaDocument.getDocid());
        docInfo.setEffectiveTime(patientCdaDocument.getEffectivetime());
        resultMap.put("文档信息",docInfo);

        //患者基本信息
        Patient patient = patientDao.findPatientBy患者身份证件号码(patientCdaDocument.getPatientid());
        patient.set性别(patientDao.find性别By性别代码(patient.get性别代码()));
        resultMap.put("患者基本信息",patient);
        //机构名称
        String orgName = medicalOrganizationInfoDao.findOrgNameByCode(patient.get建档医疗机构组织机构());
        resultMap.put("建档医疗机构组织机构名称",orgName);

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
        resultMap.put("输血记录",bloodTransfusionRecord);

        return resultMap;
    }
}
