package com.webtechie.restaurantservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webtechie.restaurantservice.dto.OrderResponseDTO;
import com.webtechie.restaurantservice.service.RestaurentService;

@RestController
@RequestMapping("/restaurant")
public class RestaurentController {

	@Autowired
	private RestaurentService service;

	@GetMapping("/greeting")
	public String greetingMessage() {
		return service.greeting();
	}

	@GetMapping("/orders/status/{orderId}")
	public OrderResponseDTO getOrder(@PathVariable String orderId) {
		return service.getOrder(orderId);
	}
}
