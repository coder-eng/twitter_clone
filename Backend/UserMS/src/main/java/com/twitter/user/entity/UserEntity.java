package com.twitter.user.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserEntity {
	
	@Id
	private Long id;
	private String userName;
	private String email;
	private String password;
	private String profileURL;
	private String coverPhotoURL;
	private String location;
	private String website;
	private String bio;
	private Date dateOfJoin;
	
}
