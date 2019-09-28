
package stringproject;

import java.util.Scanner;


public class StringPelindrome {
    public static void main(String[] args) {
        String s1;
        Scanner in = new Scanner (System.in);
        System.out.print(" Enter a word =  ");
        s1 = in.nextLine();
        
        
    
    
    StringBuffer sb = new StringBuffer(s1);
    String s2 = sb.reverse().toString();
   if (s1.equals(s2)){
            System.out.println("palindrome");
   }
            else{
                    System.out.println("Not pelindrome");
                    }

           
 }
}

    

