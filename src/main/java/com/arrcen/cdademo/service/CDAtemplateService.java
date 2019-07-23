package com.arrcen.cdademo.service;

import java.util.List;

public interface CDAtemplateService {
	/**
	 * 通过共享文档模板的索引,获取生成的电子病历文档
	 * @param index 模板索引
	 * @return
	 * @throws Exception
	 */
	String getXml(String index) throws Exception;

	/**
	 * 通过共享文档模板的索引,获取CDA文档的模板
	 * @param index 模板索引
	 * @return
	 * @throws Exception
	 */
	String getTemplate(String index) throws Exception;

	/**
	 * 获取所有文档的标题集合
	 * @return
	 */
	List<String> getTitles();
}
