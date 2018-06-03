package springdemo.applicationcontext.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Square implements Shape {

	@Autowired
	@Qualifier("squareRelated")
	private Point scenter;

	public void draw() {
		System.out.println("square draw() "+scenter.toString());
	}

	public Point getScenter() {
		return scenter;
	}
	
	public void setScenter(Point scenter) {
		this.scenter = scenter;
	}


}
