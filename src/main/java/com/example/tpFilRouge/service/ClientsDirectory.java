package com.example.tpFilRouge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tpFilRouge.dao.ClientsRepository;
import com.example.tpFilRouge.model.Clients;

@Service
public class ClientsDirectory {
	@Autowired
	private ClientsRepository clientsRepository;

	public List<Clients> getClients() {
		return clientsRepository.findAll();
	}
	
	public Optional<Clients> getClient(Long id) {
		return clientsRepository.findById(id);
	}
	
	public void postClient(Clients newClient) {
		clientsRepository.save(newClient);
	}
}
