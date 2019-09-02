package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.EMRDataSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface EMRDataSetDao extends JpaRepository<EMRDataSet, String>, JpaSpecificationExecutor<EMRDataSet> {
	@Query(value = "SELECT max(系统序号) FROM \"AMBASE_HDR\".\"PUB_电子病历标准数据集\"", nativeQuery = true)
	int findMax();
}
