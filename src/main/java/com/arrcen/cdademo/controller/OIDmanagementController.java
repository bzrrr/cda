package com.arrcen.cdademo.controller;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import cn.hutool.log.level.Level;
import com.alibaba.fastjson.JSONObject;
import com.arrcen.cdademo.pojo.GenericResponse;
import com.arrcen.cdademo.pojo.OIDassignmentTable;
import com.arrcen.cdademo.pojo.ResponseFormat;
import com.arrcen.cdademo.service.OIDmanagementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cda/oid")
@Api(tags = "OID管理相关接口", description = "提供OID管理相关的api")
public class OIDmanagementController {
	@Autowired
	OIDmanagementService oiDmanagementService;

	private static final Log log = LogFactory.get();

	@GetMapping("/getList")
	@ApiOperation("查询分页后的OID列表")
	public GenericResponse getList(@RequestParam(value = "page", defaultValue = "1", required = false) @ApiParam(value = "当前页码", example = "1") int page,
								   @RequestParam(value = "size", defaultValue = "10", required = false) @ApiParam(value = "每页记录数", example = "10") int size,
								   @RequestParam(value = "sort", defaultValue = "ASC", required = false) @ApiParam(value = "排序方式(升序ASC,降序DESC)") String order,
								   @RequestParam(value = "properties", defaultValue = "系统序号", required = false) @ApiParam(value = "排序字段") String properties,
								   @RequestParam(value = "systemId", required = false) @ApiParam(value = "查询条件:系统序号(精确匹配)") String systemId,
								   @RequestParam(value = "oidName", required = false) @ApiParam(value = "查询条件:OID名称(模糊匹配)") String oidName,
								   @RequestParam(value = "oid", required = false) @ApiParam(value = "查询条件:OID(精确匹配)") String oid,
								   @RequestParam(value = "mappedCode", required = false) @ApiParam(value = "查询条件:映射代码(精确匹配)") String mappedCode) {
		log.info(log.getName() + "/getList", Level.INFO);
		Map<String, Object> map = oiDmanagementService.getPage(page, size, order, properties, systemId, oidName, mappedCode, oid);

		return ResponseFormat.retParam(1, map);
	}

	@PostMapping("/update")
	@ApiOperation("修改某一条OID")
	public GenericResponse updateOID(@RequestBody @ApiParam(value = "OID json对象", required = true) String oiDassignmentTable) {
		try {
			log.info(log.getName() + "/update", Level.INFO);
			OIDassignmentTable obj = JSONObject.parseObject(oiDassignmentTable, OIDassignmentTable.class);
			oiDmanagementService.updateOID(obj);
			return ResponseFormat.retParam(1, "修改成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseFormat.retParam(-1, null);
		}
	}

	@PostMapping("/insert")
	@ApiOperation("新增一条OID")
	public GenericResponse insertOID(@RequestBody @ApiParam(value = "OID json对象", required = true) String oiDassignmentTable) {
		try {
			log.info(log.getName() + "/insert", Level.INFO);
			JSONObject obj = JSONObject.parseObject(oiDassignmentTable);
			oiDmanagementService.insertOID(obj.toJavaObject(OIDassignmentTable.class));
			return ResponseFormat.retParam(1, "新增成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseFormat.retParam(-1, null);
		}
	}

	@PostMapping("/delete")
	@ApiOperation("删除一或多条OID")
	public GenericResponse deleteOID(@RequestBody @ApiParam(value = "系统序号集合", required = true) List<String> systemIds) {
		try {
			log.info(log.getName() + "/delete", Level.INFO);
			oiDmanagementService.deleleOID(systemIds);
			return ResponseFormat.retParam(1, "删除成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseFormat.retParam(-1, null);
		}
	}
}
