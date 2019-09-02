package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.FirstCourseRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FirstCourseRecordDao extends JpaRepository<FirstCourseRecord,String> {

    FirstCourseRecord findBy住院号(String 住院号);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '生理性别代码表(GB/T 2261.1)' and 值 = ?1",nativeQuery = true)
	String find性别By性别代码(String 性别代码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型= '诊断代码表(ICD_10)' and 代码值 = ?1",nativeQuery = true)
	String find初步诊断_西医诊断名称By初步诊断_西医诊断编码(String 初步诊断_西医诊断编码);

    @Query(value = "SELECT 代码名称 from PUB_GB中医病证分类与代码 WHERE 值域名称 = '中医病证分类与代码表(GB/T 15657-1995)' and 代码值 = ?1",nativeQuery = true)
	String find初步诊断_中医病名名称By初步诊断_中医病名代码(String 初步诊断_中医病名代码);

    @Query(value = "SELECT 代码名称 from PUB_GB中医病证分类与代码 WHERE 值域名称 = '中医病证分类与代码表(GB/T 15657-1995)' and 代码值 = ?1",nativeQuery = true)
	String find初步诊断_中医证候名称By初步诊断_中医证候代码(String 初步诊断_中医证候代码);
}
