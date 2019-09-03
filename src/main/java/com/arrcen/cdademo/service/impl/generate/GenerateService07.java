package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.TestRecordDao;
import com.arrcen.cdademo.dao.cdadao.TestRecordDetailDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.TestRecord;
import com.arrcen.cdademo.pojo.cdapojo.TestRecordDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈检验报告〉
 */
@Service
public class GenerateService07 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private TestRecordDetailDao testRecordDetailDao;
    @Autowired
    private TestRecordDao testRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //检验报告
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        TestRecord testRecord = testRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        testRecord.set患者类型名称(testRecordDao.find患者类型By患者类型代码(testRecord.get患者类型代码()));
        testRecord.set疾病诊断名称(testRecordDao.find疾病诊断名称By疾病诊断名称(testRecord.get疾病诊断编码()));
        sourceMap.put("testRecord",testRecord);
        //检验报告明细
        TestRecordDetail testRecordDetail = testRecordDetailDao.findBy单据序号(testRecord.get系统序号());
        testRecordDetail.set检验结果(testRecordDetailDao.find检验结果By检验结果代码(testRecordDetail.get检验结果代码()));
        sourceMap.put("testRecordDetail",testRecordDetail);
    }
}
