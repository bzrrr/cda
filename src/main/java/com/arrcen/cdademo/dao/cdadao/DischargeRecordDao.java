package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.DischargeRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DischargeRecordDao extends JpaRepository<DischargeRecord,String> {

    DischargeRecord findBy住院号(String 住院号);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '生理性别代码表(GB/T 2261.1)' and 值 = ?1",nativeQuery = true)
	String find性别By性别代码(String 性别代码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型= '诊断代码表(ICD_10)' and 代码值 = ?1",nativeQuery = true)
	String find入院诊断名称By入院诊断编码(String 入院诊断编码);

}
