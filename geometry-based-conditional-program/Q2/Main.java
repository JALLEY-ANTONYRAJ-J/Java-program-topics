//Q2. Java Program to check whether a triangle is right-angled or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a triangle value: ");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	     
	    if(a>b && a>c){
	        if(a*a==b*b+c*c)
	            System.out.println("right-angled triangle");
	        else
	            System.out.println("Not right-angled triangle");
	    }
	     
	    else if(b>a && b>c){
	        if(b*b==a*a+c*c)
	            System.out.println("right-angled triangle");
	        else
	            System.out.println("Not right-angled triangle");
	    }
	     else{
	    if(c>b && c>a){
	        if(c*c==a*a+b*b)
	            System.out.println("right-angled triangle");
	        else
	            System.out.println("Not right-angled triangle");
	    }
	     }
	}
}
