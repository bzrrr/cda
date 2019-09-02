package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.InspectionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InspectionRecordDao extends JpaRepository<InspectionRecord,String> {

    InspectionRecord findBy门急诊号(String 门急诊号);

    @Query(value = "SELECT 值含义 FROM PUB_卫生数据元值域 WHERE 值域名称 = '患者类型代码表' and 值=?1",nativeQuery = true)
	String find患者类型By患者类型代码(String 患者类型代码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find疾病诊断名称By疾病诊断编码(String 疾病诊断编码);

    @Query(value = "SELECT 值含义 FROM PUB_卫生数据元值域 WHERE 值域名称 = '检查/检验结果代码表' AND 值 = ?1",nativeQuery = true)
	String find检查结果By检查结果代码(String 检查结果代码);

//    @Query(value = "",nativeQuery = true)
//    String find检验项目By检验项目代码(String 检验项目代码);

}
