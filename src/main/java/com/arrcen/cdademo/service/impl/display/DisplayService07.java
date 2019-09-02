package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.TestRecordDao;
import com.arrcen.cdademo.dao.cdadao.TestRecordDetailDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.TestRecord;
import com.arrcen.cdademo.pojo.cdapojo.TestRecordDetail;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService07 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private TestRecordDao testRecordDao;
    @Autowired
    private TestRecordDetailDao testRecordDetailDao;

    @Override
    public Map<String, Object> getInfo(PatientCdaDocument patientCdaDocument) {
        Map resultMap = Maps.newHashMap();

        //文档信息
        DocInfo docInfo = new DocInfo();
        docInfo.setDocId(patientCdaDocument.getDocid());
        docInfo.setEffectiveTime(patientCdaDocument.getEffectivetime());
        resultMap.put("文档信息",docInfo);

        //患者基本信息
        Patient patient = patientDao.findPatientBy患者身份证件号码(patientCdaDocument.getPatientid());
        patient.set性别(patientDao.find性别By性别代码(patient.get性别代码()));
        resultMap.put("患者基本信息",patient);
        //机构名称
        String orgName = medicalOrganizationInfoDao.findOrgNameByCode(patient.get建档医疗机构组织机构());
        resultMap.put("建档医疗机构组织机构名称",orgName);

        //检验报告
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        TestRecord testRecord = testRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        testRecord.set患者类型名称(testRecordDao.find患者类型By患者类型代码(testRecord.get患者类型代码()));
        testRecord.set疾病诊断名称(testRecordDao.find疾病诊断名称By疾病诊断名称(testRecord.get疾病诊断编码()));
        resultMap.put("检验报告",testRecord);
        //检验报告明细
        TestRecordDetail testRecordDetail = testRecordDetailDao.findBy单据序号(testRecord.get系统序号());
        testRecordDetail.set检验结果(testRecordDetailDao.find检验结果By检验结果代码(testRecordDetail.get检验结果代码()));
        resultMap.put("检验报告明细",testRecordDetail);

        return resultMap;
    }
}
