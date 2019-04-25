
/**
 * Simulates a giant swing.
 *
 * @author Tommy Cuezze
 * @version 4/24/19
 */
public class SuperSwing extends Attraction

{
    public SuperSwing(String thisName, double thisPrice) {
        super(thisName, thisPrice);
    }
    public void interact() {
        System.out.println("You're now riding the " + ".");
        System.out.println("It's a giant swing in the air.");
        System.out.println("Here you go!");
        System.out.println("WEEEEEEEEEE!!!");
        youCantTouchThis();
    }
}
