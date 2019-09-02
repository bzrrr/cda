package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.TreatmentRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TreatmentRecordDao extends JpaRepository<TreatmentRecord,String> {
    TreatmentRecord findBy门急诊号(String 门急诊号);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find疾病诊断名称By疾病诊断名称(String 疾病诊断编码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '中药使用类别代码表' AND 值 = ?1",nativeQuery = true)
	String find中药使用类别By中药使用类别代码(String 中药使用类别代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '药物剂型代码表' AND 值 = ?1",nativeQuery = true)
	String find药物剂型值By药物剂型代码(String 药物剂型代码);

    @Query(value = "select 值含义 FROM PUB_卫生数据元值域 WHERE 值域名称 = '药物使用频次代码表' AND 值= ?1",nativeQuery = true)
	String find用药频率By药物使用频次代码(String 药物使用频次代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '用药途径代码表' AND 值 = ?1",nativeQuery = true)
	String find用药途径By用药途径代码(String 用药途径代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '随访方式代码表' and 值 = ?1",nativeQuery = true)
	String find随访方式By随访方式代码(String 随访方式代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '随访周期建议代码表' and 值=?1",nativeQuery = true)
	String find随访周期建议By随访周期建议代码(String 随访周期建议代码);
}
