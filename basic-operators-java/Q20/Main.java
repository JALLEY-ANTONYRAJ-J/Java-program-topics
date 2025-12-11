//check pass or fail based on result

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a number:");
	    int a=s.nextInt();
	   String num1=(a>=30)?"pass":"fail";
	              
	   
		System.out.println(num1);
		
	}
}
