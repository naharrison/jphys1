package edu.ung.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class Vector2DTest {
	
	@Test
	public void test1() {
		Vector2D vec1 = new Vector2D(3.0, 4.0);
		assertEquals(vec1.magnitude(), 5.0, 1e-6); // 3rd arg is tolerence (delta)

		Vector2D vec2 = Vector2D.initWithMagnitudeAndTheta(1.0, Math.PI/4.0);
		assertEquals(vec2.x, Math.cos(Math.PI/4.0), 1e-6);
		assertEquals(vec2.y, Math.sin(Math.PI/4.0), 1e-6);
		assertEquals(vec2.theta(), Math.PI/4.0, 1e-6);
	}
	
}
