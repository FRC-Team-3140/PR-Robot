package org.usfirst.frc.team3140.robot;

import edu.wpi.first.wpilibj.Joystick;

public class SmartJoystick extends Joystick {

	public SmartJoystick(int port) {
		super(port);
	}

	// Gets the value of the joystick along the X-axis and cubes it
	public double getSmartX() {
		return Math.pow(super.getX(), 3);
	}

	// Gets the rotation of the joystick along the Z-axis
	public double getSmartRotation() {
		return Math.pow(super.getTwist(), 3); // May need to switch to getZ()
	}

	// Gets the magnitude of the joystick, cubes it, and multiplies it by 4
	public double getSmartMag() {
		return (Math.pow(super.getMagnitude(), 3) * 4);
	}
	
	public double getSmartPOV() {
		return super.getPOV();
	}
	
}
