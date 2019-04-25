import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Dart here.
 *
 * @author (your name)
 * @version (a version number or a date)
public class Dart 
{
    public Dart(int xcord,int ycord){

        int cordX = xcord;
        int cordY = ycord;
    }
    
    public void draw(int[][] ary){
      int row = ary.length;
      int col = ary[0].length;
      int i, j;
      JFrame frame=new JFrame();
      frame.setVisible(true);
      frame.setBounds(50, 50, 900, 500);
      for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               System.out.print(ary[i][j]+ "  ");
           }
           System.out.println();
       }
       
    }
    
}
