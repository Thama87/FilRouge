package com.example.tpFilRouge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
//A VOIR INIT VIDE
@Entity
@Table(name="clients")
public class Clients {
	
	//-------------------------------------------------------------------------------------------------//
	//---------------------------------------- Colonnes -----------------------------------------------//
	//-------------------------------------------------------------------------------------------------//
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(columnDefinition = "int")
	private Long id;
	@Column(name="company_name")
	private String company_name="";
	@Column(name="first_name")
	private String first_name="";
	@Column(name="last_name")
	private String last_name="";
	@Column(name="email")
	private String email="";
	@Column(name="phone")
	private String phone="";
	@Column(name="address", columnDefinition="LONGTEXT")
	@Type(type = "text")
	private String address="";
	@Column(name="zip_code")
	private String zip_code="";
	@Column(name="city")
	private String city="";
	@Column(name="country")
	private String country="";
	@Column(name="state", columnDefinition="BIT")
	private ClientsState state;

	//-------------------------------------------------------------------------------------------------//
	//---------------------------------------- Contructeurs -------------------------------------------//
	//-------------------------------------------------------------------------------------------------//
	
	public Clients() {}
	
	
	public Clients(Long id, String company_name, String first_name, String last_name, String email, String phone,
			String address, String zip_code, String city, String country, ClientsState state) {
		this.id = id;
		this.company_name = company_name;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.zip_code = zip_code;
		this.city = city;
		this.country = country;
		this.state = state;
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
	
	
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public ClientsState getState() {
		return state;
	}
	public void setState(ClientsState state) {
		this.state = state;
	}
	
	//-------------------------------------------------------------------------------------------------//
	//---------------------------------------- Méthodes -----------------------------------------------//
	//-------------------------------------------------------------------------------------------------//
	
	@Override
	public String toString() {
		return "Clients [id=" + id + ", company_name=" + company_name + ", first_name=" + first_name + ", last_name="
				+ last_name + ", email=" + email + ", phone=" + phone + ", address=" + address + ", zip_code="
				+ zip_code + ", city=" + city + ", country=" + country + ", state=" + state + "]";
	}
}