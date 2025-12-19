/******************************************************************************

Q10. Write a Java program to convert a character from uppercase to lowercase using ASCII.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char a=s.next().charAt(0);
	
	if(a>='A' && a<='Z'){
	    char lower=(char)(a+32);
        System.out.println("lower: "+lower);
	}else{
	    System.out.print("Not an upper case");
	}
	}
}
