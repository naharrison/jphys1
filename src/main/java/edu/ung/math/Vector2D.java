package edu.ung.math;

public class Vector2D {

	// fields:
	public double x, y;
	
	// constructors:
	public Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// methods:
	public static Vector2D initWithMagnitudeAndTheta(double mag, double theta) {
		return new Vector2D(mag*Math.cos(theta), mag*Math.sin(theta));
	}

	public double magnitude() {
		return Math.sqrt(x*x + y*y);
	}

	public double theta() {
		return Math.atan2(y, x);
	}
	
}
