
import static org.junit.Assert.*;

import org.junit.Test;

import Joueur.JoueurAgricole;
import actions.DeployerAgricole;
import actions.EchangeRessources;
import actions.RecolterAgricole;
import exception.NoteFreeTileException;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;

public class TestEchangeRessources {

	@Test
	public void TestExecute() throws NoteFreeTileException{
		PlateauAgricole p = new PlateauAgricole(20,10);
		JoueurAgricole j1 = new JoueurAgricole("player1");
		Ouvrier o= new Ouvrier(1);
		DeployerAgricole a = new DeployerAgricole(p);
		RecolterAgricole rectAG= new RecolterAgricole(p);
		EchangeRessources e =new EchangeRessources(p);
		for(int x=0;x<p.getLargeur();x++){
			for (int y=0;y<p.getHauteur();y++) {
				assertEquals(null,p.getTuile(y, x).getProprietaire()); // pr�condition 
				if(p.getTuile(y, x).isFree() ) {
					int nbrPersonnageinit = j1.getNbPersonnage();
					a.execute(j1, y, x, o);
					int nbrPersonnageAfter = j1.getNbPersonnage();
					assertEquals(j1,p.getTuile(y, x).getProprietaire()); 
					assertTrue(nbrPersonnageAfter<nbrPersonnageinit);
					rectAG.execute(j1);
				}	
			}
		}
		int nbrOrinit=j1.getNbOr();
		e.execute(j1);
		int nbrOriAfter=j1.getNbOr();
		assertTrue(nbrOriAfter > nbrOrinit);
	}

}
