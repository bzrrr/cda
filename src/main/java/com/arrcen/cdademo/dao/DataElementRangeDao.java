package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.DataElementRange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface DataElementRangeDao extends JpaRepository<DataElementRange, String>, JpaSpecificationExecutor<DataElementRange> {
	@Query(value = "SELECT max(系统序号) FROM \"AMBASE_HDR\".\"PUB_卫生数据元值域\"", nativeQuery = true)
	Integer findMax();
}
