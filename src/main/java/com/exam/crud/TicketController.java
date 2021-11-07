package com.exam.crud;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tickets")
public class TicketController {
	private final TicketRepository ticketRepository;

	@Autowired
	public TicketController(TicketRepository ticketRepository) {
		super();
		this.ticketRepository = ticketRepository;
	}

	@GetMapping("/")
	public String ticketList(Model model) {
		Iterable<Ticket> list = ticketRepository.findAll();
		model.addAttribute("tickets", list);
		return "ticketList";
	}

	@GetMapping("/search")
	public String ticketSearchShow(Ticket ticket) {
		return "ticketSearch";
	}

	@PostMapping("/search2")
	public String ticketSearch(@Valid Ticket ticket, Model model) {
		// Ticket ticket2 = ticketRepository.findById(ticket.getId()).orElseThrow(() ->
		// new IllegalArgumentException("Invalid student Id:"));;
		// Iterable<Ticket> tickets =
		// ticketRepository.findByTransportName(ticket.getTransportName());
		// Iterable<Ticket> tickets = ticketRepository.findAll();
		Iterable<Ticket> tickets = ticketRepository.findBySourceAndDestination(ticket.getSource(),
				ticket.getDestination());
		model.addAttribute("tickets", tickets);
		return "ticketList";
	}

	@GetMapping("/show/{id}")
	public String ticketUpdateShow(@PathVariable("id") Long id, Model model) {
		Ticket ticket = ticketRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid student Id:"));
		model.addAttribute("ticket", ticket);
		return "ticketShow";
	}

	@PostMapping("/book/{id}")
	public String ticketUpdateBook(@PathVariable("id") Long id, @Valid Ticket ticket, BindingResult result,
			Model model) {
		// ticket = ticketRepository.findById(id).orElseThrow(() -> new
		// IllegalArgumentException("Invalid student Id:"));
		if (result.hasErrors()) {
			return "ticketSearch";
		}
		// ticket.setAvailableSeats(ticket.getTotalSeats()-ticket.getBookedSeats());
		ticketRepository.save(ticket);

		Iterable<Ticket> tickets = ticketRepository.findAll();

		model.addAttribute("tickets", tickets);
		return "ticketList";
	}

}
