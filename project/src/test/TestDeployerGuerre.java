package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Joueur.JoueurAgricole;
import Joueur.JoueurGuerre;
import actions.DeployerAgricole;
import actions.DeployerGuerre;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import personnages.Armee;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;
import plateaux.PlateauGuerre;
import ressources.agricole.Roches;
import tuiles.Montagne;
import tuiles.Ocean;
import tuiles.Tuile;

class TestDeployerGuerre {
	
	@Test
	void TestExecute() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		PlateauGuerre p = new PlateauGuerre(1,1);
		JoueurGuerre j1 = new JoueurGuerre("player1");
		 DeployerGuerre d = new  DeployerGuerre(p);
		 Armee a = new Armee(1);
		for(int y=0;y<p.getHauteur();y++){
			for (int x=0;x<p.getLargeur();x++) {
					if( p.getTuile(y, x).getPeresonnage().getTaille()<=p.getTuile(y,x).getCapacite()) {
						if(p.getTuile(y,x).isFree()){
							if(j1.getNbPersonnage()>=p.getTuile(y, x).getPeresonnage().getTaille()){
								int nbrPersonneInit = j1.getNbPersonnage();
								d.execute(j1, y, x, a);
								int nbrPersonneAfter = j1.getNbPersonnage();
								assertEquals(a,p.getTuile(y, x).getPeresonnage());
								assertEquals(j1,p.getTuile(y, x).getProprietaire());
								assertTrue( nbrPersonneAfter==nbrPersonneInit-a.getTaille());
							}
					
				}
				
				

			}
				}
			}
				
					
				
				
	}
		
		
		
		
		
		
		

	

		
		
	
	@Test
	void TestConverTailleTuile() {
		PlateauGuerre p2 = new PlateauGuerre(1,1);
		JoueurGuerre j2 = new JoueurGuerre("player1");
		 DeployerGuerre d2 = new  DeployerGuerre(p2);
		
		for(int y=0;y<p2.getHauteur();y++){
			for (int x=0;x<p2.getLargeur();x++) {
				if(p2.getTuile(y, x).isFree() && p2.getTuile(y, x).getPeresonnage()!=null) {
					if (p2.getTuile(y, x) instanceof Montagne & p2.getTuile(y, x).getProprietaire()!=j2) {
						int tailleInit = p2.getTuile(y, x).getPeresonnage().getTaille();
						d2.converTailleTuile(p2.getTuile(y, x),j2);
						int tailleAfter = p2.getTuile(y, x).getPeresonnage().getTaille();
						assertTrue(tailleAfter>tailleInit);
						
						
						
						
						
					}
					else{
						int tailleInit = p2.getTuile(y, x).getPeresonnage().getTaille();
						d2.converTailleTuile(p2.getTuile(y, x),j2);
						int tailleAfter = p2.getTuile(y, x).getPeresonnage().getTaille();
						assertTrue(tailleAfter==tailleInit);

						
				}

				
			}
				
			}
			
			

		}
		
		
	}


}
