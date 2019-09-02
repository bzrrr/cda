package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.PreanesthesiaVisitRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PreanesthesiaVisitRecordDao extends JpaRepository<PreanesthesiaVisitRecord,String> {
    PreanesthesiaVisitRecord findBy门急诊号(String 门急诊号);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = 'ABO血型代码表' and 值 = ?1",nativeQuery = true)
	String findABO血型名称ByABO血型代码(String ABO血型代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = 'Rh(D)血型代码表' and 值 = ?1",nativeQuery = true)
	String findRH血型名称ByRH血型代码(String RH血型代码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find术前诊断名称By术前诊断编码(String 术前诊断编码);

    @Query(value = "SELECT 代码名称 FROM PUB_ICD_9_M WHERE 代码类型 = '手术(操作)代码表(ICD-9-CM)' and 代码值 = ?1",nativeQuery = true)
	String find拟实施手术及操作名称By拟实施手术及操作编码(String 拟实施手术及操作编码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '麻醉方法代码表' and 值 = ?1",nativeQuery = true)
	String find拟实施麻醉方法名称By拟实施麻醉方法代码(String 拟实施麻醉方法代码);
}
