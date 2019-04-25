import java.awt.Desktop;
import java.net.URL;
/**
 * The outline for an Attraction.
 *
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
    
    public final void youCantTouchThis()
    {
        try 
        {
            Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=rog8ou-ZepE").toURI());
        }
        catch (Exception e) {}  
    }
}