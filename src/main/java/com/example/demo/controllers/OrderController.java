package com.example.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Order;
import com.example.demo.services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	final static Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	OrderService orderService;
	
	@PostMapping
	public int createOrder() {
		logger.debug("---------> Create order.");
		return this.orderService.createOrder();
	}
	
	@GetMapping
	public Order getOrder(@RequestHeader("accept") String accept) {
		logger.debug("---------> Get order.");
		return this.orderService.getOrder(1);
	}
	
	@GetMapping("/all")
	public List<Order> getOrders() {
		logger.debug("---------> Get orders.");
		return this.orderService.getOrders();
	}

}
