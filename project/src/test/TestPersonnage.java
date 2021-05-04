package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import personnages.Armee;
import personnages.Personnage;

class TestPersonnage {
	private Personnage p1;
	

	@Test
	void TestGetNbOr() {
		this.p1= new Armee(5);
		assertEquals(0,p1.getNbOr());
		
	}
	@Test
	void TestAddNbOr() {
		this.p1= new Armee(5);
		this.p1.addNbOr(5);
		assertEquals(5,p1.getNbOr());
		
	}
	@Test
	void TestGetTaille() {
		this.p1= new Armee(5);
		assertEquals(5,p1.getTaille());
		
		
	}
	@Test
	void TestSubTaille() {
		this.p1= new Armee(5);
		this.p1.subTaille(2);
		assertEquals(3,p1.getTaille());
		
	}

}
