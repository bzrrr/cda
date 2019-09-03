package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.cdadao.OtherInformConsentDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.MedicalOrganizationInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.OtherInformConsent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈其他知情告知同意书〉
 */
@Service
public class GenerateService31 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private OtherInformConsentDao otherInformConsentDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;

    public void addData(Map sourceMap, Patient patient) {

        //医疗机构信息
        MedicalOrganizationInfo medicalOrganizationInfo = medicalOrganizationInfoDao.findBy医疗机构组织机构代码(patient.get建档医疗机构组织机构());
        sourceMap.put("medicalOrganizationInfo",medicalOrganizationInfo);

        //其他知情告知书
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        OtherInformConsent otherInformConsent = otherInformConsentDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        otherInformConsent.set患者或法定代理人意见(otherInformConsentDao.find法定代理人与患者的关系By法定代理人与患者的关系代码(otherInformConsent.get法定代理人与患者的关系代码()));
        otherInformConsent.set疾病诊断名称(otherInformConsentDao.find疾病诊断名称By疾病诊断编码(otherInformConsent.get疾病诊断编码()));
        sourceMap.put("otherInformConsent",otherInformConsent);
    }
}
