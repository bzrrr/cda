package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.PreoperativeSummaryDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.PreoperativeSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈术前小结〉
 */
@Service
public class GenerateService46 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private PreoperativeSummaryDao preoperativeSummaryDao;

    public void addData(Map sourceMap, Patient patient) {

        //术前小结
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        PreoperativeSummary preoperativeSummary = preoperativeSummaryDao.findBy住院号(healthIncidentInfo.get住院号());
        preoperativeSummary.set性别(preoperativeSummaryDao.find性别By性别代码(preoperativeSummary.get性别代码()));
        preoperativeSummary.set术前诊断名称(preoperativeSummaryDao.find术前诊断名称By术前诊断编码(preoperativeSummary.get术前诊断编码()));
        preoperativeSummary.set拟实施麻醉方法名称(preoperativeSummaryDao.find拟实施麻醉方法名称By拟实施麻醉方法代码(preoperativeSummary.get拟实施麻醉方法代码()));
        sourceMap.put("preoperativeSummary",preoperativeSummary);
    }
}
