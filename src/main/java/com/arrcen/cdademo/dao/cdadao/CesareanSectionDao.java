package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.CesareanSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CesareanSectionDao extends JpaRepository<CesareanSection,String> {

    CesareanSection findBy住院号(String 住院号);

    @Query(value = "select 代码名称 from PUB_ICD_9_M WHERE 代码类型 ='手术(操作)代码表(ICD-9-CM)' and 代码值 = ?1",nativeQuery = true)
	String find手术及操作名称By手术及操作编码(String 手术及操作编码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '麻醉方法代码表' and 值 = ?1",nativeQuery = true)
	String find麻醉方法名称By麻醉方法代码(String 麻醉方法代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '生理性别代码表(GB/T 2261.1)' and 值 = ?1",nativeQuery = true)
	String find新生儿性别By新生儿性别代码(String 新生儿性别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = 'Apgar评分间隔时间代码表' and 值 = ?1",nativeQuery = true)
	String findAPGAR评分间隔时间ByAPGAR评分间隔时间代码(String APGAR评分间隔时间代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '分娩结局代码表' and 值 = ?1",nativeQuery = true)
	String find分娩结局By分娩结局代码(String 分娩结局代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '新生儿异常情况代码表' and 值 = ?1",nativeQuery = true)
	String find新生儿异常情况By新生儿异常情况代码(String 新生儿异常情况代码);


}
