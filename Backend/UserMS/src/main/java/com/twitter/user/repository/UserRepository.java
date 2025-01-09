package com.twitter.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.twitter.user.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity,Long>{
	

}
