/*
 * Represents a Bathroom in an Amusement park.
 * 
 * @author Grayson Martin
 */
public class Bathroom extends Attraction {
    static private int bathroomNumber = 0;
    
    public Bathroom() {
        super("Bathroom " + bathroomNumber, 0.00);
        bathroomNumber++; // great
    }
    
    public void interact() {
        System.out.println("Flushing sounds.");
    }
}