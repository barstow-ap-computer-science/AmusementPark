import java.awt.Desktop;
import java.net.URL;

/*
 * A class that represents a Game. Has a special surprise.
 */

public class Game extends Attraction {
    public Game(String name, Double price) {
        super(name, price);
    }

    public void interact() {
        try {
            Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=dQw4w9WgXcQ").toURI());
        } catch (Exception e) {}
    }
}