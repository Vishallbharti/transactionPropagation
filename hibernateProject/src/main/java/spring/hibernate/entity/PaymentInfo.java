package spring.hibernate.entity;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PAYMENT_INFO")
public class PaymentInfo {

	@Id
	@UuidGenerator
	private String paymentId;
	private String accountNo;
	private double amount;
	private String cardType;
	private long ticketId;
	
	public PaymentInfo() {
		super();
	}

	public PaymentInfo(String accountNo, double amount, String cardType, long ticketId) {
		super();
		this.accountNo = accountNo;
		this.amount = amount;
		this.cardType = cardType;
		this.ticketId = ticketId;
	}

	public PaymentInfo(String paymentId, String accountNo, double amount, String cardType, long ticketId) {
		super();
		this.paymentId = paymentId;
		this.accountNo = accountNo;
		this.amount = amount;
		this.cardType = cardType;
		this.ticketId = ticketId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	@Override
	public String toString() {
		return "PaymentInfo [paymentId=" + paymentId + ", accountNo=" + accountNo + ", amount=" + amount + ", cardType="
				+ cardType + ", ticketId=" + ticketId + "]";
	}
	
	
	
}
