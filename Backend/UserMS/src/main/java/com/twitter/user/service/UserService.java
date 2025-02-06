package com.twitter.user.service;

import com.twitter.user.dto.UserDTO;
import com.twitter.user.exception.UserException;

public interface UserService {
	public Long registerUser(UserDTO userDTO) throws UserException;

}
