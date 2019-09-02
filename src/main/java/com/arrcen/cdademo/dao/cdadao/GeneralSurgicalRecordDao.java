package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.GeneralSurgicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GeneralSurgicalRecordDao extends JpaRepository<GeneralSurgicalRecord,String> {

    GeneralSurgicalRecord findBy门急诊号(String 门急诊号);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find术前诊断名称By术前诊断编码(String 术前诊断编码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find术后诊断名称By术后诊断编码(String 术后诊断编码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '手术级别代码表' and 值 = ?1",nativeQuery = true)
	String find手术级别By手术级别代码(String 手术级别代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '手术体位代码表' and 值 = ?1",nativeQuery = true)
	String find手术体位名称By手术体位代码(String 手术体位代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '麻醉方法代码表' and 值 = ?1",nativeQuery = true)
	String find麻醉方法By麻醉方法代码(String 麻醉方法代码);
}
