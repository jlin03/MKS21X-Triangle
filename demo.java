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
  }
  
  public static double distance(Point p1, Point p2) {
	  return(Point.distance(p1,p2));
  }
 
}