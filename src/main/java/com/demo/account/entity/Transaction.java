package com.demo.account.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)	  
	Long id;
	
	String acctNo;
	String ccy;
	String drCr;
	String txnDate;
	String txnAmount;
	String txnDesc;

	public Long getId() {
		return id;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	public String getDrCr() {
		return drCr;
	}
	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}
	public String getTxnAmount() {
		return txnAmount;
	}
	public void setTxnAmount(String txnAmount) {
		this.txnAmount = txnAmount;
	}
	public String getTxnDesc() {
		return txnDesc;
	}
	public void setTxnDesc(String txnDesc) {
		this.txnDesc = txnDesc;
	}
	public String getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(String txnDate) {
		this.txnDate = txnDate;
	}
	
	public Transaction(String acctNo,String ccy, String drCr, String txnDate,
			String txnAmount, String txnDesc) {
		super();
		this.acctNo = acctNo;
		this.ccy = ccy;
		this.drCr = drCr;
		this.txnDate = txnDate;
		this.txnAmount = txnAmount;
		this.txnDesc = txnDesc;
	}
	public Transaction() {
	}
	
}
