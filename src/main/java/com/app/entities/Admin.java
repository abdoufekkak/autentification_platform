package com.app.entities;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
@AllArgsConstructor
public class Admin implements Serializable{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private Integer Id;
	private String nom;
	private String username;
	private String mdp;
	
	 @ManyToMany
	    private List<Role> roles = new ArrayList<>();
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

