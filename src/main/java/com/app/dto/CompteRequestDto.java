package com.app.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompteRequestDto {
		private Integer mail;
		private Integer motPass;
		private Integer userName;
}
