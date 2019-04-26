//Sola Dugbo
import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Dart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dart 
{
    public Dart(int xcord,int ycord){

        int cordX = xcord;
        int cordY = ycord;
    }
    
    public void draw(int[][] ary,int[]point){
      int row = ary.length;
      int col = ary[0].length;
      int i, j;
      JFrame frame=new JFrame();
      frame.setVisible(true);
      frame.setBounds(50, 50, 900, 500);
      JLabel label = new JLabel("This is a Swing frame", JLabel.CENTER);
        // Look familiar?  <----------

      frame.add(label);
        //label.setText("<html>This is a<br>multline label!<br> Try it yourself!</html>");
      for(int d = 0; d<point.length; d++){
          //label.setText((point[d]+ " b"));
          //label.setText(point[d]+ "  ");
          System.out.print(point[d]+ "  ");
        }
      System.out.println();
      
      
      for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               //label.setText(ary[i][j]+ "   ");
               System.out.print(ary[i][j]+ "   ");
           }
           System.out.println();
       }
      frame.add(label);
      
       
    }
    
}
