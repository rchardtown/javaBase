package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileInputTest {
	public static void main(String[] args) throws IOException {
		// 创建文件
		File file = new File("E:/newFile.txt");
		// 用文件创建文件输出流对象
		FileOutputStream fop = new FileOutputStream(file);
		// 用文件输出流对象创建文件写入对象，并设置写入时的编码格式
		OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
		// 添加数据到缓存
		writer.append("中文字符");
		writer.append("\r\n");
		writer.append("ENGLISH LANGUAGE");
		// 关闭 写入流
		writer.close();
		// 关闭文件流
		fop.close();
		// 创建文件读取流
		FileInputStream fis = new FileInputStream("E:/newFile.txt");
		// 用文件读取流创建文件读取对象，并设置读取时的编码格式
		InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
		// 创建StringBuffer对象
		StringBuffer sb = new StringBuffer();
		// 判断此流是否可以被读取，如果可以直接读取
		while (reader.ready()) {
			// 将读取的结果，存储在StringBuffer中
			sb.append((char) reader.read());
		}

		// StringBuffer转换为String对象打印出来
		System.out.println(sb.toString());
		// 关闭读入流
		reader.close();
		//关闭文件时输入流
		fis.close();
		

	}
}