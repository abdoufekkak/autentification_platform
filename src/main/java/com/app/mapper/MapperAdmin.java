package com.app.mapper;

import com.app.dto.DtoRequestAdmin;
import com.app.entities.Admin;

public class MapperAdmin {
   public Admin requestAdminToAdmin(DtoRequestAdmin dtoRequestAdmin) {
	   Admin admin=new Admin();
	   admin.setMdp(dtoRequestAdmin.getMdp());
	   admin.setNom(dtoRequestAdmin.getNom());
	   admin.setUsername(dtoRequestAdmin.getUsername());
	   return admin;
   }
}
