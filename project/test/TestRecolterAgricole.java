
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		PlateauAgricole p = new PlateauAgricole(1,1);
		 JoueurAgricole j1 = new  JoueurAgricole("j1");
		 RecolterAgricole r = new RecolterAgricole(p);
		 DeployerAgricole d= new DeployerAgricole(p);
		 d.execute(j1, 0, 0, o);
		 assertTrue(p.getTuile(0, 0).hasRessources());
		 int nbResInit =j1.getRessources().get(p.getTuile(0, 0).getRes().getName());
		 r.execute(j1);
		 int nbResAfter =j1.getRessources().get(p.getTuile(0, 0).getRes().getName());
		 assertTrue(nbResAfter==nbResInit+1);
				
	}
	@Test
	public void TestExecute2() throws NoteFreeTileException {
		Ouvrier o = new Ouvrier(1);
		PlateauAgricole p2 = new PlateauAgricole(10,10);
		 JoueurAgricole j2 = new  JoueurAgricole("j1");
		 RecolterAgricole r = new RecolterAgricole(p2);
		 DeployerAgricole d= new DeployerAgricole(p2);
		 int NbtotalRes=0;
			 assertTrue(NbtotalRes==0);
			for(int x=0;x<p2.getLargeur();x++){
				for (int y=0;y<p2.getHauteur();y++) {
					if(p2.getTuile(y, x).hasRessources()) {
						 d.execute(j2, y, x, o);
					}
				}
				r.execute(j2);
				Set<String> keys =j2.getRessources().keySet();
				Iterator<String> it =keys.iterator();
				while (it.hasNext()) {
					String res=it.next();
					int v2=j2.getRessources().get(res);
					NbtotalRes+=v2;
				}


			}
			 assertTrue(NbtotalRes>0);
	}
}
