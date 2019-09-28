
package basicjava;

import java.util.Scanner;


public class SwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int digit ;
        System.out.print(" enter the digit ");   
        digit = input.nextByte();
        switch (digit){
            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("Four ");
            case 5:
                System.out.println("five");
            default:
                System.out.println("nothing");
        }
        
       
        
        
        
        
    }
    
}
