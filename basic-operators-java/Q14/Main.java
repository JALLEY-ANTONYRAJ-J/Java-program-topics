//print cube value

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a number:");
	    int a=s.nextInt();
	    int cube=a*a*a;
	    
	    System.out.printf("cube value:");
		System.out.println(cube);
	}
}
