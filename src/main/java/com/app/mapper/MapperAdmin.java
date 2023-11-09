package com.app.mapper;

import org.springframework.stereotype.Component;

import com.app.dto.DTOResponseAdmin;
import com.app.dto.DtoRequestAdmin;
import com.app.entities.Admin;


@Component
public class MapperAdmin {
   public Admin requestAdminToAdmin(DtoRequestAdmin dtoRequestAdmin) {
	   Admin admin=new Admin();
	   admin.setMdp(dtoRequestAdmin.getMdp());
	   admin.setNom(dtoRequestAdmin.getNom());
	   admin.setUsername(dtoRequestAdmin.getUsername());
	   return admin;
   }
   public DTOResponseAdmin adminToResponseDto(Admin admin) {
	   DTOResponseAdmin	dtoResponseAdmin =new DTOResponseAdmin();
	   DTOResponseAdmin.setNom(admin.getNom());
	   DTOResponseAdmin.setId(admin.getId());
	   DTOResponseAdmin.setUsername(admin.getUsername());
	   DTOResponseAdmin.setMdp(admin.getMdp());

		return dtoResponseAdmin;
	} 
}
