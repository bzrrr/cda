package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.TransferRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.TransferRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈转科记录〉
 */
@Service
public class GenerateService42 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private TransferRecordDao transferRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //转科记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        TransferRecord transferRecord = transferRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        transferRecord.set性别(transferRecordDao.find性别By性别代码(transferRecord.get性别代码()));
        transferRecord.set入院诊断_西医诊断名称(transferRecordDao.find入院诊断_西医诊断名称By入院诊断_西医诊断编码(transferRecord.get入院诊断_西医诊断编码()));
        transferRecord.set入院诊断_中医病名名称(transferRecordDao.find入院诊断_中医病名名称By入院诊断_中医病名代码(transferRecord.get入院诊断_中医病名代码()));
        transferRecord.set入院诊断_中医证候名称(transferRecordDao.find入院诊断_中医证候名称By入院诊断_中医证候代码(transferRecord.get入院诊断_中医证候代码()));
        transferRecord.set目前诊断_中医病名名称(transferRecordDao.find目前诊断_中医病名名称By目前诊断_中医病名代码(transferRecord.get目前诊断_中医病名代码()));
        transferRecord.set目前诊断_中医证候名称(transferRecordDao.find目前诊断_中医证候名称By目前诊断_中医证候代码(transferRecord.get目前诊断_中医证候代码()));
        transferRecord.set目前诊断_西医诊断名称(transferRecordDao.find目前诊断_西医诊断名称By目前诊断_西医诊断编码(transferRecord.get目前诊断_西医诊断编码()));
        sourceMap.put("transferRecord",transferRecord);
    }
}
