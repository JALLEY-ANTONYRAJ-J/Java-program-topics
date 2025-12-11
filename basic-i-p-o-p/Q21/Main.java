//print a rollno and name


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter a rollno:");
        int a=s.nextInt();
        System.out.println("Enter a name:");
        String b=s.next();
        
        System.out.println("Rollno:"+a);
        System.out.println("Name:"+b);
    }
}