package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.FirstCourseRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.FirstCourseRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈首次病程记录〉
 */
@Service
public class GenerateService37 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private FirstCourseRecordDao firstCourseRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //首次病程记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        FirstCourseRecord firstCourseRecord = firstCourseRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        firstCourseRecord.set性别(firstCourseRecordDao.find性别By性别代码(firstCourseRecord.get性别代码()));
        firstCourseRecord.set初步诊断_西医诊断名称(firstCourseRecordDao.find初步诊断_西医诊断名称By初步诊断_西医诊断编码(firstCourseRecord.get初步诊断_西医诊断编码()));
        firstCourseRecord.set初步诊断_中医病名名称(firstCourseRecordDao.find初步诊断_中医病名名称By初步诊断_中医病名代码(firstCourseRecord.get初步诊断_中医病名代码()));
        firstCourseRecord.set初步诊断_中医证候名称(firstCourseRecordDao.find初步诊断_中医证候名称By初步诊断_中医证候代码(firstCourseRecord.get初步诊断_中医证候代码()));
        sourceMap.put("firstCourseRecord",firstCourseRecord);
    }
}
