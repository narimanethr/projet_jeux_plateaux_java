
import static org.junit.Assert.*;

import org.junit.Test;

import plateaux.PlateauAgricole;
import plateaux.PlateauGuerre;
import tuiles.Ocean;

public class TestPlateauAgricole {
	private PlateauAgricole p;
	private Ocean o;



	@Test
	public void TestgetNbTuiles() {
		this.p= new PlateauAgricole(10,20);
		assertEquals(200,p.getNbTuiles());
		

}
	@Test
	public void TestgetTuile() {
		PlateauAgricole p= new PlateauAgricole (1,1);	
		assertTrue(!(p.getTuile(0, 0)instanceof Ocean));
	
		

}
	@Test
	public void TestgetLargeur() {
		this.p= new PlateauAgricole(10,20);
		assertEquals(10,p.getLargeur());
		

	}
	
	
	@Test
	public  void TestgetNBtuilOcean() {
		this.p= new PlateauAgricole(10,20);
		assertEquals(p.getNbTuiles()*2/3,p.getNBtuilOcean());
		
		
	}
	@Test
	public void TestAllTileNotFree() {
		this.p= new PlateauAgricole(10,20);
		assertEquals(false,p.AllTileNotFree());
	
		
		
	}
	
}
