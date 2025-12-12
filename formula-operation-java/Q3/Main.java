//find area of traingle

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.printf("Enter base and height:");
	    double base=s.nextInt();
	    double height=s.nextInt();
	    
	    double area=0.5*base*height;
		System.out.println("area of traingle:"+area);
	}
}