package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.SpecialExamCureConsentDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.SpecialExamCureConsent;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService29 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private SpecialExamCureConsentDao specialExamCureConsentDao;

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

        //特殊检查及特殊治疗同意书
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        SpecialExamCureConsent specialExamCureConsent = specialExamCureConsentDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        specialExamCureConsent.set法定代理人与患者的关系(specialExamCureConsentDao.find法定代理人与患者的关系By法定代理人与患者的关系代码(specialExamCureConsent.get法定代理人与患者的关系代码()));
        specialExamCureConsent.set疾病诊断名称(specialExamCureConsentDao.find疾病诊断名称By疾病诊断编号(specialExamCureConsent.get疾病诊断编码()));
        resultMap.put("特殊检查及特殊治疗同意书",specialExamCureConsent);

        return super.getInfo(patientCdaDocument);
    }
}
