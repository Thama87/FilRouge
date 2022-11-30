package com.example.tpFilRouge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tpFilRouge.dao.OrdersRepository;
import com.example.tpFilRouge.model.Orders;

@Service
public class OrdersDirectory {
	@Autowired
	private OrdersRepository ordersRepository;

	public List<Orders> getOrders() {
		return ordersRepository.findAll();
	}
	
	public Optional<Orders> getOrder(Long id) {
		return ordersRepository.findById(id);
	}
	
	public void postOrder(Orders newOrder) {
		ordersRepository.save(newOrder);
	}
	
	public void deleteOrder(Long id){
		ordersRepository.deleteById(id);
	}

	public void updateOrder(Orders orderToUpdate, Long id){
		ordersRepository.save(orderToUpdate);
	}
}
