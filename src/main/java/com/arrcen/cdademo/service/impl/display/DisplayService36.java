package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.AdmissionDeathRecord24HDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.AdmissionDeathRecord24H;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈24H内入院死亡记录〉
 */
@Service
public class DisplayService36 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private AdmissionDeathRecord24HDao admissionDeathRecord24HDao;

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

        //24H内入院死亡记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        AdmissionDeathRecord24H admissionDeathRecord24H = admissionDeathRecord24HDao.findBy住院号(healthIncidentInfo.get住院号());
        admissionDeathRecord24H.set民族(admissionDeathRecord24HDao.find民族名称By民族(admissionDeathRecord24H.get民族()));
        admissionDeathRecord24H.set性别(admissionDeathRecord24HDao.find性别By性别代码(admissionDeathRecord24H.get性别代码()));
        admissionDeathRecord24H.set职业类别(admissionDeathRecord24HDao.find职业类别By职业类别代码(admissionDeathRecord24H.get职业类别代码()));
        admissionDeathRecord24H.set陈述者与患者的关系(admissionDeathRecord24HDao.find陈述者与患者的关系(admissionDeathRecord24H.get陈述者与患者的关系代码()));
        admissionDeathRecord24H.set婚姻状况(admissionDeathRecord24HDao.find婚姻状况By婚姻状况代码(admissionDeathRecord24H.get婚姻状况代码()));
        resultMap.put("24H内入院死亡记录",admissionDeathRecord24H);


        return resultMap;
    }
}
