package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.InOutRecordDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InOutRecordDetailDao extends JpaRepository<InOutRecordDetail,String> {
    InOutRecordDetail findBy单据序号(String 单据序号);

    @Query(value = "select 值含义 from PUB_卫生数据元值域 where 值域名称 = '用药途径代码表' AND 值 = ?1",nativeQuery = true)
	String find用药途径By用药途径代码(String 用药途径代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '中药使用类别代码表' and 值 = ?1",nativeQuery = true)
	String find中药使用类别By中药使用类别代码(String 中药使用类别代码);
}
