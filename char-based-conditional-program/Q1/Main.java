// Q1. Java Program to check whether a given character is a vowel or consonant

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a char: ");
	    char a=s.next().charAt(0);
	     
	    if(a=='a' || a=='e' ||a=='i'|| a=='o'||a=='u'){
	        System.out.println("vowel");
	    }else{
	        System.out.println("consonant");
	    }
	}
}
