// Q3. Java Program to check whether a character is alphabet or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a char: ");
	    char a=s.next().charAt(0);

	    if(a>='A' && a<='Z'){
	        System.out.println("alphabet");
	    }else if(a>='a' && a<='z'){
	        System.out.println("alphabet");
	    }else{
	        System.out.println("not alphabet");
	    }
	}
}
