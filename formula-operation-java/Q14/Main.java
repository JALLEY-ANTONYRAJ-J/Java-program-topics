//surface of area,volume,sphere

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("surface radius: ");
	   double r=s.nextDouble();
		
		double area=4*Math.PI*r*r;
		double volume=((4.0/3.0)*Math.PI*r*r*r);
		
		System.out.printf("surface of area: "+area +"\n");
		System.out.println("surface of volume: "+volume);
	}
}
