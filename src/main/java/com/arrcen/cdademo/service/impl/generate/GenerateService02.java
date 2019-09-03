package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.MJZRecordDao;
import com.arrcen.cdademo.dao.cdadao.MJZRecordDetailDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.MJZRecord;
import com.arrcen.cdademo.pojo.cdapojo.MJZRecordDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈门急诊病历〉
 */
@Service
public class GenerateService02 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MJZRecordDetailDao mjzRecordDetailDao;
    @Autowired
    private MJZRecordDao mjzRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        String patientHealthCardId = patient.get居民健康卡号();
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patientHealthCardId);
        String emergencyNumber = healthIncidentInfo.get门急诊号();

        //医疗卫生事件
        sourceMap.put("healthIncidentInfo", healthIncidentInfo);

        //门急诊信息
        MJZRecord mjzRecord = mjzRecordDao.findBy门急诊号(emergencyNumber);
        sourceMap.put("mjzRecord",mjzRecord);

        //门急诊病历医嘱详情
        MJZRecordDetail mjzRecordDetail = mjzRecordDetailDao.findBy电子申请单编号(emergencyNumber);
        sourceMap.put("mjzRecordDetail",mjzRecordDetail);
    }
}
