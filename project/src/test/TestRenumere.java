package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Joueur.JoueurAgricole;
import actions.DeployerAgricole;
import actions.RecolterAgricole;
import actions.Remunere;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import personnages.Armee;
import plateaux.PlateauAgricole;

public class TestRenumere {
	private PlateauAgricole p;
	private JoueurAgricole j;
	private Armee a;
	

	@Test
	public void TestExecute() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		PlateauAgricole p = new PlateauAgricole(10,20);
		JoueurAgricole j = new JoueurAgricole("j1");
		Armee a = new Armee(2);
		DeployerAgricole d = new DeployerAgricole(p);
		RecolterAgricole r = new RecolterAgricole(p);
		Remunere re = new Remunere(p);
		for(int y=0;y<p.getHauteur();y++){
			for (int x=0;x<p.getLargeur();x++) {
				if (p.getTuile(y, x).getProprietaire()==j) {
				if(p.getTuile(y, x).getProprietaire().getUnites()>=1) {
						int nbOrInit = p.getTuile(y, x).getProprietaire().getNbOr();
						d.execute(j, y, x, a);
						r.execute(j);
						re.execute(j);
						int nbOrAfter = p.getTuile(y, x).getProprietaire().getNbOr();
						assertTrue(nbOrAfter<nbOrInit);
						
							
						
					}
					else {
						d.execute(j, y, x, a);
						r.execute(j);
						re.execute(j);
						assertEquals(null,p.getTuile(y, x).getProprietaire());
						assertEquals(null,p.getTuile(y, x).getPeresonnage());
						
						
						
					}
					
				}

				
				
			}
		
	}

}
}
