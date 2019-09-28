
package stringproject;


public class StrimgBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer ("Shohinur Pervez Shohan");
        System.out.println(sb);
        
        sb.append(" shohan Rony");
        sb.append(" programmer");
        System.out.println(sb);
        //.append is use for add value with anohter variable value
        
        sb.reverse();
        System.out.println(sb);
        
        sb.setLength(6);
        System.out.println(sb);
        /*note that string builder and string buffer both are
        same type normal string class is not changable 
        but those tow string class is changable*/
        
        
         
    }
    
}
