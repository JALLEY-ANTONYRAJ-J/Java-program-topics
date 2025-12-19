
//Q13. Write a java program to remove all zeroes from a given number.

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        
        n=Math.abs(n);
      int result=0;
      int place=1;
        while(n!=0){
            int digit=(int)n%10;
            if(digit!=0){
            result=digit*place+result;
            place*=10;
            }
            n/=10;
        }
  
        System.out.print("afterremoving : "+result);
        
        }
                }


