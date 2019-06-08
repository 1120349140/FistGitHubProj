package com.imooc.utils;

import java.util.UUID;

/**
 * 文件上传的工具类
 * @author kykoo
 *
 */

public class UploadUtils {
	/**
	 * 生存唯一的文件名
	 */
	public static String getUUIDFileName(String fileName) {
		//将文件名的前面部分进行截取
		//lastIndexOf和indexOf一样，虽然数的方向不同，但是计数都是从前往后
		int idx=fileName.lastIndexOf(".");
		//substring返回字符串（a-b）之间的片段
		String extention = fileName.substring(idx);
		String uuidFileName=UUID.randomUUID().toString().replace("-", "")+extention;
		return uuidFileName;
		 
	}
	public static void main(String[] args) {
		System.out.println(getUUIDFileName(""));
	}
}
