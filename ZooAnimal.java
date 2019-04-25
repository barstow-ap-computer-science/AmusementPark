/*
 * Represents an animal in a Zoo.
 * 
 * @author Grayson Martin
 */
public class ZooAnimal {
    private String name;
    private String sound; // roar
    
    public ZooAnimal(String n, String s) {
        name = n;
        sound = s;
    }
    
    public String getName() {
        return name;
    }
    
    public String makeSound() {
        return sound;
    }
}
