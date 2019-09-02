package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.DischargeAssessGuideRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.DischargeAssessGuideRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService25 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private DischargeAssessGuideRecordDao dischargeAssessGuideRecordDao;

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

        //出院评估与指导
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        DischargeAssessGuideRecord dischargeAssessGuideRecord = dischargeAssessGuideRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        dischargeAssessGuideRecord.set出院诊断名称(dischargeAssessGuideRecordDao.find出院诊断名称By出院诊断编码(dischargeAssessGuideRecord.get出院诊断编码()));
        dischargeAssessGuideRecord.set离院方式(dischargeAssessGuideRecordDao.find离院方式By离院方式代码(dischargeAssessGuideRecord.get离院方式代码()));
        dischargeAssessGuideRecord.set饮食情况(dischargeAssessGuideRecordDao.find饮食情况By饮食情况代码(dischargeAssessGuideRecord.get饮食情况代码()));
        dischargeAssessGuideRecord.set饮食指导(dischargeAssessGuideRecordDao.find饮食指导By饮食指导代码(dischargeAssessGuideRecord.get饮食指导代码()));
        dischargeAssessGuideRecord.set自理能力(dischargeAssessGuideRecordDao.find自理能力By自理能力代码(dischargeAssessGuideRecord.get自理能力代码()));
        resultMap.put("出院评估与指导",dischargeAssessGuideRecord);


        return resultMap;
    }
}
