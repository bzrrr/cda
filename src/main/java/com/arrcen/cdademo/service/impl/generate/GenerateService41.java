package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.HandoverRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.HandoverRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈交接班记录〉
 */
@Service
public class GenerateService41 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private HandoverRecordDao handoverRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //交接班记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        HandoverRecord handoverRecord = handoverRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        handoverRecord.set性别(handoverRecordDao.find性别By性别代码(handoverRecord.get性别代码()));
        handoverRecord.set入院诊断_中医病名名称(handoverRecordDao.find入院诊断_中医病名名称By入院诊断_中医病名代码(handoverRecord.get入院诊断_中医病名代码()));
        handoverRecord.set入院诊断_中医证候名称(handoverRecordDao.find入院诊断_中医证候名称By入院诊断_中医证候代码(handoverRecord.get入院诊断_中医证候代码()));
        handoverRecord.set入院诊断_西医诊断名称(handoverRecordDao.find入院诊断_西医诊断名称By入院诊断_西医诊断编码(handoverRecord.get入院诊断_西医诊断编码()));
        handoverRecord.set目前诊断_中医病名名称(handoverRecordDao.find目前诊断_中医病名名称By目前诊断_中医病名代码(handoverRecord.get目前诊断_中医病名代码()));
        handoverRecord.set目前诊断_中医证候名称(handoverRecordDao.find目前诊断_中医证候名称By目前诊断_中医证候代码(handoverRecord.get目前诊断_中医证候代码()));
        handoverRecord.set目前诊断_西医诊断名称(handoverRecordDao.find目前诊断_西医诊断名称By目前诊断_西医诊断编码(handoverRecord.get目前诊断_西医诊断编码()));
        sourceMap.put("handoverRecord",handoverRecord);
    }
}
