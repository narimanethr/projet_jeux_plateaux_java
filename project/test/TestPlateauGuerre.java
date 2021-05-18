
import static org.junit.Assert.*;

import org.junit.Test;

import plateaux.PlateauAgricole;
import plateaux.PlateauGuerre;
import tuiles.Ocean;
public class TestPlateauGuerre {
	private PlateauGuerre p;
	private Ocean o;



	@Test
	public void TestgetNbTuiles() {
		this.p= new PlateauGuerre(10,20);
		assertEquals(200,p.getNbTuiles());
		

}
	@Test
	public void TestgetTuile() {
		this.p= new PlateauGuerre(10,20);
		this.o = new Ocean(null,1,2,3);
		this.o = (Ocean) p.getTuile(2, 3);
		assertEquals(o,p.getTuile(2, 3));
		

}
	@Test
	public void TestgetLargeur() {
		this.p= new PlateauGuerre(10,20);
		assertEquals(10,p.getLargeur());
		

	}

	

}
