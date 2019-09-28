
package stringproject;


public class StringDemo3 {
    public static void main(String[] args) {
        String country = "   my country is bangladesh      ";
        
        char ch = country.charAt(0);
        System.out.println("ch = "+ ch);
        //.charAt(i)= is use for find the char which is situated in i number of array
        
        String S1 = country.trim();
        System.out.println("s1 = "+S1);
        //.trim is use for camceling the extra space at first and last
        
        int value = country.codePointAt(2);
        System.out.println("value = "+ value );
        //codePointAt is use for find the given array number charecter ASSCI value
        
        int pos = country.indexOf("ban");
        System.out.println("first position is = " + pos);
        //.indexOf mathode is use for find the exact position of given charecter
        
        pos = country.lastIndexOf("c");
        System.out.println("last position is = "+ pos);
        
        
        
        
        
    }
    
}
