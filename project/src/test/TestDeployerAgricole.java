package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Joueur.JoueurAgricole;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;
import ressources.agricole.Roches;
import tuiles.Ocean;

class TestDeployerAgricole {
	private PlateauAgricole p;
	private Ouvrier o;
	private JoueurAgricole j1;
	

	@Test
	void TestExecute() {
		this.p = new PlateauAgricole(20,10);
		this.j1 = new JoueurAgricole("player1");
		this.o= new Ouvrier(2);
		for(int x=0;x<this.p.getLargeur();x++){
			for (int y=0;y<this.p.getHauteur();y++) {
				if(!(this.p.getTuile(5, 3) instanceof Ocean)) {
				this.p.getTuile(5, 3).setProprietaire(j1);
				this.p.getTuile(5, 3).setPersonnage(o);
				j1.setNbPersonnage(j1.getNbPersonnage()-1);
				assertEquals(j1,p.getTuile(5, 3).getProprietaire());
				assertEquals(34,j1.getNbPersonnage());
				
				
				}
				
			}
			
			

		}
		
		
		
		

	

		
		
	}

	
}
