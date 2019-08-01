package com.arrcen.cdademo.service;

public interface CDAgenerateService {
	/**
	 * 通过共享文档模板的索引和用户的系统id,获取生成的电子病历文档
	 *
	 * @param index 模板索引
	 * @param systemId 用户系统id
	 * @return
	 * @throws Exception
	 */
	String getXml(String index, String systemId) throws Exception;
}
