package com.saxa.dtos;

public class GatoDTO {

	private String name;
	private Integer age;
	private String description;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void printCat() {
		System.out.println("name "+ name + " description " + description + " age " + age);
	}
	

}
