package com.app.mapper;

import com.app.dto.DtoRequestRolle;
import com.app.dto.DtoResponseRole;
import com.app.entities.Role;

public class MapperRolle {

	public Role reuestRoleToleRole(DtoRequestRolle dtoRequestRolle) {
	Role	role =new Role();
	role.setRoleName(dtoRequestRolle.getRoleName());
	return role;
	} 
	public DtoResponseRole roleToResponseDto(Role role) {
		DtoResponseRole	dtoResponseRole =new DtoResponseRole();
		dtoResponseRole.setRoleName(role.getRoleName());
		dtoResponseRole.setId(role.getId());
		return dtoResponseRole;
	} 
	
}
