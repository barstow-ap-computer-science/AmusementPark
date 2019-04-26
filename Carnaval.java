// Import Random class
import java.util.Random;
/**
 * Carnaval is a carnaval attraction.
 *
 * @andrei.kolobrodov
 * @4/22/2019
 */
public class Carnaval extends Attraction
{
    // Instance variables for interaction
    private boolean hasFunnelCakes;
    private boolean hasFerrisWheel;
    private boolean hasPieEatingConcept;
    
    // Random object
    private Random rn = new Random();
    
    // Constructor for Attraction
    public Carnaval(String inputName, double inputPrice)
    {
        super(inputName, inputPrice);
    }
    
    // Initialize booleans
    public void initializeBooleans()
    {
        int random;
        
        random = rn.nextInt(10);
        if (random % 2 == 0)
        {
            hasFunnelCakes = true;
        }
        
        random = rn.nextInt(10);
        if (random % 2 == 0)
        {
            hasFerrisWheel = true;
        }
        
        random = rn.nextInt(10);
        if (random % 2 == 0)
        {
            hasPieEatingConcept = true;
        }
    }
    
    // Interact with attraction
    public void interact()
    {
        this.initializeBooleans();
        
        if (this.hasFunnelCakes)
        {
            System.out.println("I'm going to eat 20 funnel cakes");
        }
        
        if (this.hasFerrisWheel)
        {
            System.out.println("Let's ride the ferris wheel");
            System.out.println("            __  __");
            System.out.println("        __ [_|]'_|] __");
            System.out.println("      [_|].-'-_-_'-._]");
            System.out.println("    _.'.'-.-''   '-.-'__");
            System.out.println("    [_|]-.'.  '   ' .'.-_]");
            System.out.println("  _/ /_/ '.'. ' ' .  .' -_");
            System.out.println("  [_|]_'    '.'_'_. .'  '._]");
            System.out.println("  |_|_| = = (.-_o) = = :-_'");
            System.out.println("  [_|] _    .//||_//    .-_]");
            System.out.println("   |_|_| .'//_//_\\'. .-.");
            System.out.println("    [_|]_`./.-/.-.-\\'-_]");
            System.out.println("     '.'.-'-//__.\\\\.'");
            System.out.println("      [_|]-/.-_ .-[_\\");
            System.out.println("       // // [_|]  \\\\");
            System.out.println(" _____//_//_________\\\\_____");
        }
        
        if (this.hasPieEatingConcept)
        {
            System.out.println("Pie-eating noises");
        }
    }
}