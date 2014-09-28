/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ball;

import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author daniw
 */
public class Window extends JFrame
{
    JPanel jp;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BallFrame frame = new BallFrame();
        
        frame.setTitle("Ball");
        frame.setVisible(true);
        
        Graphics g = new componentGraphics.create();
        frame.paintComponent(g);
    }
    
}
