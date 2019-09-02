package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.BloodTransfusionCureConsentDao;
import com.arrcen.cdademo.dao.cdadao.BloodTransfusionRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.BloodTransfusionCureConsent;
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
public class DisplayService28 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private BloodTransfusionCureConsentDao bloodTransfusionCureConsentDao;

    @Override
    public Map<String, Object> getInfo(PatientCdaDocument patientCdaDocument) {

        Map resultMap = Maps.newHashMap();

        //文档信息
        DocInfo docInfo = new DocInfo();
        docInfo.setEffectiveTime(patientCdaDocument.getEffectivetime());
        docInfo.setDocId(patientCdaDocument.getDocid());
        resultMap.put("文档信息",docInfo);

        //患者基本信息
        Patient patient = patientDao.findPatientBy患者身份证件号码(patientCdaDocument.getPatientid());
        patient.set性别(patientDao.find性别By性别代码(patient.get性别代码()));
        resultMap.put("患者基本信息",patient);

        //医疗机构
        String orgName= medicalOrganizationInfoDao.findOrgNameByCode(patient.get建档医疗机构组织机构());
        resultMap.put("建档医疗机构组织机构名称",orgName);

        //输血治疗同意书
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        BloodTransfusionCureConsent bloodTransfusionCureConsent = bloodTransfusionCureConsentDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        bloodTransfusionCureConsent.set疾病诊断名称(bloodTransfusionCureConsentDao.find疾病诊断名称By疾病诊断编码(bloodTransfusionCureConsent.get疾病诊断编码()));
        bloodTransfusionCureConsent.set法定代理人与患者的关系(bloodTransfusionCureConsentDao.find法定代理人与患者的关系By法定代理人与患者的关系代码(bloodTransfusionCureConsent.get法定代理人与患者的关系代码()));
        bloodTransfusionCureConsent.set输血史标识(bloodTransfusionCureConsentDao.find输血史标识By输血史标识代码(bloodTransfusionCureConsent.get输血史标识代码()));
        bloodTransfusionCureConsent.set输血品种(bloodTransfusionCureConsentDao.find输血品种By输血品种代码(bloodTransfusionCureConsent.get输血品种代码()));
        resultMap.put("输血治疗同意书",bloodTransfusionCureConsent);

        return resultMap;
    }
}
