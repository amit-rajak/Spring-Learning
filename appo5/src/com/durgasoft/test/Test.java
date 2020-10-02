package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.students;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/durgasoft/resource/ApplicationContext.xml");
		students std=(students) context.getBean("stbean");
		std.getdetails();

	}

}
