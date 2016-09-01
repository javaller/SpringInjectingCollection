package com.tutorialspoint;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollections {

	
	private List countryList;
	private Set	countrySet;
	private Map countryMap;
	private Properties countryProperties;
	
	public List getCountryList() {
		System.out.println(countryList);
		return countryList;
	}
	
	public void setCountryList(List countryList) {
		this.countryList = countryList;
	}
	
	public Set getCountrySet() {
		System.out.println(countrySet);
		return countrySet;
	}
	
	public void setCountrySet(Set countrySet) {
		this.countrySet = countrySet;
	}
	
	public Map getCountryMap() {
		System.out.println(countryMap);
		return countryMap;
	}
	
	public void setCountryMap(Map countryMap) {
		this.countryMap = countryMap;
	}
	public Properties getCountryProperties() {
		System.out.println(countryProperties);
		return countryProperties;
	}
	public void setCountryProperties(Properties countryProperties) {
		this.countryProperties = countryProperties;
	}
}
