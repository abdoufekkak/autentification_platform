package com.app.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.DTOResponseAdmin;
import com.app.dto.DtoRequestAdmin;
import com.app.entities.Admin;
import com.app.mapper.MapperAdmin;
import com.app.repo.RepoAdmin;



@Service
public class ServiceAdmin {
	@Autowired
	private RepoAdmin repoAdmin;
	@Autowired
	private MapperAdmin mapperAdmin ;
	public List <Admin> getAdmin(){
		return repoAdmin.findAll();
	}
	
	public DTOResponseAdmin AddAdmin(DtoRequestAdmin dtoRequestAdmin){
		Admin admin2=repoAdmin.findByUsername(dtoRequestAdmin.getUsername());
		if(admin2!=null) { throw new Exception500("admin already exist"); }
		Admin admin= mapperAdmin.requestAdminToAdmin(dtoRequestAdmin);
		 admin=repoAdmin.save(admin);
		 return mapperAdmin.adminToResponseDto(admin);
	}

	public void deleteAdmin(Integer Id) {
		Admin admin2=repoAdmin.findById(Id).orElse(null);
		if(admin2==null) { throw new Exception404("admin not found");}
	   repoAdmin.delete(admin2);
	}
	
	public DTOResponseAdmin ModifyAdmin(DtoRequestAdmin dtoRequestAdmin,Integer Id){
		Admin admin2=repoAdmin.findById(Id).orElse(null);
		if(admin2==null) { throw new Exception404("admin not found"); }
		Admin admin= mapperAdmin.requestAdminToAdmin(dtoRequestAdmin);
	
		return mapperAdmin.adminToResponseDto(repoAdmin.save(admin));
	}
	public void AssignRole(Admin admin) {
		
	}
	
}