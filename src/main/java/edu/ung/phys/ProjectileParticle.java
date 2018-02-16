package edu.ung.phys;

import edu.ung.math.Vector2D;

public class ProjectileParticle {
	
	// fields:
	public Vector2D initialPosition, initialVelocity;
	public static final double g = 9.8;
	
	// constructors:
	public ProjectileParticle(Vector2D initialPosition, Vector2D initialVelocity) {
		this.initialPosition = initialPosition;
		this.initialVelocity = initialVelocity;
	}
	
	// methods:
	public double getMaxHeight() {
		return initialPosition.y + (initialVelocity.y*initialVelocity.y)/(2.0*g);
	}
	
	public double getAirTime() {
		return (initialVelocity.y + Math.sqrt(Math.pow(initialVelocity.y, 2) + 2.0*g*(initialPosition.y)))/g;
	}
	
	public double getHorizontalDistance() {
		return initialVelocity.x*getAirTime();
	}


}
