package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.InOutRecordDao;
import com.arrcen.cdademo.dao.cdadao.InOutRecordDetailDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.InOutRecord;
import com.arrcen.cdademo.pojo.cdapojo.InOutRecordDetail;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService21 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private InOutRecordDao inOutRecordDao;
    @Autowired
    private InOutRecordDetailDao inOutRecordDetailDao;

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

        //出入量记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        InOutRecord inOutRecord = inOutRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        inOutRecord.set护理等级(inOutRecordDao.find护理等级By护理等级代码(inOutRecord.get护理等级代码()));
        inOutRecord.set护理类型(inOutRecordDao.find护理类型By护理类型代码(inOutRecord.get护理类型代码()));
        inOutRecord.set疾病诊断名称(inOutRecordDao.find疾病诊断名称By疾病诊断名称(inOutRecord.get疾病诊断编码()));
        resultMap.put("出入量记录",inOutRecord);

        //出入量记录药物明细
        InOutRecordDetail inOutRecordDetail = inOutRecordDetailDao.findBy单据序号(inOutRecord.get系统序号());
        inOutRecordDetail.set中药使用类别(inOutRecordDetailDao.find中药使用类别By中药使用类别代码(inOutRecordDetail.get中药使用类别代码()));
        inOutRecordDetail.set用药途径(inOutRecordDetailDao.find用药途径By用药途径代码(inOutRecordDetail.get用药途径代码()));
        resultMap.put("出入量记录药物明细",inOutRecordDetail);


        return resultMap;
    }
}
