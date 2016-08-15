package com.mydesign.business.util;

import java.util.UUID;

public class CodeUtil {
	
	public static String generateCode(String type, String name){
		if(null != type & type.length() >= 3){
			type = type.substring(0, 3);
			String uid= UUID.randomUUID().toString();
			uid = uid.substring(0, uid.indexOf("-"));
			name=name.substring(0, 3);
			String code = type+name+uid;
			code = code.toUpperCase();
			return code;
		}
		return null;
	}

}
