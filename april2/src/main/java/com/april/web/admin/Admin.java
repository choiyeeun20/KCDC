package com.april.web.admin;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Component
@Getter @Setter
public class Admin {
	private String  employNumber, passwd ,name , 
	position, profile, email, phoneNumber, 
	registerDate;
	
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s", 
				employNumber,passwd,name,position,profile,email,phoneNumber,registerDate);
	}
	///////
}