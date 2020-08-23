package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		
	Robot one = new Robot(300, 400);
	Robot two = new Robot(700, 400);
	Robot three = new Robot(1100, 400);
	Robot four = new Robot(500, 700);
	Robot five = new Robot(900, 700);
	
	one.setSpeed(10);
	two.setSpeed(10);
	three.setSpeed(10);
	four.setSpeed(10);
	five.setSpeed(10);
	
	one.setPenColor(Color.blue);
	two.setPenColor(Color.black);
	three.setPenColor(Color.red);
	four.setPenColor(Color.yellow);
	five.setPenColor(Color.green);
	
	one.setPenWidth(5);
	two.setPenWidth(5);
	three.setPenWidth(5);
	four.setPenWidth(5);
	five.setPenWidth(5);
	
	one.penDown();
	two.penDown();
	three.penDown();
	four.penDown();
	five.penDown();
	
	Thread r1 = new Thread(()->{for(int i = 0; i<72;i++) {one.move(20);one.turn(5);}});
	Thread r2 = new Thread(()->{for(int i = 0; i<72;i++) {two.move(20);two.turn(5);}});
	Thread r3 = new Thread(()->{for(int i = 0; i<72;i++) {three.move(20);three.turn(5);}});
	Thread r4 = new Thread(()->{for(int i = 0; i<72;i++) {four.move(20);four.turn(5);}});
	Thread r5 = new Thread(()->{for(int i = 0; i<72;i++) {five.move(20);five.turn(5);}});

		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	
}
}

