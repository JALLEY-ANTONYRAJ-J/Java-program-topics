//reminder of two numbers

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter two numbers:");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    
	    System.out.printf("reminder:");
	    int rem=a%b;
		System.out.println(rem);
	}
}
