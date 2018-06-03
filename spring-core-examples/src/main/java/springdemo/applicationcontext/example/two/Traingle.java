package springdemo.applicationcontext.example.two;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Traingle {

	private List<Point> pointList;
	
	private Map<Point, String> pointMap;
	
	private Set<Point> pointSet;
	
	private Point pointA;
	
	private Point pointB;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	

	public List<Point> getPointList() {
		return pointList;
	}

	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}

	public Map<Point, String> getPointMap() {
		return pointMap;
	}

	public void setPointMap(Map<Point, String> pointMap) {
		this.pointMap = pointMap;
	}

	public Set<Point> getPointSet() {
		return pointSet;
	}

	public void setPointSet(Set<Point> pointSet) {
		this.pointSet = pointSet;
	}

	@Override
	public String toString() {
		return "Traingle [pointList=" + pointList + ", pointMap=" + pointMap + ", pointSet=" + pointSet + ", pointA="
				+ pointA + ", pointB=" + pointB + "]";
	}

		
	
}
