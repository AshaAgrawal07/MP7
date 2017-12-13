package MP7;

import java.awt.Color;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class Master {
	private static int choice;
	public static void main(String[] args) {
		
		System.out.println("Welcome to Asha and Nikhila's MP7 Project: POINTLESS CIRCLES");
				
		 Timer timer = new Timer();
		 timer.schedule(new TimerTask(){
		    public void run() {
		       System.out.println(" Pick an animation to view! \n (Type in the assigned number to execute it)");
		    }
		  }, 3000);
		 
		 Timer timer1 = new Timer();
		 timer1.schedule(new TimerTask(){
		    public void run() {
		       System.out.println(" 1.Cone \n 2.Spiral \n 3.Polka dots");
		    }
		  }, 4000);
		 	 
		 
		Scanner in = new Scanner(System.in);
		choice = in.nextInt();
				
		if(choice < 1|| choice > 3) {
			while(choice < 1|| choice > 3) {
			System.out.println(choice+" is not a valid option. Please enter a valid option");
			choice = in.nextInt();
			}
		} else if (choice == 1) {
			Cone m=new Cone();  
	        JFrame f=new JFrame();  
	        f.add(m);  
	        f.setSize(1200,1200);    
	        f.setVisible(true); 

			
		} else if(choice ==2) {
			Spiral x = new Spiral();
	        JFrame frame = new JFrame("Spiral"); // The main window
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	        frame.setBounds(0, 0, 1200, 1200);
	        frame.setBackground(Color.BLACK);
	        
		} else if(choice == 3) {
			 Polka x = new Polka();
		        JFrame frame = new JFrame("Polka Dots"); // The main window
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		        frame.setBounds(0, 0, 600, 600);
		        frame.setBackground(Color.BLACK);
		}
		
	}
}
