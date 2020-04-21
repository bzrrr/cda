package com.arrcen.cdademo.feign;

import feign.Headers;
import feign.Logger;
import feign.Param;
import feign.RequestLine;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@FeignClient(
		name = "platform",
		url = "http://182.150.28.35:9056/platform",
//		url = "http://localhost:8762",
		configuration = FileServerApi.MultipartSupportConfig.class
)
public interface FileServerApi {

	@RequestMapping(value = "/api/res/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	@Headers("Content-Type: multipart/form-data")
	String upload(@RequestPart(value = "file") MultipartFile file, @RequestParam(value = "filePath") String filePath,
				  @RequestParam(value = "isReName") Boolean isReName,
				  @RequestParam(value = "name") String name, @RequestParam(value = "type") String type,
				  @RequestHeader(name = "Authorization") String token);

	@Configuration
	class MultipartSupportConfig {

		@Bean
		public Encoder feignFormEncoder() {
			return new SpringFormEncoder();
		}

		@Bean
		Logger.Level feignLoggerLevel() {
			//这里记录所有，根据实际情况选择合适的日志level
			return Logger.Level.FULL;
		}
	}
}
