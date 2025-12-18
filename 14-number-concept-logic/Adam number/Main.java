import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int sqr=(int)Math.pow(n,2);
		
		int temp=n;
		int temp1=sqr;
		int rev=0;
		while(n!=0){
		    int digit=n%10;
		    rev=rev*10+digit;
		    n/=10;
		}
		
		int revsqr=(int)Math.pow(rev,2);
	
		
		int revsqr1=revsqr;
		
		
		int rev1=0;
		 while(revsqr1>0){
		     int digit1=revsqr1%10;
		     rev1=rev1*10+digit1;
		     revsqr1/=10;
		     
		 }
	
		 if(rev1==sqr){
		     System.out.print("Adam number");
		 }else{
		     System.out.print("Not Adam number");
		 }
		 

		
	}
}
