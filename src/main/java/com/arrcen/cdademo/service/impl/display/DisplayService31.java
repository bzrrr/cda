package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.OtherInformConsentDao;
import com.arrcen.cdademo.pojo.*;
import com.arrcen.cdademo.pojo.cdapojo.OtherInformConsent;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈其他知情告知书〉
 */
@Service
public class DisplayService31 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private OtherInformConsentDao otherInformConsentDao;

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

        //医疗机构名称
        String orgName= medicalOrganizationInfoDao.findOrgNameByCode(patient.get建档医疗机构组织机构());
        resultMap.put("建档医疗机构组织机构名称",orgName);

        //医疗机构信息
        MedicalOrganizationInfo medicalOrganizationInfo = medicalOrganizationInfoDao.findBy医疗机构组织机构代码(patient.get建档医疗机构组织机构());
        resultMap.put("医疗机构信息",medicalOrganizationInfo);

        //其他知情告知书
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        OtherInformConsent otherInformConsent = otherInformConsentDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        otherInformConsent.set患者或法定代理人意见(otherInformConsentDao.find法定代理人与患者的关系By法定代理人与患者的关系代码(otherInformConsent.get法定代理人与患者的关系代码()));
        otherInformConsent.set疾病诊断名称(otherInformConsentDao.find疾病诊断名称By疾病诊断编码(otherInformConsent.get疾病诊断编码()));
        resultMap.put("其他知情告知书",otherInformConsent);

        return resultMap;
    }
}
