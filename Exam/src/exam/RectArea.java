
package exam;
class Rectangle {
    double length ,width ;
    Rectangle( double x ,double y){
        length = x;
        width = y;   
    }
    double  area(){
        return length*width;
    }
    
    
}
public class RectArea {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle (22,33);
        double area1 = rect1.area();
         System.out.println(" area is  = " +area1);
        
    }
} 

