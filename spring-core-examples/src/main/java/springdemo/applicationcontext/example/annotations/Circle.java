package springdemo.applicationcontext.example.annotations;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	private Point center;

	public void draw() {
		System.out.println("Circle draw() "+this.center);
	}

	public Point getCenter() {
		return center;
	}

	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

}
