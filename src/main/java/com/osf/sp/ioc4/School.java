package com.osf.sp.ioc4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class School {

	private Person p;
	private Study s;
	
	@Autowired
	public School(Person p) {
		this.p = p;
	}
	
	@Autowired
	public School(@Qualifier Study s) {
		this.s = s;
	}
}
