public class Triangle {
	private Point p1,p2,p3;
	
	public Triangle(Point one, Point two, Point three) {
		p1 = one;
		p2 = two;
		p3 = three;
	}
	
	public double getPerimeter() {
		return(Point.distance(p1,p2) + Point.distance(p2,p3) + Point.distance(p3,p1));
	}
	
}