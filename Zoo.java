
/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo extends Attraction {
    public Zoo(String name, Double price) {
        super(name, price);
    }
    
    public void interact() {
        System.out.println("zoo sounds");
    }
}
