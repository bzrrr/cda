package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.ResidentDoctorDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.ResidentDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈住院医嘱〉
 */
@Service
public class GenerateService52 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private ResidentDoctorDao residentDoctorDao;

    public void addData(Map sourceMap, Patient patient) {

        //住院医嘱
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        ResidentDoctor residentDoctor = residentDoctorDao.findBy住院号(healthIncidentInfo.get住院号());
        residentDoctor.set医嘱类别名称(residentDoctorDao.find医嘱类别名称By医嘱类别代码(residentDoctor.get医嘱类别代码()));
        residentDoctor.set医嘱项目类型名称(residentDoctorDao.find医嘱项目类型名称By医嘱项目类型代码(residentDoctor.get医嘱项目类型代码()));
        residentDoctor.set性别(residentDoctorDao.find性别By性别代码(residentDoctor.get性别代码()));
        sourceMap.put("residentDoctor",residentDoctor);
    }
}
