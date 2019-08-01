package com.arrcen.cdademo.controller;

import com.arrcen.cdademo.pojo.GenericResponse;
import com.arrcen.cdademo.pojo.ResponseFormat;
import com.arrcen.cdademo.service.CDAgenerateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cda/generate")
@Api(tags = "CDA文档生成相关接口", description = "提供CDA文档生成相关的api")
public class CDAgenerateController {
	@Autowired
	CDAgenerateService generateService;

	@PostMapping("/createPersonalDoc")
	@ApiOperation("通过模板序号和用户id生成对应的CDA文档")
	public GenericResponse getXml(@RequestParam @ApiParam(value = "模板序号") String index, @RequestParam @ApiParam(value = "用户系统id") String systemId) {
		try {
			String xml = generateService.getXml(index, systemId);
			return ResponseFormat.retParam(1, xml);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseFormat.retParam(-1, null);
		}
	}
}
