/******************************************************************************

Q18. Write a Java program to check whether a given number is a Buzz Number or not.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    
	   if(n%7==0 || n%10==7){
	        System.out.printf("buzz number");
	    }else{
	        System.out.printf("Not buzz number");
	    }
	   }
	    }
	    