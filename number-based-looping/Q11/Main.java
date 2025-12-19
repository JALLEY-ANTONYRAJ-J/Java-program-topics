/******************************************************************************
Q11. Write a Java program to print all factors of a given number.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    
	    int count=0;
	    if(n<=0){
	        System.out.print("negative number");
	    }
	    for(int i=1;i<=n;i++){
	        if(n%i==0){
	            System.out.println(i);
	        }
	    }
	}
}