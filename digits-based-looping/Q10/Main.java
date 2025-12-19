//Q10. Write a java program to find the smallest digit in a given number.

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        
        n=Math.abs(n);
        int mindigit=9;
        while(n>0){
            int digit=(int)n%10;
            if(digit<mindigit){
                mindigit=digit;
            }
            n/=10;
        }
        System.out.print("smaller number is "+mindigit);
                }
            }

