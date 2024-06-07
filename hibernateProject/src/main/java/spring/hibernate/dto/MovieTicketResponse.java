package spring.hibernate.dto;

import spring.hibernate.entity.TicketInfo;

public class MovieTicketResponse {
	
	private String status;
	private double totalFare;
	private String prnNo;
	private TicketInfo ticketInfo;
	public MovieTicketResponse() {
		super();
	}
	public MovieTicketResponse(String status, double totalFare, String prnNo, TicketInfo ticketInfo) {
		super();
		this.status = status;
		this.totalFare = totalFare;
		this.prnNo = prnNo;
		this.ticketInfo = ticketInfo;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	public String getPrnNo() {
		return prnNo;
	}
	public void setPrnNo(String prnNo) {
		this.prnNo = prnNo;
	}
	public TicketInfo getTicketInfo() {
		return ticketInfo;
	}
	public void setTicketInfo(TicketInfo ticketInfo) {
		this.ticketInfo = ticketInfo;
	}
	@Override
	public String toString() {
		return "MovieTicketResponse [status=" + status + ", totalFare=" + totalFare + ", prnNo=" + prnNo
				+ ", ticketInfo=" + ticketInfo + "]";
	}
	
	

}
