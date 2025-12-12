//surface of area,volume,perimeter

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("surface value:");
	   double a=s.nextDouble();
		
		double area=6*a*a;
		double volume=a*a*a;
		double perimeter=12*a;
		
		System.out.printf("surface of area: "+area +"\n");
		System.out.println("surface of volume: "+volume +"\n");
		System.out.println("surface of perimeter: "+perimeter);
	}
}
