package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.CesareanSectionDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.CesareanSection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈剖宫产记录〉
 */
@Service
public class GenerateService16 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private CesareanSectionDao cesareanSectionDao;

    public void addData(Map sourceMap, Patient patient) {

        //剖宫产手术记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        CesareanSection cesareanSection = cesareanSectionDao.findBy住院号(healthIncidentInfo.get住院号());
        cesareanSection.setAPGAR评分间隔时间(cesareanSectionDao.findAPGAR评分间隔时间ByAPGAR评分间隔时间代码(cesareanSection.getAPGAR评分间隔时间代码()));
        cesareanSection.set分娩结局(cesareanSectionDao.find分娩结局By分娩结局代码(cesareanSection.get分娩结局代码()));
        cesareanSection.set手术及操作名称(cesareanSectionDao.find手术及操作名称By手术及操作编码(cesareanSection.get手术及操作编码()));
        cesareanSection.set新生儿异常情况(cesareanSectionDao.find新生儿异常情况By新生儿异常情况代码(cesareanSection.get新生儿异常情况代码()));
        cesareanSection.set麻醉方法名称(cesareanSectionDao.find麻醉方法名称By麻醉方法代码(cesareanSection.get麻醉方法代码()));
        cesareanSection.set新生儿性别(cesareanSectionDao.find新生儿性别By新生儿性别代码(cesareanSection.get新生儿性别代码()));
        sourceMap.put("cesareanSection",cesareanSection);
    }
}
