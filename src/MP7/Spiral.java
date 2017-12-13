package MP7;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.Random;


public class Spiral extends JFrame
{
	public Spiral() 
	{
		super("Flame Fractal");
        setSize(600, 600);
        setVisible(true);
	}
	//this actually is not a fractal
/*	private void drawFlame(Graphics g, int xi, int yi, double angle, int num)
	{
		//if(num <= 0) 
		//{
			//return;
		//}
		
		 for(int i = 0; i < 50; i++)
		 {
			 int xf = xi + (int) (Math.cos(Math.toRadians(angle))*num*10);
				int yf = yi + (int) (Math.sin(Math.toRadians(angle))*num*10);
				if(num%2 == 0)
					g.setColor(redish());
				else
					g.setColor(blueish());
				g.drawLine(xi, yi, xf, yf);
				 try
		         { 
		             Thread.currentThread();
		             Thread.sleep(20);
		         }
		         catch(InterruptedException e)
		         {
		             e.printStackTrace();
		         }
				 
			 drawFlame(g, (xi+xf)/2, (yi+yf)/2, angle+10, num);
			 drawFlame(g, (xi+xf)/2, (yi+yf)/2, angle-10, num);
		 }
		
	}*/
	
	private Color redish()
	{
		int r = (int) (Math.random()*100);
		int g = (int) (Math.random()*256);
		int b = (int) (Math.random()*100);
		Color c = new Color(r, g, b);
		return c;
	}
	
	private Color blueish()
	{
		//Random ran = new Random();
		int r = (int) (Math.random()*256);
		int g = (int) (Math.random()*100);
		int b = (int) (Math.random()*256);
		Color c = new Color(r, g, b);
		return c;
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK); 
		//drawFlame(g, 400, 500, -90.0, 10);
		int xi = 200; 
		int yi = 200;
		double angle = -90;
		int num = 10;
		for(int i = 0; i < 5000; i++)
		 {
			 int xf = xi + (int) (Math.cos(Math.toRadians(angle))*num*10);
				int yf = yi + (int) (Math.sin(Math.toRadians(angle))*num*10);
				if(i%2 == 0)
					g.setColor(redish());
				else
					g.setColor(blueish());
				g.drawLine(xi, yi, xf, yf);
				 try
		         { 
		             Thread.currentThread();
		             Thread.sleep(20);
		         }
		         catch(InterruptedException e)
		         {
		             e.printStackTrace();
		         }
		     xi = (xi+xf)/2;
		     yi = (yi+yf)/2;
		     angle += 17;
			 //drawFlame(g, xi, yi, angle+10, num);
			 //drawFlame(g, xi, yi, angle-10, num);
		 }
	}
	public static void main(String[] args)
	{
		Spiral x = new Spiral();
        JFrame frame = new JFrame("Spiral"); // The main window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setBounds(0, 0, 1200, 1200);
        frame.setBackground(Color.BLACK);
	}
}
