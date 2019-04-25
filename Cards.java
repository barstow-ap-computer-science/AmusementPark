 


import java.util.*;

public class Cards extends Attraction
{
public Cards()
  {
    super("Cards", 2.75);
  }
   public void interact()
   {
                Random rand = new Random();           
                Scanner in = new Scanner(System.in);
                //computer turn:
               int computerfirstCard = rand.nextInt(13)+1;
               int computersecondCard = rand.nextInt(13)+1;
               int computerTotal = computerfirstCard + computersecondCard;
               while(computerTotal<21)
               {
                   computerTotal += rand.nextInt(13)+1;
               }
               
               //player turn:
               int firstCard = rand.nextInt(13)+1;
               int secondCard = rand.nextInt(13)+1;
               int total = firstCard+secondCard;
               if(total>21)
               {
                   System.out.println("Sorry bruh, your already busted, thats some bad luck.");
               }
               System.out.println("You have " + total + ", would you like to hit or stay?");
               String response = in.next();
               while(response.equals("hit"))
               {
                   total += rand.nextInt(13)+1;
                   System.out.println(total + ", hit or stay?");
                   response = in.next();
                   if(total>21)
                   {
                       System.out.println(total + ", Sorry, you busted");
                   }
               }
               if(response.equals("stay"))
               {
                   if(computerTotal<21&&computerTotal>total||total>21&&computerTotal<21)
                   {
                       System.out.println("Sorry you lose " + computerTotal + ", " + total);
                   }
                   if(total<21&&total>computerTotal||total<21&&computerTotal>21)
                   {
                       System.out.println("You win " + total + ", " + computerTotal);
                   }
               }
           }           
   }

