package com.arrcen.cdademo.service;

import com.arrcen.cdademo.pojo.OIDassignmentTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface OIDmanagementService {
	/**
	 * 查询分页列表
	 *
	 * @param page
	 * @param size
	 * @param order      排序规则
	 * @param properties 排序字段
	 * @return
	 */
	Map<String, Object> getPage(int page, int size, String order, String properties, String systemId, String oidName, String mappedCode, String oid);

	void updateOID(OIDassignmentTable oiDassignmentTable);

	void insertOID(OIDassignmentTable oiDassignmentTable);

	void deleleOID(List<String> systemIds);

}
