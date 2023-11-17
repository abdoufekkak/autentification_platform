package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.CompteRequestDto;
import com.app.dto.CompteResponseDto;
import com.app.dto.DtoRequestRolle;
import com.app.dto.DtoResponseRole;
import com.app.entities.Compte;
import com.app.entities.Role;
import com.app.exception.Exception500;
import com.app.mapper.CompteMapper;
import com.app.mapper.MapperRolle;
import com.app.repo.CompteRepo;
import com.app.repo.RepoRole;

@Service
public class CompteService {

	@Autowired
	CompteRepo compteRepo;
	@Autowired 
	CompteMapper mapperCompte;
	
	public void deleteCompte(Integer id ){
		Compte compte = compteRepo.findById(id).orElse(null); 
		if(compte==null) { throw new com.app.exception.Exception404("compte not found");}
		compteRepo.delete(compte);	
		}
	public List<Compte> getAll(){
		return compteRepo.findAll();
	}
	public  CompteResponseDto addCompte(CompteRequestDto dtoRequestCompte) {	
		Compte compte=compteRepo.findByUsername(dtoRequestCompte.getUserName());
		Compte compte2=compteRepo.findByMail(dtoRequestCompte.getMail());
		if(compte!=null || compte2!=null) { throw new Exception500("compte already exist"); }
		compte=	mapperCompte.requestCompteToCompte(dtoRequestCompte);
		compte=compteRepo.save(compte);
		 return mapperCompte.compteToResponseDto(compte);
		}
}