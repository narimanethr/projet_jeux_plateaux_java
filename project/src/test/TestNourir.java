package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Joueur.JoueurAgricole;
import Joueur.JoueurGuerre;
import actions.DeployerGuerre;
import actions.Nourir;
import actions.RecolterGuerre;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import personnages.Armee;
import personnages.Personnage;
import plateaux.PlateauGuerre;
import ressources.agricole.Sable;
import tuiles.Desert;

public class TestNourir {


	@Test
	public void TestExecute1() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {

		PlateauGuerre p3 = new PlateauGuerre(4,2);
		JoueurGuerre j3 = new JoueurGuerre("player1");
		Armee a3 = new Armee(1);
		Nourir n = new Nourir(p3);
		DeployerGuerre d = new DeployerGuerre(p3);
		RecolterGuerre r = new RecolterGuerre(p3);
		for(int y=0;y<p3.getHauteur();y++){
			for (int x=0;x<p3.getLargeur();x++) {
				if(p3.getTuile(y, x).isFree()&p3.getTuile(y, x).hasProprietaire()){
					d.execute(j3, y, x, a3);
					r.execute(j3);
					int nbOrPersInit=p3.getTuile(y, x).getPeresonnage().getNbOr();
					assertTrue(nbOrPersInit==0);
					n.execute(j3);
					int nbOrPersAfter=p3.getTuile(y, x).getPeresonnage().getNbOr();
					assertTrue(nbOrPersAfter==nbOrPersInit+n.coutArmee(p3.getTuile(y, x)));
				}
			}
		}
	}

	@Test // a refaire
	public void TestCoutArmee() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {

		PlateauGuerre p2 = new PlateauGuerre(10,20);
		 JoueurGuerre j2 = new JoueurGuerre("player1");
		Armee a2 = new Armee(2);
		Nourir n2 = new Nourir(p2);
		DeployerGuerre a3 = new DeployerGuerre(p2);
		RecolterGuerre r = new RecolterGuerre(p2);
		for(int y=0;y<p2.getHauteur();y++){
			for (int x=0;x<p2.getLargeur();x++) {
				if(p2.getTuile(y, x).getPeresonnage()!=null) {
					if (p2.getTuile(y, x) instanceof Desert) {
						int tailleinit = p2.getTuile(y, x).getPeresonnage().getTaille();
						a3.execute(j2, y, x, a2);
						r.execute(j2);
						n2.execute(j2);
						n2.coutArmee(p2.getTuile(y, x));
						int tailleFinal = p2.getTuile(y, x).getPeresonnage().getTaille();
						assertTrue(tailleFinal>tailleinit);
						
						
					}
					else {
						a3.execute(j2, y, x, a2);
						r.execute(j2);
						int tailleinit = p2.getTuile(y, x).getPeresonnage().getTaille();
						n2.execute(j2);
						n2.coutArmee(p2.getTuile(y, x));
						int tailleFinal = p2.getTuile(y, x).getPeresonnage().getTaille();
						assertTrue(tailleFinal==tailleinit);
						
					}
				}
				
				
				
			}
		}
		
		
	

}
	
}
