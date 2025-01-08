package com.twitter.user.dto;

import java.util.Date;

import lombok.Data;

@Data
public class UserDTO {
	private Long id;
	private String userName;
	private String email;
	private String password;
	private String confirmPassword;
	private String profileURL;
	private String coverPhotoURL;
	private String location;
	private String website;
	private String bio;
	private Date dateOfJoin;
    
}
