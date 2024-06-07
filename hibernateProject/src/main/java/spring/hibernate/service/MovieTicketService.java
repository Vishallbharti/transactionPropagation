package spring.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import spring.hibernate.dto.MovieTicketRequest;
import spring.hibernate.dto.MovieTicketResponse;
import spring.hibernate.entity.TicketInfo;
import spring.hibernate.repository.TicketInfoRepository;

@Service
public class MovieTicketService {

	@Autowired
	private TicketInfoRepository ticketInfoRepository;

	@Autowired
	private PaymentInfoService paymentInfoService;

	@Transactional
	public MovieTicketResponse bookMovieTicket(MovieTicketRequest movieTicketRequest) {

		TicketInfo ticketInfo = movieTicketRequest.getTicketInfo();
		ticketInfo = ticketInfoRepository.save(ticketInfo);

		return paymentInfoService.doPayForTicket(movieTicketRequest);
	}

}
