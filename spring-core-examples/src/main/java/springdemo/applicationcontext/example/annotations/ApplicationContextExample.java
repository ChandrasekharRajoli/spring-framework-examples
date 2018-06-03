package springdemo.applicationcontext.example.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springdemo.applicationcontext.example.two.Traingle;

public class ApplicationContextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
		Shape shape2 = (Shape) context.getBean("triangle");
		shape2.draw();
		
		Shape shape3 = (Shape) context.getBean("square");
		shape3.draw();
		
		Shape shape4 = (Shape) context.getBean("rectangle");
		shape4.draw();
	}

}
