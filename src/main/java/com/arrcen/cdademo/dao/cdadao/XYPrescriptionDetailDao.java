package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.XYPrescriptionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface XYPrescriptionDetailDao extends JpaRepository<XYPrescriptionDetail,String> {
    XYPrescriptionDetail findBy单据序号(String id);

    @Query(value = "select 值含义 FROM PUB_卫生数据元值域 WHERE 值域名称 = '药物使用频次代码表' AND 值= ?1",nativeQuery = true)
	String find用药频率By药物使用频次代码(String 药物使用频次代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '药物剂型代码表' AND 值 = ?1",nativeQuery = true)
	String find药物剂型值By药物剂型代码(String 药物剂型代码);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '用药途径代码表' AND 值 = ?1",nativeQuery = true)
	String find用药途径By用药途径代码(String 用药途径代码);

}
