package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.CInpatientMedicalRecordHomepageDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.CInpatientMedicalRecordHomepage;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈中医住院病案首页〉
 */
@Service
public class DisplayService33 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private CInpatientMedicalRecordHomepageDao cInpatientMedicalRecordHomepageDao;

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

        //中医住院病案首页
        CInpatientMedicalRecordHomepage cInpatientMedicalRecordHomepage = cInpatientMedicalRecordHomepageDao.findBy居民健康卡号(patient.get居民健康卡号());
        cInpatientMedicalRecordHomepage.setABO血型(cInpatientMedicalRecordHomepageDao.findABO血型ByABO血型代码(cInpatientMedicalRecordHomepage.getABO血型代码()));
        cInpatientMedicalRecordHomepage.setRH血型(cInpatientMedicalRecordHomepageDao.findRH血型ByRH血型代码(cInpatientMedicalRecordHomepage.getRH血型代码()));
        cInpatientMedicalRecordHomepage.set入院途径(cInpatientMedicalRecordHomepageDao.find入院途径By入院途径代码(cInpatientMedicalRecordHomepage.get入院途径代码()));
        cInpatientMedicalRecordHomepage.set国籍(cInpatientMedicalRecordHomepageDao.find国籍By国籍代码(cInpatientMedicalRecordHomepage.get国籍代码()));
        cInpatientMedicalRecordHomepage.set医疗付费方式(cInpatientMedicalRecordHomepageDao.find医疗付费方式By医疗付费方式代码(cInpatientMedicalRecordHomepage.get医疗付费方式代码()));
        cInpatientMedicalRecordHomepage.set婚姻状况(cInpatientMedicalRecordHomepageDao.find婚姻状况By婚姻状况代码(cInpatientMedicalRecordHomepage.get婚姻状况代码()));
        cInpatientMedicalRecordHomepage.set实施临床路径标志(cInpatientMedicalRecordHomepageDao.find实施临床路径标志By实施临床路径标志代码(cInpatientMedicalRecordHomepage.get实施临床路径标志代码()));
        cInpatientMedicalRecordHomepage.set民族(cInpatientMedicalRecordHomepageDao.find民族名称By民族(cInpatientMedicalRecordHomepage.get民族()));
        cInpatientMedicalRecordHomepage.set性别(cInpatientMedicalRecordHomepageDao.find性别By性别代码(cInpatientMedicalRecordHomepage.get性别代码()));
        cInpatientMedicalRecordHomepage.set病案质量(cInpatientMedicalRecordHomepageDao.find病案质量By病案质量代码(cInpatientMedicalRecordHomepage.get病案质量代码()));
        cInpatientMedicalRecordHomepage.set损伤中毒的外部原因疾病(cInpatientMedicalRecordHomepageDao.find损伤中毒的外部原因疾病By损伤中毒的外部原因疾病编码(cInpatientMedicalRecordHomepage.get损伤中毒的外部原因疾病编码()));
        cInpatientMedicalRecordHomepage.set出院中医诊断_主病_入院病情(cInpatientMedicalRecordHomepageDao.find出院中医诊断_主病_入院病情By出院中医诊断_主病_入院病情代码(cInpatientMedicalRecordHomepage.get出院中医诊断_主病_入院病情代码()));
        cInpatientMedicalRecordHomepage.set出院中医诊断_主证_入院病情(cInpatientMedicalRecordHomepageDao.find出院中医诊断_主证_入院病情By出院中医诊断_主证_入院病情代码(cInpatientMedicalRecordHomepage.get出院中医诊断_主证_入院病情代码()));
        cInpatientMedicalRecordHomepage.set手术切口愈合等级(cInpatientMedicalRecordHomepageDao.find手术切口愈合等级By手术切口愈合等级代码(cInpatientMedicalRecordHomepage.get手术切口愈合等级代码()));
        cInpatientMedicalRecordHomepage.set病理诊断疾病(cInpatientMedicalRecordHomepageDao.find病理诊断疾病By病理诊断疾病编码(cInpatientMedicalRecordHomepage.get病理诊断疾病编码()));
        cInpatientMedicalRecordHomepage.set治疗类别(cInpatientMedicalRecordHomepageDao.find治疗类别By治疗类别代码(cInpatientMedicalRecordHomepage.get治疗类别代码()));
        cInpatientMedicalRecordHomepage.set手术切口类别(cInpatientMedicalRecordHomepageDao.find手术切口类别By手术切口类别代码(cInpatientMedicalRecordHomepage.get手术切口类别代码()));
        cInpatientMedicalRecordHomepage.set手术级别(cInpatientMedicalRecordHomepageDao.find手术级别By手术级别代码(cInpatientMedicalRecordHomepage.get手术级别代码()));
        cInpatientMedicalRecordHomepage.set麻醉方式(cInpatientMedicalRecordHomepageDao.find麻醉方式By麻醉方式代码(cInpatientMedicalRecordHomepage.get麻醉方式代码()));
        cInpatientMedicalRecordHomepage.set离院方式(cInpatientMedicalRecordHomepageDao.find离院方式By离院方式代码(cInpatientMedicalRecordHomepage.get离院方式代码()));
        cInpatientMedicalRecordHomepage.set职业类别(cInpatientMedicalRecordHomepageDao.find职业类别By职业类别代码(cInpatientMedicalRecordHomepage.get职业类别代码()));
        cInpatientMedicalRecordHomepage.set门急诊诊断中医诊断病名名称(cInpatientMedicalRecordHomepageDao.find门急诊诊断中医诊断病名名称By门急诊诊断中医诊断病名代码(cInpatientMedicalRecordHomepage.get门急诊诊断中医诊断病名编码()));
        cInpatientMedicalRecordHomepage.set联系人与患者的关系(cInpatientMedicalRecordHomepageDao.find联系人与患者的关系By联系人与患者的关系代码(cInpatientMedicalRecordHomepage.get联系人与患者的关系代码()));
        cInpatientMedicalRecordHomepage.set门急诊诊断西医诊断疾病名称(cInpatientMedicalRecordHomepageDao.find门急诊诊断西医诊断疾病名称By门急诊诊断西医诊断疾病编码(cInpatientMedicalRecordHomepage.get门急诊诊断西医诊断疾病编码()));
        cInpatientMedicalRecordHomepage.set出院西医诊断_其他诊断疾病名称(cInpatientMedicalRecordHomepageDao.find出院西医诊断_其他诊断疾病名称By出院西医诊断_其他诊断疾病编码(cInpatientMedicalRecordHomepage.get出院西医诊断_其他诊断疾病编码()));
        cInpatientMedicalRecordHomepage.set出院西医诊断_主要诊断疾病名称(cInpatientMedicalRecordHomepageDao.find出院西医诊断_主要诊断疾病名称By出院西医诊断_主要诊断疾病编码(cInpatientMedicalRecordHomepage.get出院西医诊断_主要诊断疾病编码()));
        resultMap.put("中医住院病案首页",cInpatientMedicalRecordHomepage);

        return resultMap;
    }
}
