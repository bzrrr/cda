package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.SpecialExamCureConsentDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.SpecialExamCureConsent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈特殊检查及特殊治疗同意书〉
 */
@Service
public class GenerateService29 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private SpecialExamCureConsentDao specialExamCureConsentDao;

    public void addData(Map sourceMap, Patient patient) {

        //特殊检查及特殊治疗同意书
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        SpecialExamCureConsent specialExamCureConsent = specialExamCureConsentDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        specialExamCureConsent.set法定代理人与患者的关系(specialExamCureConsentDao.find法定代理人与患者的关系By法定代理人与患者的关系代码(specialExamCureConsent.get法定代理人与患者的关系代码()));
        specialExamCureConsent.set疾病诊断名称(specialExamCureConsentDao.find疾病诊断名称By疾病诊断编号(specialExamCureConsent.get疾病诊断编码()));
        sourceMap.put("specialExamCureConsent",specialExamCureConsent);
    }
}
