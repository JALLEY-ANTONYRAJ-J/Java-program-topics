/******************************************************************************
Q9. Write a Java program to find the GCD of two numbers.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    
	   
	    int x=a;
	    int y=b;
	    int gcd;
	    while(x!=y){
	        if(x>y){
	            x-=y;
	        }else{
	            y-=x;
	        }
	    }
	    System.out.println(x);
	}
}