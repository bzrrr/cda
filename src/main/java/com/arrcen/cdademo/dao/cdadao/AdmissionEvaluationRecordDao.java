package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.AdmissionEvaluationRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdmissionEvaluationRecordDao extends JpaRepository<AdmissionEvaluationRecord,String> {
    AdmissionEvaluationRecord findBy住院号(String 住院号);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '世界各国和地区名称代码(GB/T 2659)' and 值 = ?1",nativeQuery = true)
	String find国籍By国籍代码(String 国籍代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '职业类别代码表(GB/T 6565)' and 值 = ?1",nativeQuery = true)
	String find职业类别By职业类别代码(String 职业类别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '学历代码表(GB/T 4658)' and 值 = ?1",nativeQuery = true)
	String find学历By学历代码(String 学历代码);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find入院诊断名称By入院诊断编码(String 入院诊断编码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '入院途径代码表' and 值 = ?1",nativeQuery = true)
	String find入院途径By入院途径代码(String 入院途径代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '饮食情况代码表' and 值 = ?1",nativeQuery = true)
	String find饮食情况By饮食情况代码(String 饮食情况代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '发育程度代码表' and 值 = ?1",nativeQuery = true)
	String find发育程度By发育程度代码(String 发育程度代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '心理状态代码表' and 值 = ?1",nativeQuery = true)
	String find心理状态By心理状态代码(String 心理状态代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '营养状态代码表' and 值 = ?1",nativeQuery = true)
	String find营养状态By营养状态代码(String 营养状态代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '自理能力代码表' and 值 = ?1",nativeQuery = true)
	String find自理能力By自理能力代码(String 自理能力代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '吸烟状况代码表' and 值 = ?1",nativeQuery = true)
	String find吸烟状况By吸烟状况代码(String 吸烟状况代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '饮酒频率代码表' and 值 = ?1",nativeQuery = true)
	String find饮酒频率By饮酒频率代码(String 饮酒频率代码);
}
