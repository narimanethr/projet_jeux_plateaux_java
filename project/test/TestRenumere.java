
import static org.junit.Assert.*;

import org.junit.Test;

import Joueur.JoueurAgricole;
import actions.DeployerAgricole;
import actions.RecolterAgricole;
import actions.Remunere;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;

public class TestRenumere {

	@Test
	public void TestExecute() throws NoteFreeTileException{
		PlateauAgricole p = new PlateauAgricole(5,5);
		JoueurAgricole j = new JoueurAgricole("j1");
		Ouvrier o = new Ouvrier(1);
		DeployerAgricole d = new DeployerAgricole(p);
		RecolterAgricole r = new RecolterAgricole(p);
		Remunere re = new Remunere(p);
		int nbOr = j.getNbOr();
		assertTrue(nbOr==15);
		for(int y=0;y<p.getHauteur();y++){
			for (int x=0;x<p.getLargeur();x++) {
				if(p.getTuile(y, x).hasRessources()) {
					d.execute(j, y, x, o);
				}
			}
		}
		r.execute(j);
		re.execute(j);
		 nbOr = j.getNbOr();
		assertTrue(nbOr<15);
		
		
	}
}
