/**
 * Write a description of class Log_Flume here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        System.out.print("To ride this attraction, it will cost you ");
        System.out.println("$ " + getPrice() + ", " + super.getName());
    }
}
