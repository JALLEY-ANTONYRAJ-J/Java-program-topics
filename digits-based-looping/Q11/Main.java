//Q11. Write a java program to check whether all digits of a number are even or odd or mixed.

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        
        n=Math.abs(n);
      int even=0;
      int odd=0,mixed=0;
        while(n>0){
            int digit=(int)n%10;
            if(digit%2==0){
                even++;
            }else if(digit%2!=0){
                odd++;
            }else{
                mixed++;
            }
            n/=10;
        }
        if(even>0 && odd==0)
        System.out.print("even");
        else if(odd>0 && even==0)
        System.out.print("odd");
        else if(even>0 && odd>0)
        System.out.print("mixed");
        }
                }


