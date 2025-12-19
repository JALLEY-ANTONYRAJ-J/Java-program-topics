
//Q12. Write a java program to find the difference between the sum of even digits and odd digits of a number.

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        
        n=Math.abs(n);
      int evensum=0;
      int oddsum=0;
        while(n>0){
            int digit=(int)n%10;
            if(digit%2==0){
                evensum+=digit;
  
            }else if(digit%2!=0){
                oddsum+=digit;
            }
            n/=10;
        }
        int diff=evensum-oddsum;
  
        System.out.print("difference: "+diff);
        
        }
                }


