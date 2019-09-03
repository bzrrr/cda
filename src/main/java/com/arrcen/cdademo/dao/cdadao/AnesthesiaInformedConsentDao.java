package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.AnesthesiaInformedConsent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AnesthesiaInformedConsentDao extends JpaRepository<AnesthesiaInformedConsent,String> {

    @Query(value = "select * from PUB09_麻醉知情同意书 where 门急诊号 = ?1",nativeQuery = true)
    AnesthesiaInformedConsent findBy门急诊号(String 门急诊号);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find术前诊断名称By术前诊断编码(String 术前诊断编码);

    @Query(value = "select 代码名称 from PUB_ICD_9_M where 代码类型 = '手术(操作)代码表(ICD-9-CM)' and 代码值 = ?1",nativeQuery = true)
	String find拟实施手术及操作名称By拟实施手术及操作编码(String 拟实施手术及操作编码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '麻醉方法代码表' and 值 = ?1",nativeQuery = true)
	String find拟实施麻醉方法By拟实施麻醉方法代码(String 拟实施麻醉方法代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '血缘关系代码表' and 值 = ?1",nativeQuery = true)
	String find法定代理人与患者的关系By法定代理人与患者的关系代码(String 法定代理人与患者的关系代码);

}
