package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Joueur.Joueur;
import Joueur.JoueurAgricole;
import actions.DeployerAgricole;
import exception.NoteFreeTileException;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;
import ressources.agricole.Roches;
import tuiles.Ocean;
class TestDeployerAgricole {

	@Test
	void TestExecute() throws NoteFreeTileException {
		PlateauAgricole p = new PlateauAgricole(20,10);
		JoueurAgricole j1 = new JoueurAgricole("player1");
		Ouvrier o= new Ouvrier(1);
		DeployerAgricole a = new DeployerAgricole(p);
		for(int x=0;x<p.getLargeur();x++){
			for (int y=0;y<p.getHauteur();y++) {
				if(p.getTuile(y, x).isFree() ) {
					int nbrPersonnageinit = j1.getNbPersonnage();
					a.execute(j1, y, x, o);
					int nbrPersonnageAfter = j1.getNbPersonnage();
				assertEquals(j1,p.getTuile(y, x).getProprietaire()); 
				assertTrue(nbrPersonnageAfter<nbrPersonnageinit);		
				}	
			}
		}
	}
	@Test( expected = NoteFreeTileException.class)
	public void TestNoteFreeTileExceptionthrows() throws NoteFreeTileException {
		PlateauAgricole p2 = new PlateauAgricole(20,10);
		JoueurAgricole j2 = new JoueurAgricole("player1");
		Ouvrier o2= new Ouvrier(1);
		DeployerAgricole a2 = new DeployerAgricole(p2);
		for(int y=0;y<p2.getHauteur();y++){
			for (int x=0;x<p2.getLargeur();x++) {
				if(!(p2.getTuile(y, x).isFree())) {
					a2.execute(j2, 0, 0, o2);
				}
			}
		}
	}
		
		
		
		

	

		
		
	

	
}
