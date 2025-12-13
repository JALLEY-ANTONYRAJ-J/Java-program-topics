//Q7. Java Program to calculate the distance between two points (x1,y1) and (x2,y2).

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter x1 and y1 value: ");
	    double x1=s.nextDouble();
	    double y1=s.nextDouble();
	     System.out.printf("Enter x2 and y2 value: ");
	    double x2=s.nextDouble();
	    double y2=s.nextDouble();
	     
	    double x=(x2-x1)*(x2-x1);
	    double y=(y2-y1)*(y2-y1);
	    double distance=x+y;
	    distance=Math.sqrt(distance);
	    System.out.printf("distance: "+distance);
	     }
	}
