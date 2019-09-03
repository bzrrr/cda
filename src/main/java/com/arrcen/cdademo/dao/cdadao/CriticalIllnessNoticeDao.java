package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.CriticalIllnessNotice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CriticalIllnessNoticeDao extends JpaRepository<CriticalIllnessNotice,String> {

    @Query(value = "select * from PUB09_病危重通知书 where 门急诊号 = ?1",nativeQuery = true)
    CriticalIllnessNotice findBy门急诊号(String 门急诊号);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find疾病诊断名称By疾病诊断编码(String 疾病诊断编码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '家庭关系代码表(GB/T 4761)' and 值 = ?1",nativeQuery = true)
	String find法定代理人与患者的关系By法定代理人与患者的关系代码(String 法定代理人与患者的关系代码);
}
