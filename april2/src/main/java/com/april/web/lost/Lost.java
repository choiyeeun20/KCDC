package com.april.web.lost;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
public class Lost {
	private String  id, name, date, category, location;
	
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,/$s",  id, name, date, category, location);
		
	}
}



