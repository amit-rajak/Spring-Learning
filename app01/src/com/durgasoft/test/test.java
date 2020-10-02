package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.duragsoft.beans.HelloBean;

public class test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/durgasoft/resources/applicationContext.xml");
		HelloBean hello = (HelloBean) context.getBean("helloBean");
		System.out.println(hello.sayhello());
	}

	}


