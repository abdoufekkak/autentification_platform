package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompteResponseDto {
	private Integer Id;
	private Integer mail;
	private Integer motPass;
	private Integer userName;
}
