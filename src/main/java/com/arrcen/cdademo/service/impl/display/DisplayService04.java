package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.XYPrescriptionDao;
import com.arrcen.cdademo.dao.cdadao.XYPrescriptionDetailDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.XYPrescription;
import com.arrcen.cdademo.pojo.cdapojo.XYPrescriptionDetail;
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
public class DisplayService04 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private XYPrescriptionDao xyPrescriptionDao;
    @Autowired
    private XYPrescriptionDetailDao xyPrescriptionDetailDao;

    @Override
    public Map<String, Object> getInfo(PatientCdaDocument patientCdaDocument) {

       Map resultMap =  Maps.newHashMap();
        //文档信息
        DocInfo docInfo = new DocInfo();
        docInfo.setDocId(patientCdaDocument.getDocid());
        docInfo.setEffectiveTime(patientCdaDocument.getEffectivetime());
        resultMap.put("文档信息",docInfo);

        //患者基本信息
        Patient patient = patientDao.findPatientBy患者身份证件号码(patientCdaDocument.getPatientid());
        patient.set性别(patientDao.find性别By性别代码(patient.get性别代码()));
        resultMap.put("患者基本信息",patient);

        //医疗机构名称
        String orgName = medicalOrganizationInfoDao.findOrgNameByCode(patient.get建档医疗机构组织机构());
        resultMap.put("建档医疗机构组织机构名称", orgName);
        //西药处方
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        XYPrescription xyPrescription = xyPrescriptionDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        resultMap.put("西药处方",xyPrescription);
        //西医处方明细
        XYPrescriptionDetail xyPrescriptionDetail = xyPrescriptionDetailDao.findBy单据序号(xyPrescription.get系统序号());
        xyPrescriptionDetail.set药物使用频次(xyPrescriptionDetailDao.find用药频率By药物使用频次代码(xyPrescriptionDetail.get药物使用频次代码()));
        xyPrescriptionDetail.set用药途径(xyPrescriptionDetailDao.find用药途径By用药途径代码(xyPrescriptionDetail.get用药途径代码()));
        xyPrescriptionDetail.set药物剂型值(xyPrescriptionDetailDao.find药物剂型值By药物剂型代码(xyPrescriptionDetail.get药物剂型代码()));
        resultMap.put("西药处方明细",xyPrescriptionDetail);

        return resultMap;
    }
}
