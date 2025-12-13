// Q16. Java Program to check whether a number is divisible by both 2 and 5 but not by 8.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	    
	    if(a%2==0 &&a%5==0 && a%8!=0 )
		System.out.println("the number id divisible by both 2 and 5 not 8");
		else
		System.out.println("not satisfy");
	}
}