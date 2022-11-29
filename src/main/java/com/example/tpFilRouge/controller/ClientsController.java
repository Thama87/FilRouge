package com.example.tpFilRouge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tpFilRouge.model.Clients;
import com.example.tpFilRouge.service.ClientsDirectory;

@RestController
@RequestMapping("api")
public class ClientsController {

	@Autowired
	private ClientsDirectory clientsDirectory;
	
	@GetMapping("clients")
	public List<Clients> getClients() {
		return clientsDirectory.getClients();
	}
}
