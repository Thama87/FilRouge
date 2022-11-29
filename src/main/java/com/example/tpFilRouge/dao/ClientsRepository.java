package com.example.tpFilRouge.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tpFilRouge.model.Clients;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long> {
	
}