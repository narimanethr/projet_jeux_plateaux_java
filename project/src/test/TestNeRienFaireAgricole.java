package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Joueur.Joueur;
import Joueur.JoueurAgricole;
import actions.NeRienFaireAgricole;
import personnages.Armee;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;
import ressources.agricole.Ble;
import ressources.agricole.Roches;
import ressources.agricole.Sable;
import tuiles.Desert;
import tuiles.Montagne;
import tuiles.Ocean;
import tuiles.Tuile;

class TestNeRienFaireAgricole {
	
	@Test
	void TestExecute() {
		 JoueurAgricole j = new JoueurAgricole("p1");
		 PlateauAgricole  p = new PlateauAgricole(10, 20);
		 NeRienFaireAgricole a = new NeRienFaireAgricole(p);
		for(int y=0;y<p.getHauteur();y++){
			for (int x=0;x<p.getLargeur();x++) {
				if(p.getTuile(y, x).getProprietaire()==j) {
					int nbrOrinit = p.getTuile(y, x).getProprietaire().getNbOr();
					a.execute(j);
					int nbrOrAfter = p.getTuile(y, x).getProprietaire().getNbOr();
					assertTrue(nbrOrAfter>nbrOrinit);
					
					
				}
				
			
				
			}
		}
	}
	
		
	
		
		
		
		
		
		
	
	@Test
	void  TestRecoisPieces() {
		JoueurAgricole j2 = new JoueurAgricole("p2");
		PlateauAgricole  p2 = new PlateauAgricole(1, 1);
		 NeRienFaireAgricole a = new NeRienFaireAgricole(p2);
		for(int y=0;y<p2.getHauteur();y++){
			for (int x=0;x<p2.getHauteur();x++) {
				if (p2.getTuile(y, x).getName()=="foret" ||p2.getTuile(y, x).getName()=="plaine") {
					j2.addNbOr(1);
					assertEquals(16,j2.getNbOr());
				}
				else if(p2.getTuile(y, x).getName()=="desert" ) {
					j2.addNbOr(2);
					assertEquals(17,j2.getNbOr());
				}
			}
		}
	}
}
		
		
		
	
	
	

		
		
