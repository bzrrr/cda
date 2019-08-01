package com.arrcen.cdademo.service;

import java.util.List;

public interface CDAtemplateService {
	/**
	 * 通过共享文档模板的索引,获取CDA文档的模板
	 *
	 * @param index 模板索引
	 * @return
	 * @throws Exception
	 */
	String getTemplate(String index) throws Exception;

	/**
	 * 获取所有文档的标题集合
	 *
	 * @return
	 */
	List<String> getTitles();

	/**
	 * 通过前端传过来的json和模板索引,更改目标序号的模板内容
	 * @param json 更改的模板内容
	 * @param index 模板序号
	 * @return
	 * @throws Exception
	 */
	void updateTemplate(String json, String index) throws Exception;
}
