//find area of square

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.printf("Enter a number:");
	    int side=s.nextInt();
	    
	    int area=side*side;
		System.out.println("area of square:"+area);
	}
}
