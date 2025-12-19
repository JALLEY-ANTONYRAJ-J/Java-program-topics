/******************************************************************************

Q9. Write a Java program to convert binary to decimal.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       String str=s.nextLine();
        
       
       int decimal=0;
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch=='1'){
               decimal=decimal*2+1;
           }else if(ch=='0'){
               decimal=decimal*2+0;
           }else{
               System.out.print("Invalid input");
           }
       }
      
       System.out.println(decimal);
       }
            }
        