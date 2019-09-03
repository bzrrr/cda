package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.GeneralCareRecordDao;
import com.arrcen.cdademo.dao.cdadao.GeneralSurgicalRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.GeneralCareRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * 〈一般护理记录〉
 */
@Service
public class GenerateService17 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private GeneralCareRecordDao generalCareRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //一般护理记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        GeneralCareRecord generalCareRecord = generalCareRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        generalCareRecord.set安全护理名称(generalCareRecordDao.find安全护理名称By安全护理代码(generalCareRecord.get安全护理代码()));
        generalCareRecord.set心理护理名称(generalCareRecordDao.find心理护理名称By心理护理代码(generalCareRecord.get心理护理代码()));
        generalCareRecord.set护理等级(generalCareRecordDao.find护理等级By护理等级代码(generalCareRecord.get护理等级代码()));
        generalCareRecord.set疾病诊断名称(generalCareRecordDao.find疾病诊断名称By疾病诊断名称(generalCareRecord.get疾病诊断编码()));
        generalCareRecord.set护理类型(generalCareRecordDao.find护理类型By护理类型代码(generalCareRecord.get护理类型代码()));
        generalCareRecord.set隔离种类(generalCareRecordDao.find隔离种类By隔离种类代码(generalCareRecord.get隔离种类代码()));
        generalCareRecord.set饮食情况(generalCareRecordDao.find饮食情况By饮食情况代码(generalCareRecord.get饮食情况代码()));
        generalCareRecord.set气管护理(generalCareRecordDao.find气管护理By气管护理代码(generalCareRecord.get气管护理代码()));
        generalCareRecord.set饮食指导(generalCareRecordDao.find饮食指导By饮食指导代码(generalCareRecord.get饮食指导代码()));
        sourceMap.put("generalCareRecord",generalCareRecord);
    }
}
