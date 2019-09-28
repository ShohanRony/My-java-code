
package exam;


        
        
  

import java.util.Scanner;


public class TowDimentional {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] A = new int [2][3];
        System.out.print("input number A ");
        for(int row= 0; row<2; row++){
            for (int col=0 ;col<3;  col++){
                A [row][col]=input.nextInt();
                
            }
        }
        
        System.out.print(" A= ");
         for(int row= 0; row<2; row++){
            for (int col=0 ;col<3;  col++){
              
                System.out.print("\t"+A[row][col]);
                
                
            }
             System.out.println("");
                     
             
          
        }
        
           
                
                
            }
            
                
        }
     
    


