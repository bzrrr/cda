package com.arrcen.cdademo.controller;

import com.arrcen.cdademo.pojo.GenericResponse;
import com.arrcen.cdademo.pojo.ResponseFormat;
import com.arrcen.cdademo.service.impl.CDAtemplateServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cda/template")
@Api(tags = "CDA文档模板相关接口", description = "提供CDA文档模板相关的api")
public class CDAtemplateController {
	@Autowired
	CDAtemplateServiceImpl templateService;

	//	@RequestMapping(value = "/getTemplate", produces = {"application/xml;charset=UTF-8"})
	@ApiOperation("通过模板序号查询CDA模板")
	@GetMapping("/getTemplate/{index}")
	public GenericResponse getTemplate(@PathVariable("index") String index) {
		try {
			String json = templateService.getTemplate(index);
			return ResponseFormat.retParam(1, json);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseFormat.retParam(-1, null);
		}
	}

	@ApiOperation("获取所有文档的标题集合")
	@GetMapping("/getTitles")
	public GenericResponse getTitles() {
		try {
			List<String> titles = templateService.getTitles();
			return ResponseFormat.retParam(1, titles);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseFormat.retParam(-1, null);
		}
	}


	@PostMapping("/updateTemplate")
	@ApiOperation("修改模板内容")
	public GenericResponse updateTemplate(@RequestBody @ApiParam(value = "模板内容") String templateJson, @RequestParam @ApiParam(value = "模板序号") String index) {
		try {
			System.out.println(templateJson);
			templateService.updateTemplate(templateJson, index);
			return ResponseFormat.retParam(1, "修改成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseFormat.retParam(-1, null);
		}
	}
}
