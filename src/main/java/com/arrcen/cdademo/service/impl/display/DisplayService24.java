package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.CarePlanRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.CarePlanRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService24 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private CarePlanRecordDao carePlanRecordDao;

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

        //护理计划
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        CarePlanRecord carePlanRecord = carePlanRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        carePlanRecord.set安全护理(carePlanRecordDao.find安全护理By安全护理代码(carePlanRecord.get安全护理代码()));
        carePlanRecord.set护理等级(carePlanRecordDao.find护理等级By护理等级代码(carePlanRecord.get护理等级代码()));
        carePlanRecord.set饮食指导(carePlanRecordDao.find饮食指导By饮食指导代码(carePlanRecord.get饮食指导代码()));
        carePlanRecord.set疾病诊断名称(carePlanRecordDao.find疾病诊断名称By疾病诊断编码(carePlanRecord.get疾病诊断编码()));
        carePlanRecord.set护理类型(carePlanRecordDao.find护理类型By护理类型代码(carePlanRecord.get护理类型代码()));
        carePlanRecord.set气管护理(carePlanRecordDao.find气管护理By气管护理代码(carePlanRecord.get气管护理代码()));
        resultMap.put("护理计划",carePlanRecord);


        return resultMap;
    }
}
