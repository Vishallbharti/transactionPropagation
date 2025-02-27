package spring.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.hibernate.dto.MovieTicketRequest;
import spring.hibernate.dto.MovieTicketResponse;
import spring.hibernate.service.MovieTicketService;

@RestController
@RequestMapping("/v1/movie")
public class MovieTicketController {
	
	@Autowired
	private MovieTicketService movieTicketService;
	
	
	@PostMapping
	public MovieTicketResponse bookMovieTicket(@RequestBody MovieTicketRequest movieTicketRequest) {
		return movieTicketService.bookMovieTicket(movieTicketRequest);
	}

}
