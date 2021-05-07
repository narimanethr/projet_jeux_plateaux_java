package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Joueur.JoueurAgricole;
import Joueur.JoueurGuerre;
import actions.Nourir;
import personnages.Armee;
import personnages.Personnage;
import plateaux.PlateauGuerre;
import ressources.agricole.Sable;
import tuiles.Desert;

class TestNourir {


	@Test
	void TestExecute() {
		
		 PlateauGuerre pl = new PlateauGuerre(10,20);
		 JoueurGuerre p1 = new JoueurGuerre("player1");
		Armee a = new Armee(2);
		Nourir n = new Nourir(pl);
		for(int y=0;y<pl.getHauteur();y++){
			for (int x=0;x<pl.getLargeur();x++) {
				
				 int cout= n.coutArmee(pl.getTuile(y, x));
				 if(pl.getTuile(y, x).getProprietaire()==p1 &(pl.getTuile(y, x).getPeresonnage()!=null) ){
				 if(pl.getTuile(y, x).getProprietaire().getUnites()>=cout) {
					 int unitInit = pl.getTuile(y, x).getProprietaire().getUnites();
					 int nbOrInit =pl.getTuile(y, x).getProprietaire().getNbOr();
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
	void TestCoutArmee() {

		PlateauGuerre p2 = new PlateauGuerre(10,20);
		 JoueurGuerre j2 = new JoueurGuerre("player1");
		Armee a2 = new Armee(2);
		Nourir n2 = new Nourir(p2);
		for(int y=0;y<p2.getHauteur();y++){
			for (int x=0;x<p2.getLargeur();x++) {
				if(p2.getTuile(y, x).getPeresonnage()!=null) {
					if (p2.getTuile(y, x) instanceof Desert) {
						int tailleinit = p2.getTuile(y, x).getPeresonnage().getTaille();
						n2.coutArmee(p2.getTuile(y, x));
						int tailleFinal = p2.getTuile(y, x).getPeresonnage().getTaille();
						assertTrue(tailleFinal>tailleinit);
						
						
						
					}
					else {
						int tailleinit = p2.getTuile(y, x).getPeresonnage().getTaille();
						n2.coutArmee(p2.getTuile(y, x));
						int tailleFinal = p2.getTuile(y, x).getPeresonnage().getTaille();
						assertTrue(tailleFinal==tailleinit);
						
					}
				}
				
				
				
			}
		}
		
	

}
}
