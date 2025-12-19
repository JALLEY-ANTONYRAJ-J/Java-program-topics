/******************************************************************************
Q12. Write a Java program to find the sum of all factors of a given number.

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
	    int sum=0;
	    for(int i=1;i<=n;i++){
	        if(n%i==0){
	            sum+=i;
	        }
	    }
	    System.out.println(sum);
	}
}