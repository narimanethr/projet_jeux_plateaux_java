package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


import plateaux.PlateauAgricole;

import tuiles.Ocean;


class TestPlateauAgricole {
	private PlateauAgricole p;
	private Ocean o;



	@Test
	void TestgetNbTuiles() {
		this.p= new PlateauAgricole(10,20);
		assertEquals(200,p.getNbTuiles());
		

}
	@Test
	void TestgetTuile() {
		this.p= new PlateauAgricole(10,20);
		this.o = new Ocean(null,1,2,3);
		this.o = (Ocean) p.getTuile(2, 3);
		assertEquals(o,p.getTuile(2, 3));
		

}
	@Test
	void TestgetLargeur() {
		this.p= new PlateauAgricole(10,20);
		assertEquals(10,p.getLargeur());
		

	}
	@Test
	void TestTuileAleatoire(){
	
}
	@Test 
	void TesthasAjNotOcean() {
		
	}
	@Test
	void TestgetNBtuilOcean() {
		this.p= new PlateauAgricole(10,20);
		assertEquals(p.getNbTuiles()*2/3,p.getNBtuilOcean());
		
		
	}
	@Test
	void TestAllTileNotFree() {
		this.p= new PlateauAgricole(10,20);
		assertEquals(false,p.AllTileNotFree());
	
		
		
	}
	
}
