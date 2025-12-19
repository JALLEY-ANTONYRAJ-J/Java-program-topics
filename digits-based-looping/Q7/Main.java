/******************************************************************************

 
 	
Q7. Write a java program to swap the first and last digit of a given number.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.next();
		
		int len=n.length();
		if(len==1){
		    System.out.print(n);
		}
		    
		    char first=n.charAt(0);
		    char last=n.charAt(len-1);
		    
		    String result=last+n.substring(1,len-1)+first;
		    	 System.out.print(result);
	
		}
	}

		
	   
	    