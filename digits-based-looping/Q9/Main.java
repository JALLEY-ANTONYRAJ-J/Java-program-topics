//Q9. Write a java program to find the largest digit in a given number.

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        
        n=Math.abs(n);
        int maxdigit=0;
        while(n>0){
            int digit=(int)n%10;
            if(digit>maxdigit){
                maxdigit=digit;
            }
            n/=10;
        }
        System.out.print("Greater number is "+maxdigit);
                }
            }

