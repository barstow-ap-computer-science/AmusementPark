import java.util.ArrayList;
/**
 * Represents a Visitor to an AmusementPark
 *
 * @author Grayson Martin
 */
public class ParkVisitor {
    private String name;
    private AmusementPark currentPark;
    private Double money;
    
    public ParkVisitor(String name, Double money) {
        this.name = name;
        this.money = money;
    }
    
    public void visitPark(AmusementPark park) {
        currentPark = park;
    }
    
    public void interactWithAllOfTheAttractions() {
        if (currentPark != null) {
            ArrayList<Attraction> attractions = currentPark.getAttractions();
            for (Attraction attraction: attractions) {
                if (money > attraction.getPrice()) {
                    attraction.interact();
                    money = money - attraction.getPrice();
                } else {
                    System.out.println("No money...");
                }
            }
        } else {
            System.out.println("I am not currently visiting a park.");
        }
    }
}
