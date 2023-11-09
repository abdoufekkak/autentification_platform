package com.app.entities;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compte implements Serializable{
	/**
	 * 
	 * 
	 */
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer Id;
	
    @Column(unique = true,nullable = false)
	public Integer mail;
    @Column(nullable = false)
	public Integer motPass;
	@Column(unique = true,nullable = false)
	public Integer userName;
}
