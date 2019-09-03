package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.cdadao.DischargeAssessGuideRecordDao;
import com.arrcen.cdademo.dao.cdadao.DischargeSummaryDao;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.DischargeSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈出院小结〉
 */
@Service
public class GenerateService53 {

    @Autowired
    private DischargeSummaryDao dischargeSummaryDao;

    public void addData(Map sourceMap, Patient patient) {

        //出院小结记录
        DischargeSummary dischargeSummary = dischargeSummaryDao.findBy居民健康卡号(patient.get居民健康卡号());
        dischargeSummary.set性别(dischargeSummaryDao.find性别By性别代码(dischargeSummary.get性别代码()));
        dischargeSummary.set婚姻状况(dischargeSummaryDao.find婚姻状况By婚姻状况代码(dischargeSummary.get婚姻状况代码()));
        dischargeSummary.set职业类别名称(dischargeSummaryDao.find职业类别名称By职业类别代码(dischargeSummary.get职业类别代码()));
        dischargeSummary.set手术切口愈合等级(dischargeSummaryDao.find手术切口愈合等级By手术切口愈合等级代码(dischargeSummary.get手术切口愈合等级代码()));
        dischargeSummary.set麻醉方法名称(dischargeSummaryDao.find麻醉方法名称By麻醉方法代码(dischargeSummary.get麻醉方法代码()));
        sourceMap.put("dischargeSummary",dischargeSummary);
    }
}
