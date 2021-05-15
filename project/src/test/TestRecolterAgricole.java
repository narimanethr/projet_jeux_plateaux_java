package test;

import static org.junit.Assert.*;
import java.util.Map;

import org.junit.Test;

import Joueur.JoueurAgricole;
import actions.DeployerAgricole;
import actions.DeployerGuerre;
import actions.RecolterAgricole;
import actions.RecolterGuerre;
import exception.NoteFreeTileException;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;
import ressources.agricole.RessourceAgricole;
import ressources.agricole.Roches;
import tuiles.Montagne;
import tuiles.Ocean;

public class TestRecolterAgricole {
	


	@Test
	public void TestExecute() throws NoteFreeTileException {
		Ouvrier o = new Ouvrier(1);
		PlateauAgricole p = new PlateauAgricole(5,10);
		 JoueurAgricole j1 = new  JoueurAgricole("j1");
		 RecolterAgricole r = new RecolterAgricole(p);
		 DeployerAgricole d= new DeployerAgricole(p);
		 for(int y=0;y<p.getHauteur();y++){
				for (int x=0;y<p.getLargeur();x++) {
					if(p.getTuile(y, x).getProprietaire()==j1) {
						int  Resinit = j1.getRessources().size();
						d.execute(j1, y, x, o);
						r.execute(j1);
						int ResAfter = j1.getRessources().size();
						assertTrue( ResAfter> Resinit );
					
					}
				}
			}			
	}

}
