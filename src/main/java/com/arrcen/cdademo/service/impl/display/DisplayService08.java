package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.TreatmentRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.TreatmentRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService08 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private TreatmentRecordDao treatmentRecordDao;

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

        //治疗记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        TreatmentRecord treatmentRecord = treatmentRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        treatmentRecord.set中药使用类别(treatmentRecordDao.find中药使用类别By中药使用类别代码(treatmentRecord.get中药使用类别代码()));
        treatmentRecord.set用药途径(treatmentRecordDao.find用药途径By用药途径代码(treatmentRecord.get用药途径代码()));
        treatmentRecord.set疾病诊断名称(treatmentRecordDao.find疾病诊断名称By疾病诊断名称(treatmentRecord.get疾病诊断编码()));
        treatmentRecord.set药物使用频次(treatmentRecordDao.find用药频率By药物使用频次代码(treatmentRecord.get药物使用频次代码()));
        treatmentRecord.set随访周期建议(treatmentRecordDao.find随访周期建议By随访周期建议代码(treatmentRecord.get随访周期建议代码()));
        treatmentRecord.set随访方式(treatmentRecordDao.find随访方式By随访方式代码(treatmentRecord.get随访方式代码()));
        resultMap.put("治疗记录",treatmentRecord);

        return resultMap;
    }
}
