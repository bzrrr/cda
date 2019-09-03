package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.SurgeryInformConsentDao;
import com.arrcen.cdademo.dao.cdadao.SurgicalCareRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.SurgeryInformConsent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈手术知情同意书〉
 */
@Service
public class GenerateService26 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private SurgeryInformConsentDao surgeryInformConsentDao;

    public void addData(Map sourceMap, Patient patient) {

        //手术知情同意书
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        SurgeryInformConsent surgeryInformConsent = surgeryInformConsentDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        surgeryInformConsent.set拟实施手术及操作名称(surgeryInformConsentDao.find拟实施手术及操作名称By拟实施手术及操作编码(surgeryInformConsent.get拟实施手术及操作编码()));
        surgeryInformConsent.set拟实施麻醉方法(surgeryInformConsentDao.find拟实施麻醉方法By拟实施麻醉方法代码(surgeryInformConsent.get拟实施麻醉方法代码()));
        surgeryInformConsent.set法定代理人与患者的关系(surgeryInformConsentDao.find法定代理人与患者的关系By法定代理人与患者的关系代码(surgeryInformConsent.get法定代理人与患者的关系代码()));
        surgeryInformConsent.set术前诊断名称(surgeryInformConsentDao.find术前诊断名称By术前诊断编码(surgeryInformConsent.get术前诊断编码()));
        sourceMap.put("surgeryInformConsent",surgeryInformConsent);
    }
}
