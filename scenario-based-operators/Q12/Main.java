/******************************************************************************

A product is sold at a loss. Given selling price and loss amount,
the program calculates the cost price using: CP = SP + Loss.
SP: 400  Loss: 50         Cost Price: 450

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter SP: ");
        int sp=s.nextInt();
        System.out.printf("Enter  Loss: ");
        int loss=s.nextInt();

        int cp=sp+loss;
        System.out.println("Cost Price: "+cp);

        
    }
}