//Sola Dugbo
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
    int scores = 0;
    int[][] board;
    int[] score = new int[]{1,20,5,40,3,16,5,18,19,12};
    int points = 1;
    public DartBoard(String name,int price) {
        super(name, price);
        board = new int[10][10];
        
    }
    
    public void shoot(int skill){
      locationX  = (int)(Math.random() * ((skill) + 1));
      locationY  = (int)(Math.random() * ((skill) + 1));
      board[locationX][locationY] = 1;
    }
    
    public int getX(){
        return locationX;
    }
    public int getY(){
        return locationY;
    }
    public int getScores(){
        int scoreLoc = locationY;
        scores = scores + score[scoreLoc];
        return scores;
    }
    @Override
    public void interact() {
        int skillz = 10;
        this.shoot(skillz);
        Dart dart = new Dart(getX(),getY());
        dart.draw(board,score);
        System.out.println("Score:"+this.getScores());
        //board[locationX][locationY] = 0;
    }
    
    
}
