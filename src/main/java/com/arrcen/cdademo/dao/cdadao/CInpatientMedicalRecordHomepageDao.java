package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.CInpatientMedicalRecordHomepage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CInpatientMedicalRecordHomepageDao extends JpaRepository<CInpatientMedicalRecordHomepage,String> {

    CInpatientMedicalRecordHomepage findBy居民健康卡号(String 居民健康卡号);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '医疗付费方式代码表' and 值 = ?1",nativeQuery = true)
	String find医疗付费方式By医疗付费方式代码(String 医疗付费方式代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '生理性别代码表(GB/T 2261.1)' and 值 = ?1",nativeQuery = true)
	String find性别By性别代码(String 性别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '世界各国和地区名称代码(GB/T 2659)' and 值 = ?1",nativeQuery = true)
	String find国籍By国籍代码(String 国籍代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '民族类别代码表(GB 3304)' and 值 = ?1",nativeQuery = true)
	String find民族名称By民族(String 民族);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '职业类别代码表(GB/T 6565)' and 值 = ?1",nativeQuery = true)
	String find职业类别By职业类别代码(String 职业类别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '婚姻状况代码表(GB/T 2261.2)' and 值 = ?1",nativeQuery = true)
	String find婚姻状况By婚姻状况代码(String 婚姻状况代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '家庭关系代码表(GB/T 4761)' and 值 = ?1",nativeQuery = true)
	String find联系人与患者的关系By联系人与患者的关系代码(String 联系人与患者的关系代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '入院途径代码表' and 值 = ?1",nativeQuery = true)
	String find入院途径By入院途径代码(String 入院途径代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '治疗类别代码表' and 值 = ?1",nativeQuery = true)
	String find治疗类别By治疗类别代码(String 治疗类别代码);

    @Query(value = "select 代码名称 from PUB_GB中医病证分类与代码 where 值域名称= '中医病证分类与代码表(GB/T 15657-1995)' and 代码值 = ?1",nativeQuery = true)
	String find门急诊诊断中医诊断病名名称By门急诊诊断中医诊断病名代码(String 门急诊诊断中医诊断病名代码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find门急诊诊断西医诊断疾病名称By门急诊诊断西医诊断疾病编码(String 门急诊诊断西医诊断疾病编码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '实施临床路径标志代码表' and 值 = ?1",nativeQuery = true)
	String find实施临床路径标志By实施临床路径标志代码(String 实施临床路径标志代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '入院病情代码表' and 值 = ?1",nativeQuery = true)
	String find出院中医诊断_主病_入院病情By出院中医诊断_主病_入院病情代码(String 出院中医诊断_主病_入院病情代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '入院病情代码表' and 值 = ?1",nativeQuery = true)
	String find出院中医诊断_主证_入院病情By出院中医诊断_主证_入院病情代码(String 出院中医诊断_主证_入院病情代码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find出院西医诊断_主要诊断疾病名称By出院西医诊断_主要诊断疾病编码(String 出院西医诊断_主要诊断疾病编码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find出院西医诊断_其他诊断疾病名称By出院西医诊断_其他诊断疾病编码(String 出院西医诊断_其他诊断疾病编码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find损伤中毒的外部原因疾病By损伤中毒的外部原因疾病编码(String 损伤中毒的外部原因疾病编码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' and 代码值 = ?1",nativeQuery = true)
	String find病理诊断疾病By病理诊断疾病编码(String 病理诊断疾病编码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = 'ABO血型代码表' and 值 = ?1",nativeQuery = true)
	String findABO血型ByABO血型代码(String ABO血型代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = 'Rh(D)血型代码表' and 值 = ?1",nativeQuery = true)
	String findRH血型ByRH血型代码(String RH血型代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '病案质量等级表' and 值 = ?1",nativeQuery = true)
	String find病案质量By病案质量代码(String 病案质量代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '手术级别代码表' and 值 = ?1",nativeQuery = true)
	String find手术级别By手术级别代码(String 手术级别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '手术切口类别代码表' and 值 = ?1",nativeQuery = true)
	String find手术切口类别By手术切口类别代码(String 手术切口类别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '手术切口愈合等级代码表' and 值 = ?1",nativeQuery = true)
	String find手术切口愈合等级By手术切口愈合等级代码(String 手术切口愈合等级代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '麻醉方法代码表' and 值 = ?1",nativeQuery = true)
	String find麻醉方式By麻醉方式代码(String 麻醉方式代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '离院方式代码表' and 值 = ?1",nativeQuery = true)
	String find离院方式By离院方式代码(String 离院方式代码);

}
