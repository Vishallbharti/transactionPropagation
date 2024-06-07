package spring.hibernate.dto;

import spring.hibernate.entity.TicketInfo;
import spring.hibernate.entity.PaymentInfo;

public class MovieTicketRequest {
	
	private TicketInfo ticketInfo;
	private PaymentInfo paymentInfo;
	
	public MovieTicketRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketInfo getTicketInfo() {
		return ticketInfo;
	}

	public void setTicketInfo(TicketInfo ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	@Override
	public String toString() {
		return "MovieTicketRequest [ticketInfo=" + ticketInfo + ", paymentInfo=" + paymentInfo + "]";
	}
	
	
	

}
