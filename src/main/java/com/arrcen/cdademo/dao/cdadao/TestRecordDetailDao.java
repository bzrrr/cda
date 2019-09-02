package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.TestRecordDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TestRecordDetailDao extends JpaRepository<TestRecordDetail,String> {
    TestRecordDetail findBy单据序号(String 单据序号);

//    @Query(value = "",nativeQuery = true)
//    String find检验项目By检验项目代码(String 检验项目代码);

    @Query(value = "SELECT 值含义 FROM PUB_卫生数据元值域 WHERE 值域名称 = '检查/检验结果代码表' AND 值 = ?1",nativeQuery = true)
	String find检验结果By检验结果代码(String 检验结果代码);
}
