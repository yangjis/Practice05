package com.javaex.ex09;

public class StringUtil {
	
	private static String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String concatString(String[] str){
		
		String result = "";
		
		for(int i = 0; i < str.length; i++) {
			result += str[0];
		}
		
       return result;
    }

}
