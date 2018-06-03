package springdemo.applicationcontext.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleLifeCycle implements InitializingBean, DisposableBean {

	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(this.name+" value assigned");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean afterPropertiesSet() called");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean destroy() called");
	}

	public void myInit() {
		System.out.println("beans.xml init-method called");
	}

	public void cleanup() {
		System.out.println("beans.xml destroy-method called");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("beans.xml init-method called");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("beans.xml destroy-method called");
	}

}
