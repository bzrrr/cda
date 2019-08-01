package com.arrcen.cdademo.controller;

import com.alibaba.fastjson.JSONObject;
import com.arrcen.cdademo.pojo.GenericResponse;
import com.arrcen.cdademo.pojo.OIDassignmentTable;
import com.arrcen.cdademo.pojo.ResponseFormat;
import com.arrcen.cdademo.service.OIDmanagementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cda/oid")
@Api(tags = "OID管理相关接口", description = "提供OID管理相关的api")
public class OIDmanagementController {
	@Autowired
	OIDmanagementService oiDmanagementService;

	@GetMapping("/getList")
	@ApiOperation("查询分页后的OID列表")
	public GenericResponse getList(@RequestParam(value = "page", defaultValue = "1", required = false) @ApiParam(value = "当前页码", example = "1") int page,
								   @RequestParam(value = "size", defaultValue = "10", required = false) @ApiParam(value = "每页记录数", example = "10") int size,
								   @RequestParam(value = "sort", defaultValue = "ASC", required = false) @ApiParam(value = "排序方式(升序ASC,降序DESC)") String order,
								   @RequestParam(value = "properties", defaultValue = "系统序号", required = false) @ApiParam(value = "排序字段") String properties,
								   @RequestParam(value = "systemId", required = false) @ApiParam(value = "系统序号") String systemId,
								   @RequestParam(value = "oidName", required = false) @ApiParam(value = "OID名称") String oidName) {

		Map<String, Object> map = oiDmanagementService.getPage(page, size, order, properties, systemId, oidName);

		return ResponseFormat.retParam(1, map);
	}

	@PostMapping("/update")
	@ApiOperation("修改某一条OID")
	public GenericResponse updateOID(@RequestBody @ApiParam(value = "OID json对象") String oiDassignmentTable) {
		try {
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
	public GenericResponse insertOID(@RequestBody @ApiParam(value = "OID json对象") String oiDassignmentTable) {
		try {
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
	public GenericResponse deleteOID(@RequestBody @ApiParam(value = "系统序号集合") List<String> systemIds) {
		try {
			oiDmanagementService.deleleOID(systemIds);
			return ResponseFormat.retParam(1, "删除成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseFormat.retParam(-1, null);
		}
	}
}
