package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.ExpectanceRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.ExpectanceRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈待产记录〉
 */
@Service
public class GenerateService14 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private ExpectanceRecordDao expectanceRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //待产记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        ExpectanceRecord expectanceRecord = expectanceRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        expectanceRecord.set受孕形式(expectanceRecordDao.find受孕形式By受孕形式代码(expectanceRecord.get受孕形式代码()));
        expectanceRecord.set计划选取的分娩方式(expectanceRecordDao.find计划选取的分娩方式By计划选取的分娩方式代码(expectanceRecord.get计划选取的分娩方式代码()));
        expectanceRecord.set胎方位(expectanceRecordDao.find胎方位By胎方位代码(expectanceRecord.get胎方位代码()));
        expectanceRecord.set胎膜情况(expectanceRecordDao.find胎膜情况By胎膜情况代码(expectanceRecord.get胎膜情况代码()));
        expectanceRecord.set破膜方式(expectanceRecordDao.find破膜方式By破膜方式代码(expectanceRecord.get破膜方式代码()));
        expectanceRecord.set检查方式(expectanceRecordDao.find检查方式By检查方式代码(expectanceRecord.get检查方式代码()));
        sourceMap.put("expectanceRecord",expectanceRecord);
    }
}
