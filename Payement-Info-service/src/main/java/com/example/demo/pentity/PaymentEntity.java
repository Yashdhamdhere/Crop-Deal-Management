package com.example.demo.pentity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Payments")
public class PaymentEntity {
	
	@Id
	private int paymentId;
	private String paymnetStatus;
	private String txId;
	private int orderId;
	private long totalAmount;
	
	//Default constructor
	public PaymentEntity() {
		
	}
	//Parameterized constructor
	public PaymentEntity(int paymentId, String paymnetStatus, String txId, int orderId, long totalAmount) {
		super();
		this.paymentId = paymentId;
		this.paymnetStatus = paymnetStatus;
		this.txId = txId;
		this.orderId = orderId;
		this.totalAmount = totalAmount;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymnetStatus() {
		return paymnetStatus;
	}
	public void setPaymnetStatus(String paymnetStatus) {
		this.paymnetStatus = paymnetStatus;
	}
	public String getTxId() {
		return txId;
	}
	public void setTxId(String txId) {
		this.txId = txId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	

}
