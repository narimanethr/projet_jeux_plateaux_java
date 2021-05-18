


import static org.junit.Assert.*;

import org.junit.Test;

import Joueur.Joueur;
import Joueur.JoueurAgricole;
import actions.DeployerAgricole;
import actions.NeRienFaireAgricole;
import exception.NoteFreeTileException;
import personnages.Armee;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;
import ressources.agricole.Ble;
import ressources.agricole.Roches;
import ressources.agricole.Sable;
import tuiles.Desert;
import tuiles.Foret;
import tuiles.Montagne;
import tuiles.Ocean;
import tuiles.Plaine;
import tuiles.Tuile;

public class TestNeRienFaireAgricole {
	@Test
	public void TestExecute() {
		JoueurAgricole j = new JoueurAgricole("p1");
		PlateauAgricole  p = new PlateauAgricole(10, 20);
		NeRienFaireAgricole a = new NeRienFaireAgricole(p);
		int nbOrInit = j.getNbOr();
		a.execute(j);
		int nbOrAfter = j.getNbOr();
		assertTrue(nbOrInit==nbOrAfter);
		

	}
	@Test
	public void TestExecute2() throws NoteFreeTileException {
		JoueurAgricole j = new JoueurAgricole("p1");
		PlateauAgricole  p = new PlateauAgricole(10, 20);
		NeRienFaireAgricole a = new NeRienFaireAgricole(p);
		DeployerAgricole d = new DeployerAgricole(p);
		Ouvrier o = new Ouvrier(1);
		int nbOrInit = j.getNbOr();
		for(int x=0;x<p.getLargeur();x++){
			for (int y=0;y<p.getHauteur();y++) {
				if(p.getTuile(y, x).isFree() ) {
					d.execute(j, y, x, o);	
					if(p.getTuile(y, x) instanceof Desert  ) {
						nbOrInit+=2;
					}
					else if (p.getTuile(y, x) instanceof Plaine || p.getTuile(y, x) instanceof Foret  ) {
						nbOrInit+=1;
						
					}
				}
			}
		}
		a.execute(j);
		int nbOrAfter = j.getNbOr();
		assertTrue(nbOrInit==nbOrAfter);
		
	}
	
	
	@Test
	public void  TestRecoisPieces() {
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
		
		
		
	
	
	

		
		
