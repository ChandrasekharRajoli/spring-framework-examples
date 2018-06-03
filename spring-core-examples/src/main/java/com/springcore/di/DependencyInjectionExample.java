package com.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String configLocation = new String("spring-di-beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.toString());
		
		Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer.toString());
	}

}
