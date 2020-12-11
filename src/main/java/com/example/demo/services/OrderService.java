package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.models.Address;
import com.example.demo.models.Order;

@Service
public class OrderService {
	final static Logger logger = LoggerFactory.getLogger(OrderService.class);
	
	public int createOrder() {
		return 1;
	}
	
	public Order getOrder(int id) {
		Order order = new Order();
		
		order.setId(id);
		order.setItem("Laptop");
		order.setPrice(1000f);
		
		List<Address> addresses = new ArrayList<Address>();
		Address address = new Address();
		address.setType("COMMUNICATION");
		address.setStreetName("Comm Street 1");
		address.setPin("12345");
		addresses.add(address);
		
		address = new Address();
		address.setType("DELIVERY");
		address.setStreetName("Deli Street 1");
		address.setPin("09876");
		addresses.add(address);
		
		order.setAddresses(addresses);
		
		return order;
	}
	
	public List<Order> getOrders() {
		List<Order> orders = new ArrayList<Order>();
		Order order = this.getOrder(1);
		orders.add(order);
		order = this.getOrder(2);
		orders.add(order);
		return orders;
	}
	
}
