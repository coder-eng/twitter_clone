package com.twitter.user.service;

import java.util.Date;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twitter.user.dto.UserDTO;
import com.twitter.user.entity.UserEntity;
import com.twitter.user.exception.UserException;
import com.twitter.user.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	ModelMapper modelMapper ;

	@Override
	public Long registerUser(UserDTO userDTO) throws UserException{
		// TODO Auto-generated method stub
		
		Optional<UserEntity>opUser = userRepository.findByEmail(userDTO.getEmail());
		opUser.orElseThrow(()-> new UserException("user email already exist"));
		
		// Map user DTO to user entity
		UserEntity user = modelMapper.map(userDTO, UserEntity.class);
		
		
		// set date of join
		user.setDateOfJoin(new Date());
		
		userRepository.save(user);
		return user.getId();
	}

}
