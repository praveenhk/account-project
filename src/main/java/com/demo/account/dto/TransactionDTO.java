package com.demo.account.dto;

public class TransactionDTO {
	
	
	String acctNo;
	String ccy;
	String drCr;
	String txnDate;
	String txnAmount;
	String txnDesc;

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
	
	public TransactionDTO(String acctNo,String ccy, String drCr, String txnDate,
			String txnAmount, String txnDesc) {
		super();
		this.acctNo = acctNo;
		this.ccy = ccy;
		this.drCr = drCr;
		this.txnDate = txnDate;
		this.txnAmount = txnAmount;
		this.txnDesc = txnDesc;
	}
	public TransactionDTO() {
	}
	
}
