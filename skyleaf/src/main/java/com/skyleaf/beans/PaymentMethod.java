package com.skyleaf.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentMethod {
	@Id
	private String id;
	private int amount;
	private String merchantrefnum;
	private String action;
	private String currencycode;
	private String usage;
	private String status;
	private  int timetoliveseconds;
	private  String transactiontype;
	private String paymenttype;
	private String executionmode;
	private String customerip;
	private String paymenthandletoken ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMerchantrefnum() {
		return merchantrefnum;
	}
	public void setMerchantrefnum(String merchantrefnum) {
		this.merchantrefnum = merchantrefnum;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTimetoliveseconds() {
		return timetoliveseconds;
	}
	public void setTimetoliveseconds(int timetoliveseconds) {
		this.timetoliveseconds = timetoliveseconds;
	}
	public String getTransactiontype() {
		return transactiontype;
	}
	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public String getExecutionmode() {
		return executionmode;
	}
	public void setExecutionmode(String executionmode) {
		this.executionmode = executionmode;
	}
	public String getCustomerip() {
		return customerip;
	}
	public void setCustomerip(String customerip) {
		this.customerip = customerip;
	}
	public String getPaymenthandletoken() {
		return paymenthandletoken;
	}
	public void setPaymenthandletoken(String paymenthandletoken) {
		this.paymenthandletoken = paymenthandletoken;
	}
	@Override
	public String toString() {
		return "PaymentMethod [id=" + id + ", amount=" + amount + ", merchantrefnum=" + merchantrefnum + ", action="
				+ action + ", currencycode=" + currencycode + ", usage=" + usage + ", status=" + status
				+ ", timetoliveseconds=" + timetoliveseconds + ", transactiontype=" + transactiontype + ", paymenttype="
				+ paymenttype + ", executionmode=" + executionmode + ", customerip=" + customerip
				+ ", paymenthandletoken=" + paymenthandletoken + "]";
	}
	

}
