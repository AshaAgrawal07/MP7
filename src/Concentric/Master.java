package Concentric;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

//test
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
			Concentric m=new Concentric();  
	        JFrame f=new JFrame();  
	        f.add(m);  
	        f.setSize(2000,2000);    
	        f.setVisible(true); 

			
		} else if(choice ==2) {
			
		} else if(choice == 3) {
			
		}
		
	}
}
