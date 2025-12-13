// Q2. Java Program to check whether a given character is uppercase, lowercase, digit, or special symbol

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a char: ");
	    char a=s.next().charAt(0);
	     
	    if(a>='A' && a<='Z'){
	        System.out.println("uppercase");
	    }else if(a>='a' && a<='z'){
	        System.out.println("lowercase");
	    }else{
	        System.out.println("special character");
	    }
	}
}
