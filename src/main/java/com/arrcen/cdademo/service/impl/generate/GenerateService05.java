package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.ZYPrescriptionDao;
import com.arrcen.cdademo.dao.cdadao.ZYPrescriptionDetailDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.ZYPrescription;
import com.arrcen.cdademo.pojo.cdapojo.ZYPrescriptionDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈中医处方〉
 */
@Service
public class GenerateService05 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private ZYPrescriptionDetailDao zyPrescriptionDetailDao;
    @Autowired
    private ZYPrescriptionDao zyPrescriptionDao;

    public void addData(Map sourceMap, Patient patient) {

        //中药处方
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        ZYPrescription zyPrescription = zyPrescriptionDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        zyPrescription.set中医病名名称(zyPrescriptionDao.find中医病名名称By中医病名代码(zyPrescription.get中医病名代码()));
        zyPrescription.set中医证候名称(zyPrescriptionDao.find中医证候名称By中医证候代码(zyPrescription.get中医证候名称()));
        zyPrescription.set西医诊断名称(zyPrescriptionDao.find西医诊断名称By西医诊断编码(zyPrescription.get西医诊断编码()));
        zyPrescription.set处方类别(zyPrescriptionDao.find处方类别By处方类别代码(zyPrescription.get处方类别代码()));
        sourceMap.put("zyPrescription",zyPrescription);

        //中药处方详情
        ZYPrescriptionDetail zyPrescriptionDetail = zyPrescriptionDetailDao.findBy单据序号(zyPrescription.get系统序号());
        zyPrescriptionDetail.set用药途径(zyPrescriptionDetailDao.find用药途径By用药途径代码(zyPrescriptionDetail.get用药途径代码()));
        zyPrescriptionDetail.set药物使用频次(zyPrescriptionDetailDao.find用药频率By药物使用频次代码(zyPrescriptionDetail.get药物使用频次代码()));
        zyPrescriptionDetail.set药物剂型值(zyPrescriptionDetailDao.find药物剂型值By药物剂型代码(zyPrescriptionDetail.get药物剂型代码()));
        sourceMap.put("zyPrescriptionDetail",zyPrescriptionDetail);

    }
}
