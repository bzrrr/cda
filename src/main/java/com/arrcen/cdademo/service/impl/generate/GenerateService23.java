package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.AdmissionEvaluationRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.AdmissionEvaluationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈入院评估〉
 */
@Service
public class GenerateService23 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private AdmissionEvaluationRecordDao admissionEvaluationRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //入院评估记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        AdmissionEvaluationRecord admissionEvaluationRecord = admissionEvaluationRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        admissionEvaluationRecord.set吸烟状况(admissionEvaluationRecordDao.find吸烟状况By吸烟状况代码(admissionEvaluationRecord.get吸烟状况代码()));
        admissionEvaluationRecord.set入院诊断名称(admissionEvaluationRecordDao.find入院诊断名称By入院诊断编码(admissionEvaluationRecord.get入院诊断编码()));
        admissionEvaluationRecord.set入院途径(admissionEvaluationRecordDao.find入院途径By入院途径代码(admissionEvaluationRecord.get入院途径代码()));
        admissionEvaluationRecord.set国籍(admissionEvaluationRecordDao.find国籍By国籍代码(admissionEvaluationRecord.get国籍代码()));
        admissionEvaluationRecord.set职业类别(admissionEvaluationRecordDao.find职业类别By职业类别代码(admissionEvaluationRecord.get职业类别代码()));
        admissionEvaluationRecord.set心理状态(admissionEvaluationRecordDao.find心理状态By心理状态代码(admissionEvaluationRecord.get心理状态代码()));
        admissionEvaluationRecord.set饮酒频率(admissionEvaluationRecordDao.find饮酒频率By饮酒频率代码(admissionEvaluationRecord.get饮酒频率代码()));
        admissionEvaluationRecord.set饮食情况(admissionEvaluationRecordDao.find饮食情况By饮食情况代码(admissionEvaluationRecord.get饮食情况代码()));
        admissionEvaluationRecord.set营养状态(admissionEvaluationRecordDao.find营养状态By营养状态代码(admissionEvaluationRecord.get营养状态代码()));
        admissionEvaluationRecord.set发育程度(admissionEvaluationRecordDao.find发育程度By发育程度代码(admissionEvaluationRecord.get发育程度代码()));
        admissionEvaluationRecord.set学历(admissionEvaluationRecordDao.find学历By学历代码(admissionEvaluationRecord.get学历代码()));
        admissionEvaluationRecord.set自理能力(admissionEvaluationRecordDao.find自理能力By自理能力代码(admissionEvaluationRecord.get自理能力代码()));
        sourceMap.put("admissionEvaluationRecord",admissionEvaluationRecord);
    }
}
