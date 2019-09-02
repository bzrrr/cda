package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.AnesthesiaRecordDao;
import com.arrcen.cdademo.dao.cdadao.PreanesthesiaVisitRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.PreanesthesiaVisitRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService10 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private PreanesthesiaVisitRecordDao preanesthesiaVisitRecordDao;

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

        //麻醉术前访视记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        PreanesthesiaVisitRecord preanesthesiaVisitRecord = preanesthesiaVisitRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        preanesthesiaVisitRecord.setABO血型(preanesthesiaVisitRecordDao.findABO血型名称ByABO血型代码(preanesthesiaVisitRecord.getABO血型代码()));
        preanesthesiaVisitRecord.setRH血型(preanesthesiaVisitRecordDao.findRH血型名称ByRH血型代码(preanesthesiaVisitRecord.getRH血型代码()));
        preanesthesiaVisitRecord.set拟实施手术及操作名称(preanesthesiaVisitRecordDao.find拟实施手术及操作名称By拟实施手术及操作编码(preanesthesiaVisitRecord.get拟实施手术及操作编码()));
        preanesthesiaVisitRecord.set拟实施麻醉方法名称(preanesthesiaVisitRecordDao.find拟实施麻醉方法名称By拟实施麻醉方法代码(preanesthesiaVisitRecord.get拟实施麻醉方法代码()));
        preanesthesiaVisitRecord.set术前诊断名称(preanesthesiaVisitRecordDao.find术前诊断名称By术前诊断编码(preanesthesiaVisitRecord.get术前诊断编码()));
        resultMap.put("麻醉术前访视记录",preanesthesiaVisitRecord);

        return resultMap;
    }
}
