package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.InternalDischargeRecord24HDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.InternalDischargeRecord24H;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈24H内入出院记录〉
 */
@Service
public class GenerateService35 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private InternalDischargeRecord24HDao internalDischargeRecord24HDao;

    public void addData(Map sourceMap, Patient patient) {

        //24H内入出院记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        InternalDischargeRecord24H internalDischargeRecord24H = internalDischargeRecord24HDao.findBy住院号(healthIncidentInfo.get住院号());
        internalDischargeRecord24H.set性别(internalDischargeRecord24HDao.find性别By性别代码(internalDischargeRecord24H.get性别代码()));
        internalDischargeRecord24H.set婚姻状况(internalDischargeRecord24HDao.find婚姻状况By婚姻状况代码(internalDischargeRecord24H.get婚姻状况代码()));
        internalDischargeRecord24H.set民族(internalDischargeRecord24HDao.find民族名称By民族(internalDischargeRecord24H.get民族()));
        internalDischargeRecord24H.set陈述者与患者的关系(internalDischargeRecord24HDao.find陈述者与患者的关系(internalDischargeRecord24H.get陈述者与患者的关系代码()));
        internalDischargeRecord24H.set职业类别(internalDischargeRecord24HDao.find职业类别By职业类别代码(internalDischargeRecord24H.get职业类别代码()));
        sourceMap.put("internalDischargeRecord24H",internalDischargeRecord24H);
    }
}
