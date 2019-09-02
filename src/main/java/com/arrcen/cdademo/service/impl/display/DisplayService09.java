package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.GeneralSurgicalRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.GeneralSurgicalRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService09 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private GeneralSurgicalRecordDao generalSurgicalRecordDao;

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

        //一般手术记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        GeneralSurgicalRecord generalSurgicalRecord = generalSurgicalRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        generalSurgicalRecord.set手术体位名称(generalSurgicalRecordDao.find手术体位名称By手术体位代码(generalSurgicalRecord.get手术体位代码()));
        generalSurgicalRecord.set麻醉方法(generalSurgicalRecordDao.find麻醉方法By麻醉方法代码(generalSurgicalRecord.get麻醉方法代码()));
        generalSurgicalRecord.set手术级别(generalSurgicalRecordDao.find手术级别By手术级别代码(generalSurgicalRecord.get手术级别代码()));
        generalSurgicalRecord.set术前诊断名称(generalSurgicalRecordDao.find术前诊断名称By术前诊断编码(generalSurgicalRecord.get术前诊断编码()));
        generalSurgicalRecord.set术后诊断名称(generalSurgicalRecordDao.find术后诊断名称By术后诊断编码(generalSurgicalRecord.get术后诊断编码()));
        resultMap.put("一般手术记录",generalSurgicalRecord);

        return resultMap;
    }
}
