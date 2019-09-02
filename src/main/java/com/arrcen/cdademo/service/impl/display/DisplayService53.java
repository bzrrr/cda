package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.DischargeSummaryDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.DischargeSummary;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈出院小结〉
 */
@Service
public class DisplayService53 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private DischargeSummaryDao dischargeSummaryDao;

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

        //出院小结记录
        DischargeSummary dischargeSummary = dischargeSummaryDao.findBy居民健康卡号(patient.get居民健康卡号());
        dischargeSummary.set性别(dischargeSummaryDao.find性别By性别代码(dischargeSummary.get性别代码()));
        dischargeSummary.set婚姻状况(dischargeSummaryDao.find婚姻状况By婚姻状况代码(dischargeSummary.get婚姻状况代码()));
        dischargeSummary.set职业类别名称(dischargeSummaryDao.find职业类别名称By职业类别代码(dischargeSummary.get职业类别代码()));
        dischargeSummary.set手术切口愈合等级(dischargeSummaryDao.find手术切口愈合等级By手术切口愈合等级代码(dischargeSummary.get手术切口愈合等级代码()));
        dischargeSummary.set麻醉方法名称(dischargeSummaryDao.find麻醉方法名称By麻醉方法代码(dischargeSummary.get麻醉方法代码()));
        resultMap.put("出院小结记录",dischargeSummary);

        return resultMap;
    }
}
