package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileInputTest {
	public static void main(String[] args) throws IOException {
		// �����ļ�
		File file = new File("E:/newFile.txt");
		// ���ļ������ļ����������
		FileOutputStream fop = new FileOutputStream(file);
		// ���ļ���������󴴽��ļ�д����󣬲�����д��ʱ�ı����ʽ
		OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
		// ������ݵ�����
		writer.append("�����ַ�");
		writer.append("\r\n");
		writer.append("ENGLISH LANGUAGE");
		// �ر� д����
		writer.close();
		// �ر��ļ���
		fop.close();
		// �����ļ���ȡ��
		FileInputStream fis = new FileInputStream("E:/newFile.txt");
		// ���ļ���ȡ�������ļ���ȡ���󣬲����ö�ȡʱ�ı����ʽ
		InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
		// ����StringBuffer����
		StringBuffer sb = new StringBuffer();
		// �жϴ����Ƿ���Ա���ȡ���������ֱ�Ӷ�ȡ
		while (reader.ready()) {
			// ����ȡ�Ľ�����洢��StringBuffer��
			sb.append((char) reader.read());
		}

		// StringBufferת��ΪString�����ӡ����
		System.out.println(sb.toString());
		// �رն�����
		reader.close();
		//�ر��ļ�ʱ������
		fis.close();
		

	}
}