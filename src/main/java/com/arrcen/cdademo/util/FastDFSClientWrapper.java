package com.arrcen.cdademo.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.domain.proto.storage.DownloadByteArray;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;

@Component
public class FastDFSClientWrapper {
	@Autowired
	private FastFileStorageClient storageClient;

	public String uploadFile(File file) throws IOException {
		BufferedInputStream inputStream = FileUtil.getInputStream(file);
		StorePath storePath = storageClient.uploadFile(inputStream, FileUtil.size(file), FilenameUtils.getExtension(file.getName()), null);
		inputStream.close();
		return getResAccessUrl(storePath);
	}

	// 封装文件完整URL地址
	private String getResAccessUrl(StorePath storePath) {
		String fileUrl = "http://192.168.21.135:80" + "/" + storePath.getFullPath();
		return fileUrl;
	}

	public byte[] downloadFile(String fileUrl) throws IOException {
		String group = fileUrl.split("/")[3];
		String path = StrUtil.sub(fileUrl, 32, fileUrl.length() + 1);
		DownloadByteArray downloadByteArray = new DownloadByteArray();
		byte[] bytes = storageClient.downloadFile(group, path, downloadByteArray);
		return bytes;
	}
}
