package com.app.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompteRequestDto {
		private String mail;
		private String motPass;
		private String userName;
}
