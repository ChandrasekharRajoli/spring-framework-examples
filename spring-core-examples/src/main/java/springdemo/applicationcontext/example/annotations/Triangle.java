package springdemo.applicationcontext.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Triangle implements Shape {

	@Autowired
	private Point center;

	public void draw() {
		System.out.println("Traingle draw() "+center.toString());
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

}
