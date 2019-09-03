package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.CriticalIllnessNoticeDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.CriticalIllnessNotice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈病危重通知书〉
 */
@Service
public class GenerateService30 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private CriticalIllnessNoticeDao criticalIllnessNoticeDao;

    public void addData(Map sourceMap, Patient patient) {

        //病危重通知书
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        CriticalIllnessNotice criticalIllnessNotice = criticalIllnessNoticeDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        criticalIllnessNotice.set法定代理人与患者的关系(criticalIllnessNoticeDao.find法定代理人与患者的关系By法定代理人与患者的关系代码(criticalIllnessNotice.get法定代理人与患者的关系代码()));
        criticalIllnessNotice.set疾病诊断名称(criticalIllnessNoticeDao.find疾病诊断名称By疾病诊断编码(criticalIllnessNotice.get疾病诊断编码()));
        sourceMap.put("criticalIllnessNotice",criticalIllnessNotice);
    }
}
