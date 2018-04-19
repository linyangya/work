package com.yinda.nbminer.util;


import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JSONUtil {
	
	/**   
	* 获取泛型的Collection Type  
	* @param collectionClass 泛型的Collection   
	* @param elementClasses 元素类   
	* @return JavaType Java类型   
	* @since 1.0   
	*/   
	public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {   
		ObjectMapper mapper = new ObjectMapper();
	    return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);   
	}

}
