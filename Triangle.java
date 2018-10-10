public class Triangle {
	private Point[] p = new Point[3];
	
	public Triangle(Point one, Point two, Point three) {
		p[0] = one;
		p[1] = two;
		p[2] = three;
	}

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {	
		p[0] = new Point(x1,y1);
		p[1] = new Point(x2,y2);
		p[2] = new Point(x3,y3);
	}
 
	public Point getVertex(int index) {
		Point r = new Point(p[index]);
		return(r);
	}

	
	public double getPerimeter() {
		return(Point.distance(p[0],p[1]) + Point.distance(p[1],p[2]) + Point.distance(p[2],p[0]));
	}

	public String toString() {
		return("Triangle " + "A(" + p[0].getX() + "," + p[0].getY() + ") " + "B(" + p[1].getX() + "," + p[1].getY() + ") " + "C(" + p[2].getX() + "," + p[2].getY() + ") ")


	}
	
}
