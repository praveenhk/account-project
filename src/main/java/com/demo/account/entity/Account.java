package com.demo.account.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)	  
	Long id;
	String clientNo;
	String acctNo;
	String acctName;
	String acctType;
	String balDate;
	String ccy;
	String openingAvlBal;
	
	
	public Long getId() {
		return id;
	}
	public String getClientNo() {
		return clientNo;
	}
	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getBalDate() {
		return balDate;
	}
	public void setBalDate(String balDate) {
		this.balDate = balDate;
	}
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	public String getOpeningAvlBal() {
		return openingAvlBal;
	}
	public void setOpeningAvlBal(String openingAvlBal) {
		this.openingAvlBal = openingAvlBal;
	}
	public Account(String clientNo, String acctNo, String acctName, String acctType, String balDate, String ccy,
			String openingAvlBal) {
		super();
		this.clientNo = clientNo;
		this.acctNo = acctNo;
		this.acctName = acctName;
		this.acctType = acctType;
		this.balDate = balDate;
		this.ccy = ccy;
		this.openingAvlBal = openingAvlBal;
	}
	public Account() {
	}
}
