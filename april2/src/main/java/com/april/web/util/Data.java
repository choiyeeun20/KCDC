package com.april.web.util;

import java.io.File;

public enum Data {
USER_PATH, ADMIN_PATH, CSV, LIST;
	@Override
	public String toString() {
		String returnValue = "";
		switch(this) {
		//C:\Users\bit\git\repository\april2\src\main\resources\static\resources\file
		case ADMIN_PATH: returnValue ="C:"+File.separator+"Users"+File.separator+"bit"+File.separator+"git"+File.separator+"repository"+File.separator+"april2"+File.separator+
				"src"+File.separator+"main"+File.separator+"resources"+File.separator+"static"+File.separator+"resources"+File.separator+"file"+File.separator;break;
		case USER_PATH : returnValue = "C:"+File.separator+"Users"+File.separator+"bit"+File.separator+"git"+File.separator+"repository"+File.separator+"april2"+File.separator+
				"src"+File.separator+"main"+File.separator+"resources"+File.separator+"static"+File.separator+"resources"+File.separator+"file"+File.separator;break;
		case CSV : returnValue = ".csv";break;
		case LIST : returnValue = "list";break;
		default:
			break;
		}
		return returnValue;
		
	}
}