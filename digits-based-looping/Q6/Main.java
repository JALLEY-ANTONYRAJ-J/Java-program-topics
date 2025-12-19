/******************************************************************************

Q6. Write a java program to check whether the digits of a number are in descending order.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=s.nextInt();
	    }
	    
	    for(int i=0;i<n-1;i++){
	        for(int j=i+1;j<n;j++){
	            if(arr[i]>arr[j]){
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
	    
	    System.out.println("descending");
	    for(int i=n-1;i>=0;i--){
	        System.out.print(arr[i]);
	    }
	}
}
