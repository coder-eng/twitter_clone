package com.twitter.user.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.twitter.user.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long>{
	public Optional<UserEntity> findByEmail(String emailId);

}
