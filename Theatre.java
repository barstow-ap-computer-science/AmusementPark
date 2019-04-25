import java.util.Scanner;
/**
 * Simulates a theatre
 *
 * @author Tommy C
 * @version 4/25/19
 */
public class Theatre extends Attraction
{
    String[] shows; //a list of shows the theatre has available.
    Scanner in = new Scanner(System.in); //scanner
    int show; //holds show selection
    public Theatre(String name, double price, String[] inShows) {
        super(name, price);
        shows = inShows;
    }
    
    public void interact() {
       System.out.println("Choose a show to watch. Here are today's showings:");
        for (int i = 0; i < shows.length; i++) {
            System.out.print((i+1) + ": ");
            System.out.println(shows[i]);
        }
      System.out.println("Please enter the number of the show you want to watch: ");
      show = in.nextInt() - 1;
      System.out.println("Thank you for choosing " + super.getName() + "! You're watching " + shows[show] + ". Enjoy!");
    }
}
