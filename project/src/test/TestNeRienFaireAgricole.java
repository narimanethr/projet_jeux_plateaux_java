package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Joueur.Joueur;
import Joueur.JoueurAgricole;
import actions.NeRienFaireAgricole;
import personnages.Armee;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;
import ressources.agricole.Ble;
import ressources.agricole.Roches;
import ressources.agricole.Sable;
import tuiles.Desert;
import tuiles.Montagne;
import tuiles.Ocean;
import tuiles.Tuile;

class TestNeRienFaireAgricole {
	private JoueurAgricole j;
	private PlateauAgricole p;
	private NeRienFaireAgricole a;
	private Tuile t;
	private Roches r ;
	private Ouvrier o;

	@Test
	void TestExecute() {
		this.j = new JoueurAgricole("p1");
		this.p = new PlateauAgricole(10, 20);
		this.a = new NeRienFaireAgricole(p);
		for(int x=0;x<this.p.getLargeur();x++){
			for (int y=0;y<this.p.getHauteur();y++) {
				this.p.getTuile(7, 2).setProprietaire(j);
				if(this.p.getTuile(7, 2).getProprietaire()==j) {
					a.RecoisPieces(j, this.p.getTuile(7, 2));
				}
				
			}
		
	
		
		
		
		
		
		
	}
	}
	@Test
	void  TestRecoisPieces() {
		this.j = new JoueurAgricole("p1");
		this.r = new Roches();
		this.t = new Montagne(r,3,2,2);
		this.o = new Ouvrier(2);
		this.t.setProprietaire(j);
		this.t.setPersonnage(o);
		if (t.getName()=="foret" ||t.getName()=="plaine") {
			j.addNbOr(1);
			assertEquals(16,j.getNbOr());
		}
		else if(t.getName()=="desert" ) {
			j.addNbOr(2);
			assertEquals(17,j.getNbOr());
		}
	
	
	}

}
