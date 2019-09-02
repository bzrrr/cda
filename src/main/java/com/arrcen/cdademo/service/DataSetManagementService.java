package com.arrcen.cdademo.service;

import com.arrcen.cdademo.pojo.EMRDataSet;

import java.util.List;
import java.util.Map;

public interface DataSetManagementService {
	/**
	 * 查询分页列表
	 *
	 * @param page
	 * @param size
	 * @param order      排序规则
	 * @param properties 排序字段
	 * @return
	 */
	Map<String, Object> getPage(int page, int size, String order, String properties, String systemId, String dataSetName, String dataSetId, String subSetName);

	void updateDataSet(EMRDataSet emrDataSet);

	void insertDataSet(EMRDataSet emrDataSet);

	void deleleDataSet(List<String> systemIds);
}
