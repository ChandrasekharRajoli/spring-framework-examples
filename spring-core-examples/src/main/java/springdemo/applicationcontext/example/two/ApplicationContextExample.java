package springdemo.applicationcontext.example.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Traingle bean = (Traingle) context.getBean("traingle5");
		System.out.println(bean);
		
		//org.springframework.beans.factory.UnsatisfiedDependencyException: thrown incase of  Ambiguous argument values
	}

}
