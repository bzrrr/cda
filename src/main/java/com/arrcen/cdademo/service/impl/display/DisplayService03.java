package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.*;
import com.arrcen.cdademo.dao.cdadao.EmergencyMedicalRecordDao;
import com.arrcen.cdademo.dao.cdadao.EmergencyMedicalRecordDetailDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.EmergencyMedicalRecord;
import com.arrcen.cdademo.pojo.cdapojo.EmergencyMedicalRecordDetail;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈〉
 *
 */
@Service
public class DisplayService03 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private EmergencyMedicalRecordDao emergencyMedicalRecordDao;
    @Autowired
    private EmergencyMedicalRecordDetailDao emergencyMedicalRecordDetailDao;


    @Override
    public Map<String,Object> getInfo(PatientCdaDocument patientCdaDocument) {
        Map<String, Object> resultMap = new HashMap<>();
        Patient patient = patientDao.findPatientBy患者身份证件号码(patientCdaDocument.getPatientid());

        //文档信息
        DocInfo docInfo = new DocInfo();
        docInfo.setDocId(patientCdaDocument.getDocid());
        docInfo.setEffectiveTime(patientCdaDocument.getEffectivetime());
        resultMap.put("文档信息",docInfo);

        //患者基本信息 代码与实际含义的关系映射
        patient.set性别(patientDao.find性别By性别代码(patient.get性别代码()));
        resultMap.put("患者基本信息",patient);

        //医疗组织机构名称
        String organizationId = patient.get建档医疗机构组织机构();
        String orgName= medicalOrganizationInfoDao.findOrgNameByCode(organizationId);
        resultMap.put("建档医疗机构组织机构名称",orgName);

        //居民健康卡号
        String patientHealthCardId = patient.get居民健康卡号();

        //卫生事件
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patientHealthCardId);

        //门急诊号
        String emergencyNumber = healthIncidentInfo.get门急诊号();

        //急诊留观病历
        EmergencyMedicalRecord emRecord = emergencyMedicalRecordDao.findBy门急诊号(emergencyNumber);
        resultMap.put("急诊留观病历",emRecord);

        //急诊留观病历医嘱详情 -> 假定电子申请单号==门急诊号
        EmergencyMedicalRecordDetail emRecordDetail = emergencyMedicalRecordDetailDao.findBy电子申请单编号(emergencyNumber);
        resultMap.put("急诊留观病历医嘱明细",emRecordDetail);

        return resultMap;
    }
}
