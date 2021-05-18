
import static org.junit.Assert.*;

import org.junit.Test;

import Joueur.JoueurGuerre;
import actions.DeployerGuerre;
import plateaux.PlateauAgricole;
import plateaux.PlateauGuerre;
import tuiles.Ocean;
public class TestPlateauGuerre {
	@Test
	public void TestgetNbTuiles() {
		PlateauGuerre p= new PlateauGuerre(10,20);
		assertEquals(200,p.getNbTuiles());
		

}
	@Test
	public void TestgetTuile() {
		PlateauGuerre p= new PlateauGuerre(1,1);	
		assertTrue(!(p.getTuile(0, 0)instanceof Ocean));
		

}
	@Test
	public void TestgetLargeur() {
		PlateauGuerre p= new PlateauGuerre(10,20);
		assertEquals(10,p.getLargeur());
		

	}

	

}
