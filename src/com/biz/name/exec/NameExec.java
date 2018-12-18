package com.biz.name.exec;

import com.biz.name.service.NameService;

public class NameExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strName = "src/com/biz/name/vo/이름리스트.txt";
		String strLastName = "src/com/biz/name/vo/한국인성씨.txt";
		String strKorName = "src/com/biz/name/exec/한국인이름리스트.txt";
		
		NameService ns = new NameService(strName, strLastName, strKorName);
		
		ns.readName();
		ns.readLastName();
		
		ns.makeKorName();

	}

}
