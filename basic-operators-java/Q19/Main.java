//check greatest of three numbers

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a number:");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	    int num1=(a>b)?
	              ((a>c)?a:c)
	              :((b>c)?b:c);
	    
		System.out.println("largest:"+num1);
		
	}
}
