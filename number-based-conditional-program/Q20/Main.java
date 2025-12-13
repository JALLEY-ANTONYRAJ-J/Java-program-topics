// Q20.Java Program to check whether the ASCII value of a character is even or odd.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    char a=s.next().charAt(0);
	     
	    int ASCII_value=(int)a;
	    System.out.println(ASCII_value);
	    if(ASCII_value%2==0){
	        System.out.println("Even");
	    }else{
	        System.out.println("Odd");
	    }
	}
}