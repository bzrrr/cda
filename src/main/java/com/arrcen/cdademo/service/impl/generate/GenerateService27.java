package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.AnesthesiaInformedConsentDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.AnesthesiaInformedConsent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈麻醉知情同意书〉
 */
@Service
public class GenerateService27 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private AnesthesiaInformedConsentDao anesthesiaInformedConsentDao;

    public void addData(Map sourceMap, Patient patient) {

        //麻醉知情同意书
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        AnesthesiaInformedConsent anesthesiaInformedConsent = anesthesiaInformedConsentDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        anesthesiaInformedConsent.set拟实施手术及操作名称(anesthesiaInformedConsentDao.find拟实施手术及操作名称By拟实施手术及操作编码(anesthesiaInformedConsent.get拟实施手术及操作编码()));
        anesthesiaInformedConsent.set术前诊断名称(anesthesiaInformedConsentDao.find术前诊断名称By术前诊断编码(anesthesiaInformedConsent.get术前诊断编码()));
        anesthesiaInformedConsent.set拟实施麻醉方法(anesthesiaInformedConsentDao.find拟实施麻醉方法By拟实施麻醉方法代码(anesthesiaInformedConsent.get拟实施麻醉方法代码()));
        anesthesiaInformedConsent.set法定代理人与患者的关系(anesthesiaInformedConsentDao.find法定代理人与患者的关系By法定代理人与患者的关系代码(anesthesiaInformedConsent.get法定代理人与患者的关系代码()));
        sourceMap.put("anesthesiaInformedConsent",anesthesiaInformedConsent);
    }
}
