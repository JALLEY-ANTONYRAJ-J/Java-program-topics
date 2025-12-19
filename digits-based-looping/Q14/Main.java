
//Q14. Write a java program to calculate the sum of squares and cubes of digits of a number.

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        
        n=Math.abs(n);
      int sumsquare=0;
      int sumcube=0;
        while(n!=0){
            int digit=(int)n%10;
            sumsquare+=digit*digit;
            sumcube+=digit*digit*digit;
            n/=10;
        }
  
        System.out.println("sum of square : "+sumsquare);
        System.out.print("sum of cube : "+sumcube);
        }
                }


