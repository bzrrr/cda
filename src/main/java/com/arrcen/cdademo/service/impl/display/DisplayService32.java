package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.InpatientMedicalRecordHomepageDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.InpatientMedicalRecordHomepage;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈住院病案首页〉
 */
@Service
public class DisplayService32 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private InpatientMedicalRecordHomepageDao inpatientMedicalRecordHomepageDao;

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

        //住院病案首页
        InpatientMedicalRecordHomepage inpatientMedicalRecordHomepage = inpatientMedicalRecordHomepageDao.findBy居民健康卡号(patient.get居民健康卡号());
        inpatientMedicalRecordHomepage.setABO血型(inpatientMedicalRecordHomepageDao.findABO血型ByABO血型代码(inpatientMedicalRecordHomepage.getABO血型代码()));
        inpatientMedicalRecordHomepage.setRH血型(inpatientMedicalRecordHomepageDao.findRH血型ByRH血型代码(inpatientMedicalRecordHomepage.getRH血型代码()));
        inpatientMedicalRecordHomepage.set入院途径(inpatientMedicalRecordHomepageDao.find入院途径By入院途径代码(inpatientMedicalRecordHomepage.get入院途径代码()));
        inpatientMedicalRecordHomepage.set出院诊断_主要诊断入院病情(inpatientMedicalRecordHomepageDao.find出院诊断_主要诊断入院病情By出院诊断_主要诊断入院病情代码(inpatientMedicalRecordHomepage.get出院诊断_主要诊断入院病情代码()));
        inpatientMedicalRecordHomepage.set出院诊断_主要诊断名称(inpatientMedicalRecordHomepageDao.find出院诊断_主要诊断疾病名称By出院诊断_主要诊断疾病编码(inpatientMedicalRecordHomepage.get出院诊断_主要诊断疾病编码()));
        inpatientMedicalRecordHomepage.set出院诊断_其他诊断入院病情(inpatientMedicalRecordHomepageDao.find出院诊断_其他诊断入院病情By出院诊断_其他诊断入院病情代码(inpatientMedicalRecordHomepage.get出院诊断_其他诊断入院病情代码()));
        inpatientMedicalRecordHomepage.set医疗付费方式(inpatientMedicalRecordHomepageDao.find医疗付费方式By医疗付费方式代码(inpatientMedicalRecordHomepage.get医疗付费方式代码()));
        inpatientMedicalRecordHomepage.set国籍(inpatientMedicalRecordHomepageDao.find国籍By国籍代码(inpatientMedicalRecordHomepage.get国籍代码()));
        inpatientMedicalRecordHomepage.set婚姻状况(inpatientMedicalRecordHomepageDao.find婚姻状况By婚姻状况代码(inpatientMedicalRecordHomepage.get婚姻状况代码()));
        inpatientMedicalRecordHomepage.set性别(inpatientMedicalRecordHomepageDao.find性别By性别代码(inpatientMedicalRecordHomepage.get性别代码()));
        inpatientMedicalRecordHomepage.set手术切口愈合等级(inpatientMedicalRecordHomepageDao.find手术切口愈合等级By手术切口愈合等级代码(inpatientMedicalRecordHomepage.get手术切口愈合等级代码()));
        inpatientMedicalRecordHomepage.set损伤中毒的外部原因疾病名称(inpatientMedicalRecordHomepageDao.find损伤中毒的外部原因疾病名称By损伤中毒的外部原因疾病编码(inpatientMedicalRecordHomepage.get损伤中毒的外部原因疾病编码()));
        inpatientMedicalRecordHomepage.set手术切口类别(inpatientMedicalRecordHomepageDao.find手术切口类别By手术切口类别代码(inpatientMedicalRecordHomepage.get手术切口类别代码()));
        inpatientMedicalRecordHomepage.set民族名称(inpatientMedicalRecordHomepageDao.find民族名称By民族(inpatientMedicalRecordHomepage.get民族()));
        inpatientMedicalRecordHomepage.set病案质量(inpatientMedicalRecordHomepageDao.find病案质量By病案质量代码(inpatientMedicalRecordHomepage.get病案质量代码()));
        inpatientMedicalRecordHomepage.set病理诊断疾病名称(inpatientMedicalRecordHomepageDao.find病理诊断疾病名称By病理诊断疾病编码(inpatientMedicalRecordHomepage.get病理诊断疾病编码()));
        inpatientMedicalRecordHomepage.set离院方式(inpatientMedicalRecordHomepageDao.find离院方式By离院方式代码(inpatientMedicalRecordHomepage.get离院方式代码()));
        inpatientMedicalRecordHomepage.set手术级别(inpatientMedicalRecordHomepageDao.find手术级别By手术级别代码(inpatientMedicalRecordHomepage.get手术级别代码()));
        inpatientMedicalRecordHomepage.set职业类别(inpatientMedicalRecordHomepageDao.find职业类别By职业类别代码(inpatientMedicalRecordHomepage.get职业类别代码()));
        inpatientMedicalRecordHomepage.set联系人与患者的关系(inpatientMedicalRecordHomepageDao.find联系人与患者的关系By联系人与患者的关系代码(inpatientMedicalRecordHomepage.get联系人与患者的关系代码()));
        inpatientMedicalRecordHomepage.set麻醉方式(inpatientMedicalRecordHomepageDao.find麻醉方式By麻醉方式代码(inpatientMedicalRecordHomepage.get麻醉方式代码()));
        inpatientMedicalRecordHomepage.set门急诊诊断疾病名称(inpatientMedicalRecordHomepageDao.find门急诊诊断疾病名称By门急诊诊断疾病编码(inpatientMedicalRecordHomepage.get门急诊诊断疾病编码()));
        resultMap.put("住院病案首页",inpatientMedicalRecordHomepage);


        return resultMap;
    }
}
