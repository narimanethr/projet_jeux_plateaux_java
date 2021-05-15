package test;
import static org.junit.Assert.*;

import org.junit.Test;

import plateaux.*;
public class TestPlateau {
	private Plateau p1;

	@Test
	public void TestGetHauteur() {
		this.p1 = new PlateauAgricole(10,20);
		assertEquals(20,p1.getHauteur());
		
	}
	@Test
	public void TestGetLargeur() {
		this.p1 = new PlateauAgricole(10,20);
		assertEquals(10,p1.getLargeur());
		
	}

}
