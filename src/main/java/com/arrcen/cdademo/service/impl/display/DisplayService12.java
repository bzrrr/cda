package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.PostanesthesiaVisitRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.PostanesthesiaVisitRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService12 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private PostanesthesiaVisitRecordDao postanesthesiaVisitRecordDao;

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

        //麻醉术后访视记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        PostanesthesiaVisitRecord postanesthesiaVisitRecord = postanesthesiaVisitRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        postanesthesiaVisitRecord.setABO血型(postanesthesiaVisitRecordDao.findABO血型名称ByABO血型代码(postanesthesiaVisitRecord.getABO血型代码()));
        postanesthesiaVisitRecord.setRH血型(postanesthesiaVisitRecordDao.findRH血型名称ByRH血型代码(postanesthesiaVisitRecord.getRH血型代码()));
        postanesthesiaVisitRecord.set麻醉方法名称(postanesthesiaVisitRecordDao.find麻醉方法By麻醉方法代码(postanesthesiaVisitRecord.get麻醉方法代码()));
        postanesthesiaVisitRecord.set术后诊断名称(postanesthesiaVisitRecordDao.find术后诊断名称By术后诊断编码(postanesthesiaVisitRecord.get术后诊断编码()));
        postanesthesiaVisitRecord.set术前诊断名称(postanesthesiaVisitRecordDao.find术前诊断名称By术前诊断编码(postanesthesiaVisitRecord.get术前诊断编码()));
        postanesthesiaVisitRecord.set手术及操作名称(postanesthesiaVisitRecordDao.find手术及操作名称By手术及操作编码(postanesthesiaVisitRecord.get手术及操作编码()));
        resultMap.put("麻醉术后访视记录",postanesthesiaVisitRecord);

        return resultMap;
    }
}
