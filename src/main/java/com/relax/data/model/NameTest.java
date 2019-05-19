package com.relax.data.model;

public class NameTest {
	
	private Integer id;
	private String PersonName;
	private String PersonPlace;
	private String PersonAge;
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public String getPersonPlace() {
		return PersonPlace;
	}
	public void setPersonPlace(String personPlace) {
		PersonPlace = personPlace;
	}
	public String getPersonAge() {
		return PersonAge;
	}
	public void setPersonAge(String personAge) {
		PersonAge = personAge;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "NameTest [id=" + id + ", PersonName=" + PersonName + ", PersonPlace=" + PersonPlace + ", PersonAge="
				+ PersonAge + "]";
	}

	
	
	

}
