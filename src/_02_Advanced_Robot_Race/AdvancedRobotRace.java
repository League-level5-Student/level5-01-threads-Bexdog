package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	static // Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	// 1. make a main method
	boolean finished = false;
		public static void main(String[] args) {
			// 2. create an array of 5 robots.
			Robot[] robot = new Robot[5];
			// 3. use a for loop to initialize the robots.
			for (int i = 0; i < robot.length; i++) {
				robot[i] = new Robot();
			}
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			for (int i = 0; i < robot.length; i++) {
				robot[i].setX(900 - (i * 150));
				robot[i].setY(290);
				robot[i].setSpeed(10);
			}
			// 5. use another for loop to iterate through the array and make each robot move
			// a random amount less than 50.
			Thread r0 = new Thread(()->{int randy = new Random().nextInt(50);
			while (finished == false) {
				robot[0].move(randy);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				randy = new Random().nextInt(50);
				if(robot[0].getY()<=0) {
					finished = true;
				}
			}});
			Thread r1 = new Thread(()->{int randy = new Random().nextInt(50);
			while (finished == false) {
				robot[2].move(randy);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				randy = new Random().nextInt(50);
				if(robot[1].getY()<=0) {
					finished = true;
				}
			}});
			Thread r2 = new Thread(()->{int randy = new Random().nextInt(50);
			while (finished == false) {
				robot[2].move(randy);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				randy = new Random().nextInt(50);
				if(robot[2].getY()<=0) {
					finished = true;
				}
			}});
			Thread r3 = new Thread(()->{int randy = new Random().nextInt(50);
			while (finished == false) {
				robot[3].move(randy);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				randy = new Random().nextInt(50);
				if(robot[3].getY()<=0) {
					finished = true;
				}
			}});
			Thread r4 = new Thread(()->{int randy = new Random().nextInt(50);
			while (finished == false) {
				robot[4].move(randy);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				randy = new Random().nextInt(50);
				if(robot[4].getY()<=0) {
					finished = true;
				}
			}});
			

			// 6. use a while loop to repeat step 5 until a robot has reached the top of the
			// screen.
			r0.start();
			r1.start();
			r2.start();
			r3.start();
			r4.start();
			// 7. declare that robot the winner and throw it a party!
			for (int i = 0; i < robot.length; i++) {
				if (robot[i].getY() <= 0) {
					int b = i + 1;
					JOptionPane.showMessageDialog(null, "Robot " + b + " wins!!!!!!");
				}
			}
}
		
		
}
