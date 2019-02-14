package com.gl.course.form;

public class EnrollmentForm {
	private String userName;
	private String emailAddress;
	private String mobileNumber;
	private String password;

	public EnrollmentForm() {
		// 0-arg constructor
	}

	public EnrollmentForm(String userName, String emailAddress, String mobileNumber, String password) {
		this.userName = userName;
		this.emailAddress = emailAddress;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
