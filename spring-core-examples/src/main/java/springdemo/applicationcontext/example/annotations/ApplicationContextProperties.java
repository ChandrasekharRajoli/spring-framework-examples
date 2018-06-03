package springdemo.applicationcontext.example.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springdemo.applicationcontext.example.two.Traingle;

public class ApplicationContextProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		String name = context.getMessage("name", null, "Default", null);
		
		System.out.println(name);
	}

}
