package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.ZYPrescriptionDao;
import com.arrcen.cdademo.dao.cdadao.ZYPrescriptionDetailDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.ZYPrescription;
import com.arrcen.cdademo.pojo.cdapojo.ZYPrescriptionDetail;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 *
 */
@Service
public class DisplayService05 extends CDAdisplayBaseServiceImpl {
    @Autowired
    private PatientDao patientDao;
    @Autowired
    private ZYPrescriptionDao zyPrescriptionDao;
    @Autowired
    private ZYPrescriptionDetailDao zyPrescriptionDetailDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
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
        //中药处方
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        ZYPrescription zyPrescription = zyPrescriptionDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        zyPrescription.set中医病名名称(zyPrescriptionDao.find中医病名名称By中医病名代码(zyPrescription.get中医病名代码()));
        zyPrescription.set中医证候名称(zyPrescriptionDao.find中医证候名称By中医证候代码(zyPrescription.get中医证候名称()));
        zyPrescription.set西医诊断名称(zyPrescriptionDao.find西医诊断名称By西医诊断编码(zyPrescription.get西医诊断编码()));
        zyPrescription.set处方类别(zyPrescriptionDao.find处方类别By处方类别代码(zyPrescription.get处方类别代码()));
        resultMap.put("中药处方",zyPrescription);
        //中药处方详情
        ZYPrescriptionDetail zyPrescriptionDetail = zyPrescriptionDetailDao.findBy单据序号(zyPrescription.get系统序号());
        zyPrescriptionDetail.set用药途径(zyPrescriptionDetailDao.find用药途径By用药途径代码(zyPrescriptionDetail.get用药途径代码()));
        zyPrescriptionDetail.set药物使用频次(zyPrescriptionDetailDao.find用药频率By药物使用频次代码(zyPrescriptionDetail.get药物使用频次代码()));
        zyPrescriptionDetail.set药物剂型值(zyPrescriptionDetailDao.find药物剂型值By药物剂型代码(zyPrescriptionDetail.get药物剂型代码()));
        resultMap.put("中药处方详情",zyPrescriptionDetail);

        return resultMap;
    }
}
