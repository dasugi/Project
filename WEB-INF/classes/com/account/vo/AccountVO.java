package com.account.vo;

public class AccountVO {
	private String email, pwd, fname, lname, phone;
	private int birthy, birthm, birthd;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getBirthy() {
		return birthy;
	}
	public void setBirthy(int birthy) {
		this.birthy = birthy;
	}
	public int getBirthm() {
		return birthm;
	}
	public void setBirthm(int birthm) {
		this.birthm = birthm;
	}
	public int getBirthd() {
		return birthd;
	}
	public void setBirthd(int birthd) {
		this.birthd = birthd;
	}
	@Override
	public String toString() {
		return "AccountVO [email=" + email + ", pwd=" + pwd + ", fname=" + fname + ", lname=" + lname + ", phone="
				+ phone + ", birthy=" + birthy + ", birthm=" + birthm + ", birthd=" + birthd + "]";
	}
}
