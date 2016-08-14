package com.mydesign.business.util;

import java.util.UUID;

public class CodeUtil {
	
	public static String generateCode(){
		return UUID.randomUUID().toString();
	}

}
