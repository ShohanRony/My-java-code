
package superkey;


public class SuperKey {

    
    public static void main(String[] args) {
        Bedroom room1 = new Bedroom(11,22,12);
        int area1 = room1.area();
        int volume1 = room1.volume();
        
        System.out.println("Area = " +area1);
        System.out.println("volume = " +volume1);
        
        
    }
    
}
