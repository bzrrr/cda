package com.arrcen.cdademo.controller;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import cn.hutool.log.level.Level;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.arrcen.cdademo.pojo.GenericResponse;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.ResponseFormat;
import com.arrcen.cdademo.service.CDAdisplayService;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cda/display")
@Api(tags = "CDA文档展示相关接口", description = "提供CDA文档展示相关的api")
public class CDAdisplayController {
	@Resource(name = "CDAdisplayBaseServiceImpl")
	private CDAdisplayService displayService;

	private static final Log log = LogFactory.get();

	@GetMapping("/getList")
	@ApiOperation(value = "查询分页后的已生成文档信息列表")
	public GenericResponse getList(@RequestParam(value = "templateIndex") @ApiParam(value = "模板序号", required = true) String templateIndex,
								   @RequestParam(value = "page", defaultValue = "1", required = false) @ApiParam(value = "当前页码", example = "1") int page,
								   @RequestParam(value = "size", defaultValue = "10", required = false) @ApiParam(value = "每页记录数", example = "10") int size,
								   @RequestParam(value = "sort", defaultValue = "ASC", required = false) @ApiParam(value = "排序方式(升序ASC,降序DESC)") String order,
								   @RequestParam(value = "properties", defaultValue = "系统序号", required = false) @ApiParam(value = "排序字段") String properties,
								   @RequestParam(value = "startTime", required = false) @ApiParam(value = "查询条件:起始日期") String startTime,
								   @RequestParam(value = "endTime", required = false) @ApiParam(value = "查询条件:截止日期") String endTime) {

		try {
			log.info(log.getName() + "/getList", Level.INFO);
			Map<String, Object> map = displayService.getPage(templateIndex, page, size, order, properties, startTime, endTime);
			return ResponseFormat.retParam(1, map);
		} catch (Exception e) {
			log.error(e, log.getName() + "/getList", Level.ERROR);
			return ResponseFormat.retParam(-1, null);
		}
	}

	@PostMapping("/getInfo")
	@ApiOperation(value = "文档详细内容")
	public GenericResponse getInfo(@RequestBody @ApiParam(value = "文档信息", required = true) PatientCdaDocument patientCdaDocument) {
		try {
			log.info(log.getName() + "/getList", Level.INFO);
			Map<String, Object> infoMap = displayService.getInfo(patientCdaDocument);
			String info = JSONObject.toJSONString(infoMap, SerializerFeature.WriteMapNullValue);
			JSONObject parse = JSONObject.parseObject(info);
			Map map = jsonConvertMap(parse);
			return ResponseFormat.retParam(1, map);
		} catch (Exception e) {
			log.error(e, log.getName() + "/getInfo", Level.ERROR);
			return ResponseFormat.retParam(-1, null);
		}
	}

	private Map jsonConvertMap(JSONObject parse) {
		int count = 0;
		Map resultMap = Maps.newHashMap();
		for (String key : parse.keySet()) {
			Object v = parse.get(key);
			if (v instanceof JSONObject) {
				List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
				for (String k : ((JSONObject) v).keySet()) {
					Map valueMap = Maps.newHashMap();
					if ("系统序号".equals(k)) {
						continue;
					} else if ("居民健康卡号".equals(k)) {
						if (count == 0) {
							valueMap.put("name", k);
							valueMap.put("value", ((JSONObject) v).get(k));
							list.add(valueMap);
							count++;
						} else {
							continue;
						}
					} else if ("docId".equals(k)) {
						valueMap.put("name", "文档流水号");
						valueMap.put("value", ((JSONObject) v).get(k));
						list.add(valueMap);
					} else if ("effectiveTime".equals(k)) {
						valueMap.put("name", "文档生成时间");
						valueMap.put("value", ((JSONObject) v).get(k));
						list.add(valueMap);
					} else {
						valueMap.put("name", k);
						valueMap.put("value", ((JSONObject) v).get(k));
						list.add(valueMap);
					}
				}
				resultMap.put(key, list);
			}
		}
		return resultMap;
	}
}
