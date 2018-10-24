package com.itat.mongo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    
	private Long id;
	private String name;
	private String wifeName;
	private Long salary;
	private Integer age;
	private Boolean status;
}