package com.example.tpFilRouge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	//-------------------------------------------------------------------------------------------------//
	//---------------------------------------- Colonnes -----------------------------------------------//
	//-------------------------------------------------------------------------------------------------//
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(columnDefinition = "int")
	private Long id;
	@ManyToOne
	private Clients client;
	@Column(name="type_presta")
	private String type_presta="";
	@Column(name="designation")
	private String designation="";
	@Column(name="nb_days")
	private int nb_days;
	@Column(name="unit_price")
	private float unit_price;
	@Column(name="state")
	private Boolean state;

	//-------------------------------------------------------------------------------------------------//
	//---------------------------------------- Contructeurs -------------------------------------------//
	//-------------------------------------------------------------------------------------------------//
	
	public Orders() {}
	
	
	public Orders(Long id, Clients client, String type_presta, String designation, int nb_days, float unit_price) {
		this.id = id;
		this.client = client;
		this.type_presta = type_presta;
		this.designation = designation;
		this.nb_days = nb_days;
		this.unit_price = unit_price;
		this.state = true;
	}

	//-------------------------------------------------------------------------------------------------//
	//---------------------------------------- Getters et Setters -------------------------------------//
	//-------------------------------------------------------------------------------------------------//
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Clients getClient() {
		return client;
	}
	public void setClient(Clients client) {
		this.client = client;
	}
	
	
	public String getType_presta() {
		return type_presta;
	}
	public void setType_presta(String type_presta) {
		this.type_presta = type_presta;
	}
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public int getNb_days() {
		return nb_days;
	}
	public void setNb_days(int nb_days) {
		this.nb_days = nb_days;
	}
	
	
	public float getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(float unit_price) {
		this.unit_price = unit_price;
	}
	
	
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	
	//-------------------------------------------------------------------------------------------------//
	//---------------------------------------- Méthodes -----------------------------------------------//
	//-------------------------------------------------------------------------------------------------//
	
	@Override
	public String toString() {
		return "Orders [id=" + id + ", client=" + client + ", type_presta=" + type_presta + ", designation="
				+ designation + ", nb_days=" + nb_days + ", unit_price=" + unit_price + ", state=" + state + "]";
	}


}
