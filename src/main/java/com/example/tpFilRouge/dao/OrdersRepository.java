package com.example.tpFilRouge.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tpFilRouge.model.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
	
}