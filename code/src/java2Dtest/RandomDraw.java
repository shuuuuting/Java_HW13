/*
 * B10433006_張舒婷
 */
package java2Dtest;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author zhangshuting
 */
public class RandomDraw {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyTest");
        frame.setSize(410, 410);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyPanel());
        frame.setVisible(true);
    }  
}
class MyPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(2));
        setBackground(Color.DARK_GRAY);
        for(int i=0;i<10;i++){
            Random ran = new Random();
            Color color = new Color(ran.nextInt(225),ran.nextInt(225),ran.nextInt(225));
            g.setColor(color);
            g.drawRect(ran.nextInt(200),ran.nextInt(200),ran.nextInt(200),ran.nextInt(200));
        }        
    }
}