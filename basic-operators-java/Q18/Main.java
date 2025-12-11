//whatever a number is positive or NegativeArraySizeException

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a number:");
	    int a=s.nextInt();
	    String num=(a>0)?"positive":"negative";
		System.out.println(num);
	}
}
