package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.InOutRecordDao;
import com.arrcen.cdademo.dao.cdadao.InOutRecordDetailDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.InOutRecord;
import com.arrcen.cdademo.pojo.cdapojo.InOutRecordDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈出入量记录〉
 */
@Service
public class GenerateService21 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private InOutRecordDetailDao inOutRecordDetailDao;
    @Autowired
    private InOutRecordDao inOutRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //出入量记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        InOutRecord inOutRecord = inOutRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        inOutRecord.set护理等级(inOutRecordDao.find护理等级By护理等级代码(inOutRecord.get护理等级代码()));
        inOutRecord.set护理类型(inOutRecordDao.find护理类型By护理类型代码(inOutRecord.get护理类型代码()));
        inOutRecord.set疾病诊断名称(inOutRecordDao.find疾病诊断名称By疾病诊断名称(inOutRecord.get疾病诊断编码()));
        sourceMap.put("inOutRecord",inOutRecord);

        //出入量记录药物明细
        InOutRecordDetail inOutRecordDetail = inOutRecordDetailDao.findBy单据序号(inOutRecord.get系统序号());
        inOutRecordDetail.set中药使用类别(inOutRecordDetailDao.find中药使用类别By中药使用类别代码(inOutRecordDetail.get中药使用类别代码()));
        inOutRecordDetail.set用药途径(inOutRecordDetailDao.find用药途径By用药途径代码(inOutRecordDetail.get用药途径代码()));
        sourceMap.put("inOutRecordDetail",inOutRecordDetail);
    }
}
