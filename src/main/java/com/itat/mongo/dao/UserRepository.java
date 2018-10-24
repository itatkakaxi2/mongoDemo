package com.itat.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itat.mongo.domain.User;

public interface UserRepository extends UserCustom,
					MongoRepository<User, Long> {
	
	long deleteByName(String name);
	
	User findByName(String name);

}
