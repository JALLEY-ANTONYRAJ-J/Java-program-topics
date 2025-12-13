//Q4. Java Program to check whether a character is a digit or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a char: ");
	    char a=s.next().charAt(0);
	     
	    if(a>='0' && a<='9'){
	        System.out.println("digit");
	    }else{
	        System.out.println("not digit");
	    }
	}
}
