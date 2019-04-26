import java.util.*;
/**
 * Write a description of class Shops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shops extends Attraction
{
    private String name;
    private double price;
    private Random rn = new Random();
    private int numberOfShops;
    private String[] shops = new String[5];
    private boolean scottDanielHappiness;
    public Shops(String inputName, double inputPrice)
    {
        super(inputName, inputPrice);
        numberOfShops = rn.nextInt() * 10;
        shops[0] = "Java Textbook Shop";
        shops[1] = "AP Computer Science Prep Book Shop";
        shops[2] = "Shane Foster's Office Shop";
        shops[3] = "Colombo Shop";
        shops[4] = "Cuezze Shop";
    }
    
    public void interact()
    {
        System.out.println("There are " + numberOfShops + " shops.");
        for (int i = 0; i < shops.length; i++)
        {
            System.out.println(shops[i]);
        }
        System.out.println("Now Mr. Daniel comes, choose one shop to sacrifice: ");
        Scanner input = new Scanner(System.in);
        String shopToSacrifice = input.nextLine(); 
        if (shopToSacrifice == shops[0])
        {
            System.out.println("Java Textbook Shop is sacrificed. Mr. Daniel is happy.");
            scottDanielHappiness = true;
        }
        else if (shopToSacrifice == shops[1])
        {
            System.out.println("AP Computer Science Prep Book Shop is sacrificed. Mr. Daniel is happy.");
            scottDanielHappiness = true;
        }
        else if (shopToSacrifice == shops[2])
        {
            System.out.println("Shane Foster's Office Shop is sacrificed. Mr. Daniel is happy.");
            scottDanielHappiness = true;
        }
        else if (shopToSacrifice == shops[3])
        {
            System.out.println("Colombo Shop is sacrificed. Mr. Daniel is happy.");
            scottDanielHappiness = true;
        }
        else if (shopToSacrifice == shops[4])
        {
            System.out.println("Cuezze Shop is sacrificed. Mr. Daniel is happy.");
            scottDanielHappiness = true;
        }
        else
        {
            System.out.println("Oops, that shop doesn't exist. Mr. Daniel is disappointed.");
            scottDanielHappiness = false;
        }
        
        if (scottDanielHappiness == true)
        {
            System.out.println("Since Mr. Daniel is happy, no one will need to take the FRQ today.");
        }
        else
        {
            System.out.println("Since Mr. Daniel is disappointed, Albert will need to take the FRQ today.");
        }
    }      
}