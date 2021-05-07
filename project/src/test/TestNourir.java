package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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

class TestNourir {


	@Test
	void TestExecute() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		
		 PlateauGuerre pl = new PlateauGuerre(10,20);
		 JoueurGuerre p1 = new JoueurGuerre("player1");
		Armee a = new Armee(2);
		Nourir n = new Nourir(pl);
		DeployerGuerre d = new DeployerGuerre(pl);
		RecolterGuerre re = new RecolterGuerre(pl);
		for(int y=0;y<pl.getHauteur();y++){
			for (int x=0;x<pl.getLargeur();x++) {
				
				 int cout= n.coutArmee(pl.getTuile(y, x));
				 if(pl.getTuile(y, x).getProprietaire()==p1 &(pl.getTuile(y, x).getPeresonnage()!=null) ){
				 if(pl.getTuile(y, x).getProprietaire().getUnites()>=cout) {
					 int unitInit = pl.getTuile(y, x).getProprietaire().getUnites();
					 int nbOrInit =pl.getTuile(y, x).getProprietaire().getNbOr();
					 d.execute(p1, y, x, a);
					 re.execute(p1);
					 n.execute(p1);
					 int unitAfter = pl.getTuile(y, x).getProprietaire().getUnites();
					 int nbOrAfter =pl.getTuile(y, x).getProprietaire().getNbOr();
					 assertTrue(unitAfter<unitInit);
					 assertTrue(nbOrAfter >nbOrInit);
					 
				 }else {
					 int unitInit = pl.getTuile(y, x).getProprietaire().getUnites();
					 n.execute(p1);
					 int unitAfter = pl.getTuile(y, x).getProprietaire().getUnites();
					 assertTrue(unitAfter>unitInit);
					 assertEquals(null, pl.getTuile(y, x).getProprietaire());
					 assertTrue(pl.getTuile(y, x).getPeresonnage()==null);
				
					 

					 
					 
				 }
				 }
				
				 
				
				
				
				
			}

		
	
		
	}
	}

	@Test
	void TestCoutArmee() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {

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
