package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.XYPrescriptionDao;
import com.arrcen.cdademo.dao.cdadao.XYPrescriptionDetailDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.XYPrescription;
import com.arrcen.cdademo.pojo.cdapojo.XYPrescriptionDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈西医处方〉
 */
@Service
public class GenerateService04 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private XYPrescriptionDao xyPrescriptionDao;
    @Autowired
    private XYPrescriptionDetailDao xyPrescriptionDetailDao;

    public void addData(Map sourceMap, Patient patient) {

        //西药处方
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        XYPrescription xyPrescription = xyPrescriptionDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        sourceMap.put("xyPrescription",xyPrescription);
        String s = xyPrescription.get系统序号();
        //西医处方明细
        XYPrescriptionDetail xyPrescriptionDetail = xyPrescriptionDetailDao.findBy单据序号(s);
        xyPrescriptionDetail.set药物使用频次(xyPrescriptionDetailDao.find用药频率By药物使用频次代码(xyPrescriptionDetail.get药物使用频次代码()));
        xyPrescriptionDetail.set用药途径(xyPrescriptionDetailDao.find用药途径By用药途径代码(xyPrescriptionDetail.get用药途径代码()));
        xyPrescriptionDetail.set药物剂型值(xyPrescriptionDetailDao.find药物剂型值By药物剂型代码(xyPrescriptionDetail.get药物剂型代码()));
        sourceMap.put("xyPrescriptionDetail",xyPrescriptionDetail);

    }
}
