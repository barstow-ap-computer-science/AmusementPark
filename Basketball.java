/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @4/22/2019
 */
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Basketball extends Attraction
{
    public Basketball(String inputName, double inputPrice)
    {
        super(inputName, inputPrice);
    }
    int makes = 0;
    @ Override
    public void interact()
    
   
    {
        
    }
    public String begin(){
    JOptionPane.showMessageDialog(null, "Welcome to Basketball Hoops!!");
    String welcome = JOptionPane.showInputDialog("How many balls would you like to play with?");
    JFrame frame = new JFrame("A Simple GUI");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLocation(430, 100);

    JPanel panel = new JPanel();

    frame.add(panel);

    JLabel lbl = new JLabel("Select one of the possible choices and click OK");
    lbl.setVisible(true);

    panel.add(lbl);

    String[] choices = { "Three balls", "Five Balls", "Ten Balls"};

    final JComboBox<String> cb = new JComboBox<String>(choices);

    cb.setVisible(true);
    panel.add(cb);

    JButton btn = new JButton("OK");
    panel.add(btn);

        return welcome;
    }
    
    public void basketball(){
    
    }
    
    public static void net(){
    
    }
    
    
    public String start(){
    int count = 0;
    int tries_3= 3;
    int tries_5 = 5;
    int tries_10 = 10;
     String [] albert = new String[10];
   for(int i= 0; i<tries_3; i ++){
       count ++;
    }
    for(int k = 0; k<tries_5; k++){
        count ++;
    }

    if(count >= 0 && count<= 5){ //needs to return different statements based on how many counts there are 
    JOptionPane.showMessageDialog(null, "Good job, would you like to try again?");
    }
    if(count>=6 && count<= 10){
    JOptionPane.showMessageDialog(null, "Great job, if you get two more in, then you can get a prize!");
    }
     if(count>=6 && count<= 10){
    JOptionPane.showMessageDialog(null, "Great job, what prize would you like to have?");
    }
    
        return null;
    }
    
}