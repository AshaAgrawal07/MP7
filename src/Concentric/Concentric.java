package Concentric;

import java.awt.*;  
import javax.swing.JFrame; 
//import java.util.Scanner;
import java.awt.Color;
public class Concentric extends Canvas{
	private static int x = 400; 
	private static int y = 450; 
	private static int radius = 1350; 
	private static int n = 200; 


	public void paint(Graphics g){  
		
	      for(int i = 0; i < n; i++) {
	    	  Graphics2D g2d = (Graphics2D)g;
	    	    int width = 10;
	    	    g2d.setStroke(new BasicStroke(width));
	    	        	  
	    	  if( i%4 == 0) {
	    		  g2d.setColor(Color.blue);
	    	  } else if(i%4 == 1) {
	    		  g2d.setColor(Color.green.darker());
	    	  } else if(i%4 == 2) {
	    		  g2d.setColor(Color.yellow.darker());
	    	  } else if(i%4 == 3) {
	    		  g2d.setColor(Color.red);
	    	  }
	    	  
	    	  g2d.drawOval(x,y,radius,radius); 
	    	  radius = radius - 10; 
	    	  
	    	  try {
	    		  Thread.sleep(100);
	    		  } catch (InterruptedException e) {
	    		  e.printStackTrace();
	    		  };
	    	
	    	 }
	}
	
	public static void main(String[] args) {  
        
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("How many concentric circles do you want to draw?:");
//		n = in.nextInt();
//		
//		System.out.println("What should the initial radius be?");
//		radius = in.nextInt();
		
		Concentric m=new Concentric();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(2000,2000);    
        f.setVisible(true); 
	}
	
}
