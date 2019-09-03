package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.InspectionRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.InspectionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈检查报告〉
 */
@Service
public class GenerateService06 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private InspectionRecordDao inspectionRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //检查报告
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        InspectionRecord inspectionRecord = inspectionRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        inspectionRecord.set患者类型(inspectionRecordDao.find患者类型By患者类型代码(inspectionRecord.get患者类型代码()));
        inspectionRecord.set疾病诊断名称(inspectionRecordDao.find疾病诊断名称By疾病诊断编码(inspectionRecord.get疾病诊断编码()));
        inspectionRecord.set检查结果(inspectionRecordDao.find检查结果By检查结果代码(inspectionRecord.get检查结果代码()));
        sourceMap.put("inspectionRecord",inspectionRecord);
    }
}
