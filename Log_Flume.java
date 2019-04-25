/**
 * This is the best ride at the park.
 * You get to eat Rucci's as a part of this ride
 * You also get to borrow Mr. Daniel's red hot Fit
 *
 * @Scott Daniel
 * @version today
 */
public class Log_Flume extends Attraction
{

    /**
     * Constructor for objects of class Log_Flume
     */
    public Log_Flume(String name, double price)
    {
        super (name,price);

    }

    // Example of abstract method  - implementation
    public void interact ()
    {
        System.out.print("To ride the " + getName() +", it will cost you ");
        System.out.println("$ " + getPrice());
        System.out.println("Oops - I dropped my samosas!");
    }
}
