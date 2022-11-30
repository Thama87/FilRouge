package com.example.tpFilRouge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tpFilRouge.model.Orders;
import com.example.tpFilRouge.service.OrdersDirectory;

@RestController
@RequestMapping("api")
public class OrdersController {
	@Autowired
	private OrdersDirectory ordersDirectory;
	
	@GetMapping("orders")
	public List<Orders> getOrders() {
		return ordersDirectory.getOrders();
	}
	
	@GetMapping("order/{id}")
	public ResponseEntity<Orders> getOrders(@PathVariable("id") Long id){
		Optional<Orders> order = ordersDirectory.getOrder(id);
		if(order.isEmpty()){
			return ResponseEntity.notFound().build();
		}
		else{
			return ResponseEntity.ok(order.get());
		}
	}
	
	@PostMapping("order")
	public Orders postOrder(@RequestBody Orders newOrder) {
		ordersDirectory.postOrder(newOrder);		
		return newOrder;
	}
	
	@DeleteMapping("order/{id}")
	public void deleteOrder(@PathVariable("id") Long id){
		ordersDirectory.deleteOrder(id);
	}
	
	@PutMapping("order/{id}")
	public ResponseEntity<Orders> updateOrder(@RequestBody Orders order, @PathVariable("id") Long id){
		if(!order.getId().equals(id)){
			return ResponseEntity.badRequest().build();
		}
		else {
			ordersDirectory.updateOrder(order, id);
			return ResponseEntity.ok().build();
		}
	}
}