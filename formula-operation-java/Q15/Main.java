//surface of area,total area,volume,cyclinder

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("surface radius: ");
	   double r=s.nextDouble();
	    System.out.printf("surface height: ");
	   double h=s.nextDouble();
		
		double area=2 * Math.PI * (r*h);
		double total_area=2*Math.PI*r* (r+h);
		double volume=Math.PI*r*r*h;
		
		System.out.printf("surface of area: "+area +"\n");
		System.out.printf("surface of total_area: "+total_area +"\n");
		System.out.println("surface of volume: "+volume);
	}
}