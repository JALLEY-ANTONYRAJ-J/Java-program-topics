/*distance between two point

formula::squareroot of((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))
using Math.sqrt/Math.pow=0.5/Math.hypot


*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Eneter a value:");
	    double x1=s.nextDouble();
	     double y1=s.nextDouble();
	      double x2=s.nextDouble();
	       double y2=s.nextDouble();
	       
	       double distance=Math.sqrt((x2 - x1)*(x2 - x1)+(y2 - y1)*(y2 - y1));
	    System.out.printf("distance:"+distance);
		
	}
}
