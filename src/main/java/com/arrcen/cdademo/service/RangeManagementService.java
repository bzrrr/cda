package com.arrcen.cdademo.service;

import com.arrcen.cdademo.pojo.DataElementRange;

import java.util.List;
import java.util.Map;

public interface RangeManagementService {
	/**
	 * 查询分页列表
	 * @param page
	 * @param size
	 * @param order
	 * @param properties
	 * @param systemId
	 * @param rangeCode
	 * @param valueMeaning
	 * @param code
	 * @param rangeName
	 * @return
	 */
	Map<String, Object> getPage(int page, int size, String order, String properties, String systemId, String rangeCode, String valueMeaning,String code,String rangeName);

	void updateRange(DataElementRange dataElementRange);

	void insertRange(DataElementRange dataElementRange);

	void deleleRange(List<String> systemIds);
}
