package spring.hibernate.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.hibernate.dto.MovieTicketRequest;
import spring.hibernate.dto.MovieTicketResponse;
import spring.hibernate.entity.PaymentInfo;
import spring.hibernate.entity.TicketInfo;
import spring.hibernate.repository.PaymentInfoRepository;
import spring.hibernate.utility.AccountInfo;

@Service
public class PaymentInfoService {
	
	@Autowired 
	private PaymentInfoRepository paymentInfoRepository;
	
	public MovieTicketResponse doPayForTicket(MovieTicketRequest movieTicketRequest) {
		
		PaymentInfo paymentInfo = movieTicketRequest.getPaymentInfo();
		TicketInfo ticketInfo = movieTicketRequest.getTicketInfo();
		
        AccountInfo.validateCreditLimit(paymentInfo.getAccountNo(), ticketInfo.getTicketPrice());
		
		paymentInfo.setAmount(ticketInfo.getTicketPrice());
		paymentInfo.setTicketId(ticketInfo.getId());
		
		paymentInfo = paymentInfoRepository.save(paymentInfo);
		
		
		return new MovieTicketResponse("SUCCESS", ticketInfo.getTicketPrice(),UUID.randomUUID().toString().split("-")[0], ticketInfo);
	
		
	}

}
