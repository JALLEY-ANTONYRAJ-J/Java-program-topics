/* A computer networks student wants to convert bytes into bits.
 Since 1 byte = 8 bits, the program multiplies accordingly.

Bytes: 4   Bits: 32

*/


import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter bytes : ");
        int bytes=s.nextInt();

        int bits=bytes*8;
        System.out.println("Bits: "+bits);

        
    }
}