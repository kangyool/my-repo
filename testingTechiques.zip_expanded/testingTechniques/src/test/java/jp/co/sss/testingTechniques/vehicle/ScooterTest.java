package jp.co.sss.testingTechniques.vehicle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScooterTest {

	@Test
	void testDrive() {

		Scooter scooter = new Scooter();
		assertEquals(8, scooter.drive(2, 9));
	}

}
