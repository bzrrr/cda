package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.HighValueThingUseRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HighValueThingUseRecordDao extends JpaRepository<HighValueThingUseRecord,String> {

    HighValueThingUseRecord findBy住院号(String 住院号);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find疾病诊断名称By疾病诊断编码(String 疾病诊断编码);
}
