package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.InspectionRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.InspectionRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService06 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private InspectionRecordDao inspectionRecordDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;

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

        //检查报告
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        InspectionRecord inspectionRecord = inspectionRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        inspectionRecord.set患者类型(inspectionRecordDao.find患者类型By患者类型代码(inspectionRecord.get患者类型代码()));
        inspectionRecord.set疾病诊断名称(inspectionRecordDao.find疾病诊断名称By疾病诊断编码(inspectionRecord.get疾病诊断编码()));
        inspectionRecord.set检查结果(inspectionRecordDao.find检查结果By检查结果代码(inspectionRecord.get检查结果代码()));
        resultMap.put("检查报告",inspectionRecord);

        return resultMap;
    }
}
