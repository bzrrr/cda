package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.ZYPrescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ZYPrescriptionDao extends JpaRepository<ZYPrescription,String> {
    ZYPrescription findBy门急诊号(String id);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find西医诊断名称By西医诊断编码(String 西医诊断编码);

    @Query(value = "select 代码名称 from PUB_GB中医病证分类与代码 where 值域名称 = '中医病证分类与代码表(GB/T 15657-1995)' AND 代码值 = ?1",nativeQuery = true)
	String find中医病名名称By中医病名代码(String 中医病名代码);

    @Query(value = "select 代码名称 from PUB_GB中医病证分类与代码 where 值域名称 = '中医病证分类与代码表(GB/T 15657-1995)' AND 代码值 = ?1",nativeQuery = true)
	String find中医证候名称By中医证候代码(String 中医证候代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '处方类别代码表' and 值 = ?1",nativeQuery = true)
	String find处方类别By处方类别代码(String 处方类别代码);
}
