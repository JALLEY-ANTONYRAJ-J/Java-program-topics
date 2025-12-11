//PRINT THE ABSOLUTE OF THREE NUMBERS

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a three numbers:");
	    int a=s.nextInt();
	    int absvalue=(a>=0)?a:-a;
	    
	    System.out.printf("Absolute value:");
		System.out.println(absvalue);
	}
}
