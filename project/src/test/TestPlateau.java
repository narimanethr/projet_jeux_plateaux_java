package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import plateaux.*;
class TestPlateau {
	private Plateau p1;

	@Test
	void TestGetHauteur() {
		this.p1 = new PlateauAgricole(10,20);
		assertEquals(20,p1.getHauteur());
		
	}
	@Test
	void TestGetLargeur() {
		this.p1 = new PlateauAgricole(10,20);
		assertEquals(10,p1.getLargeur());
		
	}

}
