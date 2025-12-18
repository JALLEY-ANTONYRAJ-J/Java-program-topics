

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    
	    int sum=0;
	    int temp=n;
	    while(n!=0){
	        int digit=n%10;
	        sum+=digit;
	        n/=10;
	    }
	    if(temp%sum==0){
	        System.out.printf("harshad number");
	    }else{
	        System.out.printf("Not harshad number");
	    }
		
	}
}
