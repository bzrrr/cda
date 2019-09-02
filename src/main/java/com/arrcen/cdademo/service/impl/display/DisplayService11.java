package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.AnesthesiaRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.AnesthesiaRecord;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService11 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private AnesthesiaRecordDao anesthesiaRecordDao;

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

        //麻醉记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        AnesthesiaRecord anesthesiaRecord = anesthesiaRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        anesthesiaRecord.setABO血型名称(anesthesiaRecordDao.findABO血型名称ByABO血型代码(anesthesiaRecord.getABO血型代码()));
        anesthesiaRecord.setASA分级标准(anesthesiaRecordDao.findASA分级标准ByASA分级标准代码(anesthesiaRecord.getASA分级标准代码()));
        anesthesiaRecord.setRH血型名称(anesthesiaRecordDao.findRH血型名称ByRH血型代码(anesthesiaRecord.getRH血型代码()));
        anesthesiaRecord.set患者去向(anesthesiaRecordDao.find患者去向By患者去向代码(anesthesiaRecord.get患者去向代码()));
        anesthesiaRecord.set麻醉方法(anesthesiaRecordDao.find麻醉方法By麻醉方法代码(anesthesiaRecord.get麻醉方法代码()));
        anesthesiaRecord.set麻醉合并症标志(anesthesiaRecordDao.find麻醉合并症标志By麻醉合并症标志代码(anesthesiaRecord.get麻醉合并症标志代码()));
        anesthesiaRecord.set输血品种(anesthesiaRecordDao.find输血品种By输血品种代码(anesthesiaRecord.get输血品种代码()));
        anesthesiaRecord.set药物使用频次(anesthesiaRecordDao.find药物使用频次By药物使用频次代码(anesthesiaRecord.get药物使用频次代码()));
        anesthesiaRecord.set用药途径(anesthesiaRecordDao.find用药途径By用药途径代码(anesthesiaRecord.get用药途径代码()));
        anesthesiaRecord.set呼吸类型(anesthesiaRecordDao.find呼吸类型By呼吸类型代码(anesthesiaRecord.get呼吸类型代码()));
        anesthesiaRecord.set手术体位(anesthesiaRecordDao.find手术体位By手术体位代码(anesthesiaRecord.get手术体位代码()));
        anesthesiaRecord.set手术及操作名称(anesthesiaRecordDao.find手术及操作名称By手术及操作编码(anesthesiaRecord.get手术及操作编码()));
        anesthesiaRecord.set术前诊断名称(anesthesiaRecordDao.find术前诊断名称By术前诊断编码(anesthesiaRecord.get术前诊断编码()));
        anesthesiaRecord.set术后诊断名称(anesthesiaRecordDao.find术后诊断名称By术后诊断编码(anesthesiaRecord.get术后诊断编码()));
        resultMap.put("麻醉记录",anesthesiaRecord);

        return resultMap;



    }
}
