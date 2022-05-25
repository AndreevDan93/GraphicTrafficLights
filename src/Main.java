import javax.swing.*;
import java.awt.*;

public class Main extends JComponent{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Светофор");
        frame.getDefaultCloseOperation();
        frame.setSize(600,600);
        frame.setLocation(500,290);
        frame.getContentPane().add(new Main());
        frame.setVisible(true);
    }

    public void paint(Graphics graphics){
        graphics.setColor(Color.black);
        graphics.fillRoundRect(200,50,150,400,50,50);
        graphics.fillRoundRect(240,460,70,70,20,20);
        graphics.fillArc(240,20,70,50,0,180);
        graphics.setColor(Color.red);
        graphics.fillOval(225,75,100,100);
        graphics.setColor(Color.yellow);
        graphics.fillOval(225,200,100,100);
        graphics.setColor(Color.green);
        graphics.fillOval(225,325,100,100);


    }
}