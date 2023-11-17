package com.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CompteRequestDto;
import com.app.dto.CompteResponseDto;
import com.app.entities.Compte;
import com.app.service.CompteService;

@RestController
@RequestMapping("cmopte/")
public class CompteWeb {
	@Autowired
	CompteService compteService;
	
	@GetMapping("")
	public ResponseEntity<List<Compte>> getRolles() {
	    List<Compte> listRoles = compteService.getAll(); 
	    return new ResponseEntity<>(listRoles, HttpStatus.OK);
	}
	@PostMapping("")
	public ResponseEntity<CompteResponseDto > addRolle(@RequestBody CompteRequestDto dtoRequestCompte) {
		CompteResponseDto compteResponseDto=	compteService.addCompte(dtoRequestCompte);
		return  new ResponseEntity<>(compteResponseDto,HttpStatus.CREATED);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteCompte(@PathVariable Integer id) {
		compteService.deleteCompte(id);
	        return ResponseEntity.noContent().build();
	}
}
