package MP7;

import javax.swing.JFrame;
import java.util.Stack;
import java.awt.*;
import java.util.Scanner;


public class Polka extends JFrame
{
    Circle c;
    //private static int n;
    public Polka()
    {
        super("Circle");
        c = new Circle();
        setSize(600, 600);
        setVisible(true);
        //repaint();
    }
    
    public Color randColor()
    {
        //Color c = new Color((int)(255*Math.random()), (int)(255*Math.random()), (int)(255*Math.random()));
        return c.getC();
    }
    
    public void paint (Graphics g)
    {
        Stack<Circle>blah = new Stack<Circle>();
        
        
        for(int x = 0; x < 49; x++)
        {
            Circle d = c.create();
            
            g.setColor(d.getC());
            g.fillOval((int)d.getX(), (int)d.getY(), (int)(2*d.getRad()), (int)(2*d.getRad()));
            blah.push(d);
            //blah.peek();
            try
            { 
                Thread.currentThread();
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        
        
        for(int x = 0; x < 49; x++)
        {
            g.setColor(Color.WHITE);
            Circle d = blah.pop();
            g.fillOval((int)d.getX(), (int)d.getY(), (int)(2*d.getRad()), (int)(2*d.getRad()));
            try
            { 
                Thread.currentThread();
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args)
    {
    	//Scanner blah = new Scanner(System.in);
    	//System.out.println("How many stars would you like to make?");
    	//n = blah.nextInt();
        Polka x = new Polka();
        JFrame frame = new JFrame("Polka Dots"); // The main window
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	        frame.setBounds(0, 0, 600, 600);
	        frame.setBackground(Color.BLACK);
	    }

}
