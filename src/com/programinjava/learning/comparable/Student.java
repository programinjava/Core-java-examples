package com.programinjava.learning.comparable;


//implementing the comparable interface
public class Student implements Comparable<Student>{
	
	
	private int age;
	private String name;
	
	
	

	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return this.getAge() - o.getAge();
	}




	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	

}
