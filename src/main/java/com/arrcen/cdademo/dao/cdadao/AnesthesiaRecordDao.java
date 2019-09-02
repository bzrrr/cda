package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.AnesthesiaRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AnesthesiaRecordDao extends JpaRepository<AnesthesiaRecord,String> {

    AnesthesiaRecord findBy门急诊号(String 门急诊号);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = 'ABO血型代码表' and 值 = ?1",nativeQuery = true)
	String findABO血型名称ByABO血型代码(String ABO血型代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = 'Rh(D)血型代码表' and 值 = ?1",nativeQuery = true)
	String findRH血型名称ByRH血型代码(String RH血型代码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find术前诊断名称By术前诊断编码(String 术前诊断编码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find术后诊断名称By术后诊断编码(String 术前诊断编码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '手术体位代码表' and 值 = ?1",nativeQuery = true)
	String find手术体位By手术体位代码(String 手术体位代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '麻醉方法代码表' and 值 = ?1",nativeQuery = true)
	String find麻醉方法By麻醉方法代码(String 麻醉方法代码);

    @Query(value = "SELECT 代码名称 FROM PUB_ICD_9_M WHERE 代码类型 = '手术(操作)代码表(ICD-9-CM)' and 代码值 = ?1",nativeQuery = true)
	String find手术及操作名称By手术及操作编码(String 手术及操作编码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '呼吸类型代码表' and 值 = ?1",nativeQuery = true)
	String find呼吸类型By呼吸类型代码(String 呼吸类型代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '麻醉合并症标志代码表' and 值 = ?1",nativeQuery = true)
	String find麻醉合并症标志By麻醉合并症标志代码(String 麻醉合并症标志代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '美国麻醉医师协会(ASA)分级标准代码表' and 值 = ?1",nativeQuery = true)
	String findASA分级标准ByASA分级标准代码(String ASA分级标准代码);

    @Query(value = "select 值含义 FROM PUB_卫生数据元值域 WHERE 值域名称 = '药物使用频次代码表' AND 值= ?1",nativeQuery = true)
	String find药物使用频次By药物使用频次代码(String 药物使用频次代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '用药途径代码表' AND 值 = ?1",nativeQuery = true)
	String find用药途径By用药途径代码(String 用药途径代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '输血品种代码表' and 值 = ?1",nativeQuery = true)
	String find输血品种By输血品种代码(String 输血品种代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '患者去向代码' and 值 = ?1",nativeQuery = true)
	String find患者去向By患者去向代码(String 患者去向代码);
}
