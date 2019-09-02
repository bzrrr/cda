package com.arrcen.cdademo.test;

import com.alibaba.fastjson.JSON;
import com.arrcen.cdademo.dao.PatientCdaDocumentDao;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.service.impl.display.DisplayService01;
import com.arrcen.cdademo.util.FastDFSClientWrapper;
import com.google.common.collect.HashBasedTable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springfox.documentation.spring.web.json.Json;

import java.io.IOException;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
	@Autowired
	FastDFSClientWrapper fastDFSClientWrapper;
	@Autowired
	DisplayService01 service01;
	@Autowired
	PatientCdaDocumentDao patientCdaDocumentDao;

	@Test
	public void test() {
		HashBasedTable<Object, Object, Object> temMap = HashBasedTable.create();
		temMap.put("1", "property", "建档日期时间");
		System.out.println(temMap.get("1", "property"));
	}

	@Test
	public void test2() {
		try {
			byte[] bytes = fastDFSClientWrapper.downloadFile("http://192.168.21.135:80/group1/M00/00/01/wKgVh11FWNmAQcX2AABOs9tol1Y782.xml");

			System.out.println(new String(bytes));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test3() {

		PatientCdaDocument patientCdaDocument = patientCdaDocumentDao.getOne("1");
		Map<String, Object> info = service01.getInfo(patientCdaDocument);
//		System.out.println(info);
		String infoJson = JSON.toJSONString(info,true);
		System.out.println(infoJson);
	}
}
