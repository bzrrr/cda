package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.VaginalDeliveryRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.VaginalDeliveryRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService15 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private VaginalDeliveryRecordDao vaginalDeliveryRecordDao;

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

        //阴道分娩记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        VaginalDeliveryRecord vaginalDeliveryRecord = vaginalDeliveryRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        vaginalDeliveryRecord.set麻醉方法名称(vaginalDeliveryRecordDao.find麻醉方法名称By麻醉方法代码(vaginalDeliveryRecord.get麻醉方法代码()));
        vaginalDeliveryRecord.setAPGAR评分间隔时间(vaginalDeliveryRecordDao.findAPGAR评分间隔时间ByAPGAR评分间隔时间代码(vaginalDeliveryRecord.getAPGAR评分间隔时间代码()));
        vaginalDeliveryRecord.set会阴裂伤情况(vaginalDeliveryRecordDao.find会阴裂伤情况By会阴裂伤情况代码(vaginalDeliveryRecord.get会阴裂伤情况代码()));
        vaginalDeliveryRecord.set分娩结局(vaginalDeliveryRecordDao.find分娩结局By分娩结局代码(vaginalDeliveryRecord.get分娩结局代码()));
        vaginalDeliveryRecord.set新生儿性别(vaginalDeliveryRecordDao.find新生儿性别By新生儿性别代码(vaginalDeliveryRecord.get新生儿性别代码()));
        vaginalDeliveryRecord.set新生儿异常情况(vaginalDeliveryRecordDao.find新生儿异常情况By新生儿异常情况代码(vaginalDeliveryRecord.get新生儿异常情况代码()));
        vaginalDeliveryRecord.set胎方位(vaginalDeliveryRecordDao.find胎方位By胎方位代码(vaginalDeliveryRecord.get胎方位代码()));
        resultMap.put("阴道分娩记录",vaginalDeliveryRecord);

        return resultMap;
    }
}
