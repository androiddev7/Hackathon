package com.hcl.hackathon.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_request")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lender_id", nullable = false)
	private UserDetails lender;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "borrower_id", nullable = false)
	private UserDetails borrower;

	@Column(name = "amount")
	private Long amount;

	@Column(name = "interest")
	private String interest;

	@Column(name = "emi")
	private Long emi;

	@Column(name = "tenure_month")
	private Long tenureInMonths;

	@Column(name = "create_date")
	private Date createDate;

	@Column(name = "status")
	private String status;

	public Long getId() {
		return id;
	}

	public UserDetails getLender() {
		return lender;
	}

	public void setLender(UserDetails lender) {
		this.lender = lender;
	}

	public UserDetails getBorrower() {
		return borrower;
	}

	public void setBorrower(UserDetails borrower) {
		this.borrower = borrower;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public Long getEmi() {
		return emi;
	}

	public void setEmi(Long emi) {
		this.emi = emi;
	}

	public Long getTenureInMonths() {
		return tenureInMonths;
	}

	public void setTenureInMonths(Long tenureInMonths) {
		this.tenureInMonths = tenureInMonths;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
