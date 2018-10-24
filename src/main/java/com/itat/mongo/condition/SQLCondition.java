package com.itat.mongo.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(name = "perso.db", havingValue = "sql", matchIfMissing = true) 
public @interface SQLCondition {

}
