
/**
 * Write a description of class Darts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DartBoard extends Attraction
{
    int locationX = 0;
    int locationY  = 0;
    int[][] board;
    public DartBoard(String name,int price) {
        super(name, price);
        board = new int[10][10];
    }
    
    public void shoot(){
      locationX  = (int)(Math.random() * ((10) + 1));
      locationY  = (int)(Math.random() * ((10) + 1));
    }
    public int getX(){
        return locationX;
    }
    public int getY(){
        return locationY;
    }
    
    public void interact() {
        Dart dart = new Dart(getX(),getY());
        dart.draw(board);
    }
    
    
}
