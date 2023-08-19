package com.example.Exception;

import org.springframework.http.HttpStatus;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access=AccessLevel.PACKAGE)
@Builder
public class ApiResponse {
	
		private String message;
		private boolean success;
		private HttpStatus status;
		
}
