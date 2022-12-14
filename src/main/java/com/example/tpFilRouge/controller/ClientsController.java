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
	
	@GetMapping("client/{id}")
	public ResponseEntity<Clients> getClient(@PathVariable("id") Long id){
		Optional<Clients> client = clientsDirectory.getClient(id);
		if(client.isEmpty()){
			return ResponseEntity.notFound().build();
		}
		else{
			return ResponseEntity.ok(client.get());
		}
	}
	
	@PostMapping("client")
	public Clients postClient(@RequestBody Clients newClient) {
		clientsDirectory.postClient(newClient);		
		return newClient;
	}
	
	@DeleteMapping("client/{id}")
	public void deleteClient(@PathVariable("id") Long id){
		clientsDirectory.deleteClient(id);
	}
	
	@PutMapping("client/{id}")
	public ResponseEntity<Clients> updateClient(@RequestBody Clients client, @PathVariable("id") Long id){
		if(!client.getId().equals(id)){
			return ResponseEntity.badRequest().build();
		}
		else {
			clientsDirectory.updateClient(client, id);
			return ResponseEntity.ok().build();
		}
	}
}
