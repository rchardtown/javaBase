package com.test;

import java.io.File;

public class RemoveFileOrDirectory {
	public static void main(String[] args) {
		//File 只能识别路径去创建File对象，不能创建路径
		File folder=new File("E:/Test/");
		//通过file对象去调用isDirectory方法，返回值为boolean值
		if (! folder.isDirectory()) {
			//用file对象去创建目录
			folder.mkdirs();
		}
		delteFolder(folder);
	}
	//迭代删除指定目录地下所有的文件
	public static void delteFolder(File folder) {
		//File对象调用list方法，创建的时String[] 
		//File对象调用listFile方法，创建的是File[]
		File [] files =folder.listFiles();
		for (File file : files) {
			if (file != null ) {
				for (File f : files) {
					//判断每一个f,是否为目录，如果不是继续嗲用delteFolder方法
					if (f.isDirectory()) {
						delteFolder(f);
					}else {
						//确认了是文件时，删除
						f.delete();
					}
				}
			}
		}
	}
}
