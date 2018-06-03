package springdemo.applicationcontext.example.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ApplicationContextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
		context.registerShutdownHook();
		ExampleLifeCycle bean = (ExampleLifeCycle) context.getBean("lifecycleBean");
		System.out.println(bean);
		
		//org.springframework.beans.factory.UnsatisfiedDependencyException: thrown incase of  Ambiguous argument values
	}

}
