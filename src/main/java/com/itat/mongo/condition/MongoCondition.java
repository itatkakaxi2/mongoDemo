package com.itat.mongo.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(name = "perso.db", havingValue = "mongo", matchIfMissing = false) 
public @interface MongoCondition {

}
