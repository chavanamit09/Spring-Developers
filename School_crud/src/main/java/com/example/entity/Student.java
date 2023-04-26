package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
int id;
String name;
String branch;
int age ;
int yop;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getYop() {
	return yop;
}
public void setYop(int yop) {
	this.yop = yop;
}

}
