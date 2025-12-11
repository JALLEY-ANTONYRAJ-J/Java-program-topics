//print a word in double quotes


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter a word1:");
        String a=s.next();
        System.out.printf("Enter a word2:");
        String b=s.next();
        System.out.println(("\""+a+" "+b+"\""));
    }
}
