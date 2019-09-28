
package stringproject;

import java.util.Scanner;


public class StringDemo {
     public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
        String s1 = "Shohan Rony";
        String s2 = " Shehab Chuman";
        
        
        String fullname = s1 + s2;
         System.out.println(fullname);
         
         
         String fullname2 = s1.concat(s2);
         //concat methode is one type of addition of string
         System.out.println(fullname);
         String uppername = fullname.toUpperCase();
         System.out.println(uppername);
          String lowername = fullname.toLowerCase();
         System.out.println(lowername);
             
         
             
    
}
}
