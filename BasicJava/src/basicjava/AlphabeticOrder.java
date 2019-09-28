
package basicjava;

import java.util.Scanner;

public class AlphabeticOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String [] names = new String [5];
        System.out.print("input names ");
        for (int i =0 ; i<names.length; i++){
            names [i] = input.nextLine();
            
        }
        String temp ;
        System.out.print(" Alphabetic order");
        for ( int i =0 ; i<names.length; i++){
            for (int n=i+1 ; n<names.length;n++){
                if (names[n].compareTo(names[i]) < 0){
                    temp = names [i];
                    names [i]=names [n];
                    names [n]= temp;
                    
            }
            
        }
        
    }
        for (int i=0 ; i<5;i++){
            System.out.println("  "+ names[i]);
        }
        System.out.println("");
        
}
}
