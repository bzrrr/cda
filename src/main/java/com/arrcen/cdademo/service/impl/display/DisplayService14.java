package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.ExpectanceRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.ExpectanceRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService14 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private ExpectanceRecordDao expectanceRecordDao;

    @Override
    public Map<String, Object> getInfo(PatientCdaDocument patientCdaDocument) {
        Map resultMap = Maps.newHashMap();

        //文档信息
        DocInfo docInfo = new DocInfo();
        docInfo.setEffectiveTime(patientCdaDocument.getEffectivetime());
        docInfo.setDocId(patientCdaDocument.getDocid());
        resultMap.put("文档信息",docInfo);

        //患者基本信息
        Patient patient = patientDao.findPatientBy患者身份证件号码(patientCdaDocument.getPatientid());
        patient.set性别(patientDao.find性别By性别代码(patient.get性别代码()));
        resultMap.put("患者基本信息",patient);

        //医疗机构
        String orgName= medicalOrganizationInfoDao.findOrgNameByCode(patient.get建档医疗机构组织机构());
        resultMap.put("建档医疗机构组织机构名称",orgName);

        //待产记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        ExpectanceRecord expectanceRecord = expectanceRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        expectanceRecord.set受孕形式(expectanceRecordDao.find受孕形式By受孕形式代码(expectanceRecord.get受孕形式代码()));
        expectanceRecord.set计划选取的分娩方式(expectanceRecordDao.find计划选取的分娩方式By计划选取的分娩方式代码(expectanceRecord.get计划选取的分娩方式代码()));
        expectanceRecord.set胎方位(expectanceRecordDao.find胎方位By胎方位代码(expectanceRecord.get胎方位代码()));
        expectanceRecord.set胎膜情况(expectanceRecordDao.find胎膜情况By胎膜情况代码(expectanceRecord.get胎膜情况代码()));
        expectanceRecord.set破膜方式(expectanceRecordDao.find破膜方式By破膜方式代码(expectanceRecord.get破膜方式代码()));
        expectanceRecord.set检查方式(expectanceRecordDao.find检查方式By检查方式代码(expectanceRecord.get检查方式代码()));
        resultMap.put("待产记录",expectanceRecord);

        return resultMap;
    }
}
