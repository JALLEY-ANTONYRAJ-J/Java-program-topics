//Q1.Java Program to find greatest among two numbers

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a two values: ");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    
	    if(a>b){
	        System.out.print("a is greater");
	    }else{
	        System.out.print("b is greater");
	    }
	}
}
