package com.test;

import java.io.File;

public class FileAndDirectory {
	public static void main(String[] args) {
		// 指定目录路路径directoryPath
		String directoryPath = "E:/";
		// 创建File对象
		File direcotory = new File(directoryPath);
		// 判断File是否为目录，如不是创建路径direcotory
		if (!direcotory.isDirectory()) {
			// 用File对象来创建directory对象
			direcotory.mkdirs();
		}
		// 获取direcotory底下的目录和文件，以字符串数组的形式展示
		String[] sArray = direcotory.list();
		// 判断该字符串数组的每一个元素是否为目录或文件ff
		for (String string : sArray) {
			File fileType = new File(directoryPath+string);
			// 分别输出目录和文件的名称
			if (fileType.isDirectory()) {
				System.out.println(fileType+"是个目录");
			}else {
				System.out.println(fileType+"是个文件");
				
			}

		}
		

	}
}
