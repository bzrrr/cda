package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.BloodTransfusionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BloodTransfusionRecordDao extends JpaRepository<BloodTransfusionRecord,String> {
    BloodTransfusionRecord findBy门急诊号(String 门急诊号);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find疾病诊断名称By疾病诊断编码(String 疾病诊断编码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = 'ABO血型代码表' and 值 = ?1",nativeQuery = true)
	String findABO血型名称ByABO血型代码(String ABO血型代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = 'Rh(D)血型代码表' and 值 = ?1",nativeQuery = true)
	String findRH血型名称ByRH血型代码(String RH血型代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '输血性质代码表' and 值 = ?1",nativeQuery = true)
	String find输血性质By输血性质代码(String 输血性质代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = 'ABO血型代码表' and 值 = ?1",nativeQuery = true)
	String find申请ABO血型By申请ABO血型代码(String 申请ABO血型代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = 'Rh(D)血型代码表' and 值 = ?1",nativeQuery = true)
	String find申请RH血型By申请RH血型代码(String 申请RH血型代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '输血品种代码表' and 值 = ?1",nativeQuery = true)
	String find输血品种By输血品种代码(String 输血品种代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '输血反应类型代码表' and 值 = ?1",nativeQuery = true)
	String find输血反应类型By输血反应类型代码(String 输血反应类型代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '输血史标识代码表' and 值 = ?1",nativeQuery = true)
	String find输血史标识By输血史标识代码(String 输血史标识代码);


}
