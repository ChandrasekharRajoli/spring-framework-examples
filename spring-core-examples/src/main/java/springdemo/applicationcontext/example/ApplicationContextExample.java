package springdemo.applicationcontext.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee) context.getBean("employee1");
		employee.print();
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring.xml");
		Employee2 employee2 = (Employee2) context2.getBean("employee2");
		System.out.println(employee2);
		//org.springframework.beans.factory.UnsatisfiedDependencyException: thrown incase of  Ambiguous argument values
	}

}
