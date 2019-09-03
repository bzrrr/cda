package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.FirstPostoperativeCourseRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.FirstPostoperativeCourseRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈术后首次病程记录〉
 */
@Service
public class GenerateService48 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private FirstPostoperativeCourseRecordDao firstPostoperativeCourseRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //术后首次病程记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        FirstPostoperativeCourseRecord firstPostoperativeCourseRecord = firstPostoperativeCourseRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        firstPostoperativeCourseRecord.set性别(firstPostoperativeCourseRecordDao.find性别By性别代码(firstPostoperativeCourseRecord.get性别代码()));
        firstPostoperativeCourseRecord.set手术及操作名称(firstPostoperativeCourseRecordDao.find手术及操作名称By手术及操作编码(firstPostoperativeCourseRecord.get手术及操作编码()));
        sourceMap.put("firstPostoperativeCourseRecord",firstPostoperativeCourseRecord);

    }
}
