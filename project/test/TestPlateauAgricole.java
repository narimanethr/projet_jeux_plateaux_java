
import static org.junit.Assert.*;

import org.junit.Test;

import plateaux.PlateauAgricole;
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
		this.p= new PlateauAgricole(10,20);
		this.o = new Ocean(null,1,2,3);
		this.o = (Ocean) p.getTuile(2, 3);
		assertEquals(o,p.getTuile(2, 3));
		

}
	@Test
	public void TestgetLargeur() {
		this.p= new PlateauAgricole(10,20);
		assertEquals(10,p.getLargeur());
		

	}
	@Test
	public void TestTuileAleatoire(){
		
	
}
	@Test 
	public void TesthasAjNotOcean() {
		boolean res = false;
		PlateauAgricole p = new PlateauAgricole(10,20);
		for (int y=0;y<p.getHauteur();y++) {
			for (int x=0; x<p.getLargeur();x++) {
				if(!(p.getTuile(y, x) instanceof Ocean)) {
					p.hasAjNotOcean(y, x);
					assertTrue(res);
					
				}
				
			
				
			}
			
		
	}
	}
	@Test 
	public void TestAffiche() {
		
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
