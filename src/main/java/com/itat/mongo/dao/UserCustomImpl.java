package com.itat.mongo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.itat.mongo.condition.MongoCondition;
import com.itat.mongo.domain.User;
import com.mongodb.client.result.UpdateResult;

@MongoCondition
@Repository
public class UserCustomImpl implements UserCustom{

	@Autowired
	private MongoTemplate mongTemplate;

	@Override
	public long updateStatus(String name, String status, String preStatus) {
		
		Criteria criteria = Criteria.where("name").is(name)
				.and("status").is(preStatus);
		Query query = new Query(criteria);
		
		Update update = new Update();
		update.set("status", status);
		
		UpdateResult result = mongTemplate.updateFirst(query, update, User.class);
		return 0;
	}
}
