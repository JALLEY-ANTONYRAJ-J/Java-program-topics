import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    
	    int sqr=(int)Math.pow(n,2);
	    int last2=sqr%100;
	    int first2=sqr/100;
	    
	    int add=first2+last2;
	    if(add==n){
	        System.out.print("Kaprekar number");
	    }else{
	        System.out.print("Not kaprekar number");
	    }
	  
	   }
	    }