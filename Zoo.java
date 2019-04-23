/*
 * Represents a Zoo.
 * 
 * @author Grayson Martin
 */
public class Zoo extends Attraction {
    ZooAnimal[] animals;
    
    public Zoo(String name, Double price, ZooAnimal[] animals) {
        super(name, price);
        this.animals = animals;
    }
    
    public void interact() {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName() + ": " + animals[i].makeSound());
        }
    }
}