package springdemo.beanfactory.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class E1BeanFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));

		Traingle traingle = (Traingle) beanFactory.getBean("traingle");
		traingle.draw();
	}

}
