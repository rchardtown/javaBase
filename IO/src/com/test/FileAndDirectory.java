package com.test;

import java.io.File;

public class FileAndDirectory {
	public static void main(String[] args) {
		// ָ��Ŀ¼··��directoryPath
		String directoryPath = "E:/";
		// ����File����
		File direcotory = new File(directoryPath);
		// �ж�File�Ƿ�ΪĿ¼���粻�Ǵ���·��direcotory
		if (!direcotory.isDirectory()) {
			// ��File����������directory����
			direcotory.mkdirs();
		}
		// ��ȡdirecotory���µ�Ŀ¼���ļ������ַ����������ʽչʾ
		String[] sArray = direcotory.list();
		// �жϸ��ַ��������ÿһ��Ԫ���Ƿ�ΪĿ¼���ļ�ff
		for (String string : sArray) {
			File fileType = new File(directoryPath+string);
			// �ֱ����Ŀ¼���ļ�������
			if (fileType.isDirectory()) {
				System.out.println(fileType+"�Ǹ�Ŀ¼");
			}else {
				System.out.println(fileType+"�Ǹ��ļ�");
				
			}

		}
		

	}
}
