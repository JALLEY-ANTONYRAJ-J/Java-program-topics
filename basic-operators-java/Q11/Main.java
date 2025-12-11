//print the middle numbers

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter 3 numbers:");
	    int a=s.nextInt();
	    a=a/10;
	    int mid=a%10;
	    
	    System.out.printf("middle number:");
		System.out.println(mid);
	}
}
