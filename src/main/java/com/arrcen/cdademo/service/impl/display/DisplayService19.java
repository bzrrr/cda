package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.SurgicalCareRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.SurgicalCareRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService19 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private SurgicalCareRecordDao surgicalCareRecordDao;

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

        //手术护理记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        SurgicalCareRecord surgicalCareRecord = surgicalCareRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        surgicalCareRecord.setABO血型(surgicalCareRecordDao.findABO血型名称ByABO血型代码(surgicalCareRecord.getABO血型代码()));
        surgicalCareRecord.setRH血型(surgicalCareRecordDao.findRH血型名称ByRH血型代码(surgicalCareRecord.getRH血型代码()));
        surgicalCareRecord.set手术及操作名称(surgicalCareRecordDao.find手术及操作名称By手术及操作编码(surgicalCareRecord.get手术及操作编码()));
        surgicalCareRecord.set护理等级(surgicalCareRecordDao.find护理等级By护理等级代码(surgicalCareRecord.get护理等级代码()));
        surgicalCareRecord.set护理类型(surgicalCareRecordDao.find护理类型By护理类型代码(surgicalCareRecord.get护理类型代码()));
        surgicalCareRecord.set术前诊断名称(surgicalCareRecordDao.find术前诊断名称By术前诊断编码(surgicalCareRecord.get术前诊断编码()));
        resultMap.put("手术护理记录",surgicalCareRecord);

        return resultMap;
    }
}
