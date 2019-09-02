package com.arrcen.cdademo.service;

import com.arrcen.cdademo.pojo.PatientCdaDocument;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface CDAgenerateService {
	/**
	 * 通过共享文档模板的索引和用户的系统id,获取生成的电子病历文档
	 *
	 * @param index    模板索引
	 * @param systemId 用户系统id
	 * @return
	 * @throws Exception
	 */
	String getXml(String index, String systemId) throws Exception;

	/**
	 * 查询分页列表
	 *
	 * @param page
	 * @param size
	 * @param order
	 * @param properties
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	Map<String, Object> getPage(String templateIndex, int page, int size, String order, String properties, String startTime, String endTime, String systemId, String patientId, String patientName) throws Exception;

	void update(String templateIndex, String docInfo);

	void insert(String templateIndex, String docInfo);

	void delele(String templateIndex, List<String> systemIds);

	/**
	 * 上传文件
	 * @param file
	 * @throws Exception
	 */
	void uploadFile(MultipartFile file) throws Exception;

	File download(PatientCdaDocument doc) throws IOException;

	File download(PatientCdaDocument doc, String path) throws IOException;
}
