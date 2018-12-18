package com.biz.name.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.name.vo.NameVO;

public class NameService {

	List<NameVO> nList1;
	List<NameVO> nList2;
	FileReader fr;
	BufferedReader buffer;
	NameVO vo;
	String strName;
	String strLastName;
	String strKorName;

	public NameService(String strName, String strLastName, String strKorName) {
		nList1 = new ArrayList();
		nList2 = new ArrayList();
		vo = new NameVO();
		this.strName = strName;
		this.strLastName = strLastName;
		this.strKorName = strKorName;
	}

	public void readName() {

		try {
			fr = new FileReader(this.strName);
			buffer = new BufferedReader(fr);

			while (true) {
				String strRead = buffer.readLine();
				if (strRead == null)
					break;

				vo = new NameVO();

				vo.setStrName(strRead);

				nList1.add(vo);
			}
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // readName method end

	public void readLastName() {

		try {
			fr = new FileReader(this.strLastName);
			buffer = new BufferedReader(fr);

			while (true) {
				String strRead = buffer.readLine();
				if (strRead == null)
					break;
				String[] strSp = strRead.split(":");

				vo = new NameVO();
				vo.setStrLastName(strSp[1]);

				nList2.add(vo);

			}
			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void makeKorName() {
		PrintWriter pw;

		try {
			pw = new PrintWriter(this.strKorName);

			String strFullName;
			int intSize = nList1.size();
			for (int i = 0; i < intSize; i++) {
				int index1 = (int) (Math.random() * (intSize));
				int index2 = (int) (Math.random() * (intSize));
				strFullName = nList2.get(index1).getStrLastName() + nList1.get(index2).getStrName();
				pw.println((i + 1) + ":" + strFullName);
			}
			pw.close();
			System.out.println("Save Complete");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
