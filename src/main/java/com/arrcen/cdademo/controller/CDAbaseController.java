package com.arrcen.cdademo.controller;

import com.arrcen.cdademo.pojo.GenericResponse;
import com.arrcen.cdademo.pojo.ResponseFormat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cda")
@Api(tags = "CDA模块相关接口", description = "提供CDA模块相关的api")
public class CDAbaseController {
	@ApiOperation("获取所有子模块的title")
	@GetMapping("/getModules")
	public GenericResponse getTitles() {
		try {
			List<String> titles = new ArrayList<>();
			titles.add("数据元管理");
			titles.add("OID管理");
			titles.add("值域管理");
			titles.add("CDA模板");
			titles.add("CDA生成");
			titles.add("CDA文档展示");
			return ResponseFormat.retParam(1, titles);
		} catch (Exception e) {
			return ResponseFormat.retParam(-1, null);
		}
	}
}
