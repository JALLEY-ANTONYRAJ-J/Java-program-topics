// Java Program to check whether two numbers have the same last digit.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    
	    int num1=a%10;
	    int num2=b%10;
	    if(a==b){
	        System.out.println("same last digit");
	    }else{
	        System.out.println("not same");
	    }
	}
}