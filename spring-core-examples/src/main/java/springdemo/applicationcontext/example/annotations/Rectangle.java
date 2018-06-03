package springdemo.applicationcontext.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {

	@Autowired
	private Point center;

	public void draw() {
		System.out.println("Rectangle draw() "+center.toString());
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	


}
