package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.StageSummaryDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.StageSummary;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈阶段小结〉
 */
@Service
public class DisplayService43 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private StageSummaryDao stageSummaryDao;
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

        //阶段小结
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        StageSummary stageSummary = stageSummaryDao.findBy住院号(healthIncidentInfo.get住院号());
        stageSummary.set性别(stageSummaryDao.find性别By性别代码(stageSummary.get性别代码()));
        stageSummary.set入院诊断_中医病名名称(stageSummaryDao.find入院诊断_中医病名名称By入院诊断_中医病名代码(stageSummary.get入院诊断_中医病名代码()));
        stageSummary.set入院诊断_西医诊断名称(stageSummaryDao.find入院诊断_西医诊断名称By入院诊断_西医诊断编码(stageSummary.get入院诊断_西医诊断编码()));
        stageSummary.set入院诊断_中医证候名称(stageSummaryDao.find入院诊断_中医证候名称By入院诊断_中医证候代码(stageSummary.get入院诊断_中医证候代码()));
        stageSummary.set目前诊断_西医诊断名称(stageSummaryDao.find目前诊断_西医诊断名称By目前诊断_西医诊断编码(stageSummary.get目前诊断_西医诊断编码()));
        stageSummary.set目前诊断_中医证候名称(stageSummaryDao.find目前诊断_中医证候名称By目前诊断_中医证候代码(stageSummary.get目前诊断_中医证候代码()));
        stageSummary.set目前诊断_中医病名名称(stageSummaryDao.find目前诊断_中医病名名称By目前诊断_中医病名代码(stageSummary.get目前诊断_中医病名代码()));
        resultMap.put("阶段小结",stageSummary);


        return resultMap;
    }
}
