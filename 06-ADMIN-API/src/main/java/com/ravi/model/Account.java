package com.ravi.model;

import java.time.LocalDate;

public class Account {
	
	private String name;
	private String emailId;
	private Long mobileNumber;
	private String gender;
	private LocalDate dob;
	private Integer ssn;
	
	public Account() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}
	

	@Override
	public String toString() {
		return "Account [name=" + name + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + ", gender="
				+ gender + ", dob=" + dob + ", ssn=" + ssn + "]";
	}
	
	

}
