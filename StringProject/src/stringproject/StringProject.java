
package stringproject;


public class StringProject {

   
    public static void main(String[] args) {
        String s1 = "Shohan Rony";
        String s2 = "Shehab Chuman";
        
        System.out.println("S1= "+ s1);
        System.out.println("S1= "+ s2);
        
        int length = s1.length();
        System.out.println("s1 length = " + length);
        if (s1.equals(s2))
            System.out.println("equals");
        else
            System.out.println("Not equals");
        
        boolean b = s1.startsWith("S");
        System.out.println(b);
        //bolean is use for finding the value true or false
        boolean last = s2.endsWith("g");
        System.out.println(last);
                           
                
  
    }
    
}
