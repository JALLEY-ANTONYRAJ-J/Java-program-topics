//Q5. Java Program to check whether two characters are equal or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a char: ");
	    char a=s.next().charAt(0);
	     char b=s.next().charAt(0);
	     
	    if(a==b){
	        System.out.println("equal");
	    }else{
	        System.out.println("not equal");
	    }
	}
}
