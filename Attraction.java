/**
 * Abstract class Attraction - write a description of the class here
 *
 * @author (your name here)
 * @4/22/2019
 */
public abstract class Attraction
{
    private String name;
    private double price;
    
    public Attraction(String inputName, double inputPrice)
    {
        name = inputName;
        price = inputPrice;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public abstract void interact();
}