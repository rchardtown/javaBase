package com.test;

import java.io.File;

public class RemoveFileOrDirectory {
	public static void main(String[] args) {
		//File ֻ��ʶ��·��ȥ����File���󣬲��ܴ���·��
		File folder=new File("E:/Test/");
		//ͨ��file����ȥ����isDirectory����������ֵΪbooleanֵ
		if (! folder.isDirectory()) {
			//��file����ȥ����Ŀ¼
			folder.mkdirs();
		}
		delteFolder(folder);
	}
	//����ɾ��ָ��Ŀ¼�������е��ļ�
	public static void delteFolder(File folder) {
		//File�������list������������ʱString[] 
		//File�������listFile��������������File[]
		File [] files =folder.listFiles();
		for (File file : files) {
			if (file != null ) {
				for (File f : files) {
					//�ж�ÿһ��f,�Ƿ�ΪĿ¼��������Ǽ�������delteFolder����
					if (f.isDirectory()) {
						delteFolder(f);
					}else {
						//ȷ�������ļ�ʱ��ɾ��
						f.delete();
					}
				}
			}
		}
	}
}
