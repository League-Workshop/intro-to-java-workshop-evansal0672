package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	

	public static void main(String[] args) throws InterruptedException {
		
		// START HERE
	Robot rob = new Robot();
	rob.sparkle();
	rob.setSpeed(10000);
	rob.penDown();
	rob.move(200);
	rob.turn(90);
	rob.move(200);
	rob.turn(90);
	rob.move(200);
	rob.turn(90);
	rob.move(200);
	rob.turn(90);
	rob.hide();
	}
}
