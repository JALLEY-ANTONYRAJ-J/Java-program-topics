/******************************************************************************
Q5. Write a Java program to print vowels and consonants separately.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st=s.nextLine().toLowerCase();
        
        System.out.print("vovels: ");
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u'){
                System.out.print(ch+" ");
            }
        }
       
          System.out.print("consunant: ");
         for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch>='a' && ch<='z' && !(ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u')){
                System.out.print(ch+" ");
            }
        }
    }
}