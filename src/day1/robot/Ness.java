package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Ness {
public static void main(String[] args) {
	Robot yolo = new Robot () ;
	for (int i = 0; i < 4; i++) {
		yolo.penDown();
		yolo.setPenColor(Color.ORANGE);
		yolo.setSpeed(100);
		yolo.move(300);
		yolo.turn(180);
		
	}
	
	
}
}
