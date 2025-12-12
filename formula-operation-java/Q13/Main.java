//surface of area,volume,cuboid

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("surface value:"+"\n");
	    System.out.printf("surface length: ");
	   double l=s.nextDouble();
	   System.out.printf("surface breadth: ");
	   double b=s.nextDouble();
	   System.out.printf("surface height: ");
	   double h=s.nextDouble();
		
		double area=2*(l*b+b*h+h*l);
		double volume=l*b*h;
		
		System.out.printf("surface of area: "+area +"\n");
		System.out.println("surface of volume: "+volume +"\n");
	}
}
