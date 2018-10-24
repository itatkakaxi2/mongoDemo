package com.itat.mongo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.itat.mongo.condition.MongoCondition;
import com.itat.mongo.dao.PackageMongoRepo;

@MongoCondition
@Configuration
@EnableMongoRepositories(basePackageClasses = {PackageMongoRepo.class}, repositoryImplementationPostfix = "Impl")
public class MongoDBConfiguration {
	
	//TODO: because currently the global maven repository 
	//do not contains spring data mongo 2.1 and above,
	//so we can't bring in the transaction support contained in 
	//spring data mongo 2.1
}
