/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ball;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author daniw
 */
public class BallFrame extends JFrame {
    
    JPanel jp;
    
    public BallFrame()
    {
        setSize(600, 400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        jp = new GPanel();
        
        add(jp);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);
        
        Ball b = new Ball(300, 200);
        g.fillOval(b.getX(), b.getY(), 2*b.getRadius(), 2*b.getRadius());
    }
}
