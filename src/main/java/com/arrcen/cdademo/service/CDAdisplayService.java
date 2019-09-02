package com.arrcen.cdademo.service;

import com.arrcen.cdademo.pojo.PatientCdaDocument;

import java.util.Map;

public interface CDAdisplayService {

	/**
	 * 查询某一模板下的文件列表
	 * @param templateIndex
	 * @param page
	 * @param size
	 * @param order
	 * @param properties
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	Map<String,Object> getPage(String templateIndex, int page, int size, String order, String properties, String startTime, String endTime);

	Map<String, Object> getInfo(PatientCdaDocument patientCdaDocument);
}
