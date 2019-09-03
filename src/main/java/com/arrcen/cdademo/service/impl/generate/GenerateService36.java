package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.AdmissionDeathRecord24HDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.AdmissionDeathRecord24H;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈24H内入院死亡记录〉
 */
@Service
public class GenerateService36 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private AdmissionDeathRecord24HDao admissionDeathRecord24HDao;

    public void addData(Map sourceMap, Patient patient) {

        //24H内入院死亡记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        AdmissionDeathRecord24H admissionDeathRecord24H = admissionDeathRecord24HDao.findBy住院号(healthIncidentInfo.get住院号());
        admissionDeathRecord24H.set民族(admissionDeathRecord24HDao.find民族名称By民族(admissionDeathRecord24H.get民族()));
        admissionDeathRecord24H.set性别(admissionDeathRecord24HDao.find性别By性别代码(admissionDeathRecord24H.get性别代码()));
        admissionDeathRecord24H.set职业类别(admissionDeathRecord24HDao.find职业类别By职业类别代码(admissionDeathRecord24H.get职业类别代码()));
        admissionDeathRecord24H.set陈述者与患者的关系(admissionDeathRecord24HDao.find陈述者与患者的关系(admissionDeathRecord24H.get陈述者与患者的关系代码()));
        admissionDeathRecord24H.set婚姻状况(admissionDeathRecord24HDao.find婚姻状况By婚姻状况代码(admissionDeathRecord24H.get婚姻状况代码()));
        sourceMap.put("admissionDeathRecord24H",admissionDeathRecord24H);
    }
}
