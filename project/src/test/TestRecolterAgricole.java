package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Joueur.JoueurAgricole;
import actions.RecolterAgricole;
import plateaux.PlateauAgricole;
import ressources.agricole.Roches;
import tuiles.Montagne;
import tuiles.Ocean;

class TestRecolterAgricole {
	private PlateauAgricole p;
	private JoueurAgricole j1;


	@Test
	void TestExecute() {
		this.p = new PlateauAgricole(10,20);
		this.j1 = new JoueurAgricole("j1");
		for(int x=0;x<this.p.getLargeur();x++){
			for (int y=0;y<this.p.getHauteur();y++) {
				if(!(this.p.getTuile(5, 3) instanceof Ocean)) {
					this.p.getTuile(5, 3).setProprietaire(j1);
					assertEquals(j1,this.p.getTuile(5, 3).getProprietaire());
					j1.setRessources(this.p.getTuile(5, 3).getRes());
					assertEquals(j1.getRessources(),this.p.getTuile(5, 3).getRes());
				}
				
				
			}
				
			}
		
	}

}
