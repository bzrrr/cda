package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.BloodTransfusionCureConsentDao;
import com.arrcen.cdademo.dao.cdadao.BloodTransfusionRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.BloodTransfusionCureConsent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈输血治疗同意书〉
 */
@Service
public class GenerateService28 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private BloodTransfusionCureConsentDao bloodTransfusionCureConsentDao;

    public void addData(Map sourceMap, Patient patient) {

        //输血治疗同意书
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        BloodTransfusionCureConsent bloodTransfusionCureConsent = bloodTransfusionCureConsentDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        bloodTransfusionCureConsent.set疾病诊断名称(bloodTransfusionCureConsentDao.find疾病诊断名称By疾病诊断编码(bloodTransfusionCureConsent.get疾病诊断编码()));
        bloodTransfusionCureConsent.set法定代理人与患者的关系(bloodTransfusionCureConsentDao.find法定代理人与患者的关系By法定代理人与患者的关系代码(bloodTransfusionCureConsent.get法定代理人与患者的关系代码()));
        bloodTransfusionCureConsent.set输血史标识(bloodTransfusionCureConsentDao.find输血史标识By输血史标识代码(bloodTransfusionCureConsent.get输血史标识代码()));
        bloodTransfusionCureConsent.set输血品种(bloodTransfusionCureConsentDao.find输血品种By输血品种代码(bloodTransfusionCureConsent.get输血品种代码()));
        sourceMap.put("bloodTransfusionCureConsent",bloodTransfusionCureConsent);
    }
}
