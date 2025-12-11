//PRINT THE two number is equal(true or false)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a two numbers:");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    boolean isequal=(a==b);
	    
	    
	    System.out.printf(" value is:");
		System.out.println(isequal);
	}
}

