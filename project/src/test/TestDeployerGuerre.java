package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Joueur.JoueurAgricole;
import Joueur.JoueurGuerre;
import actions.DeployerAgricole;
import personnages.Armee;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;
import plateaux.PlateauGuerre;
import ressources.agricole.Roches;
import tuiles.Montagne;
import tuiles.Ocean;
import tuiles.Tuile;

class TestDeployerGuerre {
	private PlateauGuerre p;
	private Armee a;
	private JoueurGuerre j1;
	private Montagne m;
	private Roches r;
	
	

	@Test
	void TestExecute() {
		this.p = new PlateauGuerre(20,10);
		this.j1 = new JoueurGuerre("player1");
		this.a= new Armee(2);
		
		for(int x=0;x<this.p.getLargeur();x++){
			for (int y=0;y<this.p.getHauteur();y++) {
				if(!(this.p.getTuile(5, 3) instanceof Ocean)) {
				this.p.getTuile(5, 3).setProprietaire(j1);
				this.p.getTuile(5, 3).setPersonnage(a);
				assertEquals(j1,p.getTuile(5, 3).getProprietaire());
				
				}
				
			}
			
			

		}
		
		
		
		
		
		

	

		
		
	}
	@Test
	void TestConverTailleTuile() {
		int res = 0;
		this.r = new Roches();
		this.m = new Montagne(r,3,2,2);
		this.a= new Armee(2);
		this.m.setPersonnage(a);
		assertFalse(this.m.isFree());
		assertEquals(35,j1.getNbPersonnage());
		res= m.getPeresonnage().getTaille()+2;
		assertEquals(4,res);
		
	}


}
