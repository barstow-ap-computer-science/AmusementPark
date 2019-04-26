//Sola Dugbo
public class RollerCoaster extends Attraction {
    int size = 0;
    public RollerCoaster(String name, Double price, int size) {
        super(name, price);
        this.size = size;
    }
  
    public void interact() {
        int rand = (int)(Math.random() * ((5) + 1));
        if(rand == 0){
            System.out.println("People Screaming");
        }
        else if(rand == 1){
            System.out.println("people put hands up!");
        }
        else if(rand == 2){
            System.out.println("Someone has fallen out! uh oh");
        }
        else if(rand == 3){
            System.out.println("someone threw up");
        }else if(rand == 4){
            System.out.println("WeeeeeeeeeeEeeEEEEeee");
        }
        else if(rand == 5){
            System.out.println("someone who was too scared to go on the ride finally got on and is now addicted to roller coasters");
        
        }
       
    }
    
}