/******************************************************************************

 
 	
Q7. Write a Java program to count the number of 1s and 0s in a binary number

*******************************************************************************/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        
        int count0=0;
        int count1=0;
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='0')
            count0++;
            else if(ch=='1')
            count1++;
            else
            System.out.print("Invalid input");
        }
        System.out.println("number of 0's: "+count0);
        System.out.println("number of 1's: "+count1);
        
            }
        }
       
    