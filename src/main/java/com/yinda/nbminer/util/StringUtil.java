package com.yinda.nbminer.util;

import java.util.UUID;

public class StringUtil {

	/**获取UUID*/
	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-","");
	}
	
	public static Object getValue(Object object){
		
		if(object==null||"".equals(object)){
			return null;
		}else{
			return object;
		}
	}
}
