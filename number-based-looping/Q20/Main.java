/******************************************************************************

Q20. Write a Java program to check whether a given number is a Magic Number or not

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int sum=0;
	    int rev=0;
	    int temp=n;
	    while(n!=0){
	        int digit=n%10;
	        sum+=digit;
	        n/=10;
	    }
	    int tot_sum=sum;
	    while(sum!=0){
	        int digit1=sum%10;
	        rev=rev*10+digit1;
	        sum/=10;
	    }
	    int check;
	    check=tot_sum*rev;
	    if(check==temp){
	        System.out.println("magic number");
	    }else{
	        System.out.println("no");
	    }
	}
}