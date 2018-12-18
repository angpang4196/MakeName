package com.biz.name.vo;

public class NameVO {

	private String strLastName;
	private String strName;
	private String strKorName;

	public String getStrLastName() {
		return strLastName;
	}

	public void setStrLastName(String strLastName) {
		this.strLastName = strLastName;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrKorName() {
		return strKorName;
	}

	public void setStrKorName(String strKorName) {
		this.strKorName = strKorName;
	}

	@Override
	public String toString() {
		return "NameVO [strLastName=" + strLastName + ", strName=" + strName + ", strKorName=" + strKorName + "]";
	}

}
