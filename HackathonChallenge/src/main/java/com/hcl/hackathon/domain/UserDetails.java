package com.hcl.hackathon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_userdetails")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "balance_amt")
	private String balanceAmt;

	@Column(name = "interest_rate")
	private String interestRate;

	@Column(name = "contact_no")
	private String contactNo;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "kyc")
	private String KYC;

	@Column(name = "role")
	private String role;

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getInterestRate() {
		return interestRate;
	}

	public String getContactNo() {
		return contactNo;
	}

	public String getUsername() {
		return username;
	}

	public String getKYC() {
		return KYC;
	}

	public String getBalanceAmt() {
		return balanceAmt;
	}

	public String getRole() {
		return role;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBalanceAmt(String balanceAmt) {
		this.balanceAmt = balanceAmt;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setKYC(String kYC) {
		KYC = kYC;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
