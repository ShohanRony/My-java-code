
package exam;



 class Room {
    int length;
    int width ;
    Room(int x , int y ){
        length =x;
        width =y;
        
    }
    int area(){
        return length*width;
    }
 }
    
 class Bedroom extends Room {
    int height;
    
     Bedroom(int x, int y, int z) {
        super(x, y);
         height = z;
        
    }
     int volume(){
    return (length*width*height);
}
    
    
}         
    
public class SuperKey {
   

    
    public static void main(String[] args) {
        Room room1 = new Room(12,13);
        int area1 = room1.area();
        Bedroom room2 = new Bedroom(12,13,14);
        int volume1 = room2.volume();
        
        System.out.println("Area = " +area1);
        System.out.println("volume = " +volume1);
        
        
    }


    }
    


    

