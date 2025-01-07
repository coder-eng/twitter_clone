package com.twitter.user.dto;

import lombok.Data;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Data
public class SignInDTO {
	@Email(message="Please enter valid email")
	private String email;
	
	@NotNull(message="password can't be null")
	//@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,16}$" , message"")
	private String password;

}
