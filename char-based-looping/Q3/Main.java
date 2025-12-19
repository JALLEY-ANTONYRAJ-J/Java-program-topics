/******************************************************************************

Q3. Write a Java program to print lowercase English alphabets in reverse order.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    for(char i='z';i>='a';i-- ){
	        System.out.print(i+" ");
	    }
		
	}
}
