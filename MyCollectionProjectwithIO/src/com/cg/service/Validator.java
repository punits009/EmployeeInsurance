package com.cg.service;

public interface Validator {
	String aidpattern="[1-9][0-9][0-9]";
	String mobpattern="[1-9][0-9]{9}";
	String accpattern="[A-Z][a-z ]*";
	public static boolean validatedata(String data,String pattern)
	{
		return data.matches(pattern);
	}

}
