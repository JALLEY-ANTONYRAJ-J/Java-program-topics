//print a date of birth


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter a date:");
        int a=s.nextInt();
        System.out.printf("Enter a month:");
        int b=s.nextInt();
        System.out.printf("Enter a year:");
        int c=s.nextInt();
       
        System.out.println(a+"/"+b+"/"+c);
    }
}
