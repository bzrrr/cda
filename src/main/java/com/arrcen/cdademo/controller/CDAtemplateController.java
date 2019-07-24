package com.arrcen.cdademo.controller;

import com.arrcen.cdademo.pojo.Template;
import com.arrcen.cdademo.service.impl.CDAtemplateServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cda")
@Api(tags = "CDA文档相关接口", description = "提供CDA文档模板相关的api")
public class CDAtemplateController {
	@Autowired
	CDAtemplateServiceImpl templateService;

	//	@RequestMapping(value = "/getTemplate", produces = {"application/xml;charset=UTF-8"})
	@ApiOperation("通过模板序号查询CDA模板")
	@GetMapping("/getTemplate/{index}")
	public Template getTemplate(@PathVariable("index") String index) {
		Template template = new Template();
		try {
			String json = templateService.getTemplate(index);
			template.setStatus("1");
			template.setContent(json);
		} catch (Exception e) {
			template.setStatus("-1");
			template.setMessage("系统错误");
		}
		return template;
	}

	@ApiOperation("获取所有文档的标题集合")
	@GetMapping("/getTitles")
	public Template getTitles() {
		Template template = new Template();
		try {
			List<String> titles = templateService.getTitles();
			template.setStatus("1");
			template.setContens(titles);
		} catch (Exception e) {
			template.setStatus("-1");
			template.setMessage("系统错误");
		}
		return template;
	}

	@GetMapping("/getXml/{index}")
	public Template getXml(@PathVariable("index") String index) {
		Template template = new Template();
		try {
			String xml = templateService.getXml(index, "A!");
			template.setStatus("1");
			template.setContent(xml);
		} catch (Exception e) {
			template.setStatus("-1");
			template.setMessage("系统错误");
		}
		return template;
	}
}
