/******************************************************************************

Q6. Write a Java program to print ASCII values from A–Z.

*******************************************************************************/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        for(char ch='A';ch<='Z';ch++){
           
                System.out.print(ch+"-"+(int)ch+" ");
            }
        }
       
    }
