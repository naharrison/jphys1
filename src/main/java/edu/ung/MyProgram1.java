package edu.ung;

import edu.ung.math.Vector2D;
import edu.ung.phys.ProjectileParticle;

public class MyProgram1 {
public static void main(String[] args) {
	
	/*
	 * A projectile starts at point (x, y) = (3, 4)m with initial velocity (5, 2)m/s.
	 * How long is it in the air?
	 * What is its maximum height?
	 * How much horizontal distance does it cover?
	 */
	Vector2D initialPosition = new Vector2D(3, 4);
	Vector2D initialVelocity = new Vector2D(5, 2);
	ProjectileParticle pp = new ProjectileParticle(initialPosition, initialVelocity);
	double airTime = pp.getAirTime();
	double maxHeight = pp.getMaxHeight();
	double xDist = pp.getHorizontalDistance();
	System.out.println(airTime + " " + maxHeight + " " + xDist);
	
}
}
