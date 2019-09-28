
package superkey;


public class Bedroom extends Room {
    int height;
    
     Bedroom(int x, int y, int z) {
        super(x, y);
         height = z;
        
    }
     int volume(){
    return (length*width*height);
}
    
    
}
