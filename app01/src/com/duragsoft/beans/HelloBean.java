package com.duragsoft.beans;

public class HelloBean {
	private String name ;
public  void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public String sayhello()
{
	return "Hello "+name+"!";
}
}
