package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.GeneralCareRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.GeneralCareRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService17 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private GeneralCareRecordDao generalCareRecordDao;

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

        //一般护理记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        GeneralCareRecord generalCareRecord = generalCareRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        generalCareRecord.set安全护理名称(generalCareRecordDao.find安全护理名称By安全护理代码(generalCareRecord.get安全护理代码()));
        generalCareRecord.set心理护理名称(generalCareRecordDao.find心理护理名称By心理护理代码(generalCareRecord.get心理护理代码()));
        generalCareRecord.set护理等级(generalCareRecordDao.find护理等级By护理等级代码(generalCareRecord.get护理等级代码()));
        generalCareRecord.set疾病诊断名称(generalCareRecordDao.find疾病诊断名称By疾病诊断名称(generalCareRecord.get疾病诊断编码()));
        generalCareRecord.set护理类型(generalCareRecordDao.find护理类型By护理类型代码(generalCareRecord.get护理类型代码()));
        generalCareRecord.set隔离种类(generalCareRecordDao.find隔离种类By隔离种类代码(generalCareRecord.get隔离种类代码()));
        generalCareRecord.set饮食情况(generalCareRecordDao.find饮食情况By饮食情况代码(generalCareRecord.get饮食情况代码()));
        generalCareRecord.set气管护理(generalCareRecordDao.find气管护理By气管护理代码(generalCareRecord.get气管护理代码()));
        generalCareRecord.set饮食指导(generalCareRecordDao.find饮食指导By饮食指导代码(generalCareRecord.get饮食指导代码()));
        resultMap.put("一般护理记录",generalCareRecord);

        return resultMap;
    }
}
