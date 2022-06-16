package com.javaex.vo;

public class GuestBookVo {
	
	private int no;
	private String name;
	private String password;
	private String regDate;
	private String content;
	
	public GuestBookVo() {
		
	}
	
	public GuestBookVo(int no, String name, String password, String regDate, String content) {
		this.no = no;
		this.name = name;
		this.password = password;
		this.regDate = regDate;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "GuestBookVo [no=" + no + ", name=" + name + ", password=" + password + ", regDate=" + regDate
				+ ", content=" + content + "]";
	}
	
}
