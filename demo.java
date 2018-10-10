public class demo{
  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    //for the 3 distance functions below Determine: 
    //a)static/non-static
    //b)what class the method is located in
    System.out.println(  distance(P1,P2));
    System.out.println(  Point.distance(P1,P2));
    System.out.println(  P1.distanceTo(P2));
	
	Point P3 = new Point (1,2);
	
	Triangle T1 = new Triangle(P1,P2,P3);
	System.out.println(T1);
	//Triangle A(1.0,1.0) B(2.0,2.0) C(1.0,2.0)
	System.out.println(T1.getPerimeter());
	//~3.4
	System.out.println(T1.getVertex(0));
	//(1.0,1.0)
  }
  
  public static double distance(Point p1, Point p2) {
	  return(Point.distance(p1,p2));
  }
 
}