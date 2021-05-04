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
	private Armee a;
	private JoueurGuerre p1;
	private PlateauGuerre pl;
	private int cout ;
	private Nourir n;
	private Sable s;
	private Desert d;

	@Test
	void TestExecute() {
		int cout = 0;
		this.pl = new PlateauGuerre(10,20);
		this.p1 = new JoueurGuerre("player1");
		this.a = new Armee(2);
		this.n = new Nourir(pl);
		for(int x=0;x<this.pl.getLargeur();x++){
			for (int y=0;y<this.pl.getHauteur();y++) {
				this.pl.getTuile(5, 5).setProprietaire(p1);
				this.pl.getTuile(5, 5).setPersonnage(a);
				 cout= n.coutArmee(this.pl.getTuile(5, 5));
				 if(this.pl.getTuile(5, 5).getProprietaire().getUnites()>=cout){
						this.pl.getTuile(5, 5).getProprietaire().subUnites(cout);
						this.pl.getTuile(5, 5).getPeresonnage().addNbOr(cout);
						assertEquals(cout,this.pl.getTuile(5, 5).getPeresonnage().getNbOr());
					}
					else {
						this.pl.getTuile(5, 5).setPersonnage(null);
						assertEquals(null,this.pl.getTuile(5, 5).getPeresonnage());
						this.pl.getTuile(5, 5).getProprietaire().addUnites(1);
						assertEquals(11,this.pl.getTuile(5, 5).getProprietaire().getUnites());
						this.pl.getTuile(5, 5).setProprietaire(null);
						assertEquals(null,this.pl.getTuile(5, 5).getProprietaire());
						
					}
				
				
				
			}

		
	
		
	}
	}

	@Test
	void TestCoutArmee() {
		int res = 0;
		this.s = new Sable();
		this.d= new Desert (s,3,2,1);
		this.a = new Armee(2);
		this.p1= new JoueurGuerre("player1");
		this.d.setPersonnage(a);
		this.d.setProprietaire(p1);
		res = this.d.getPeresonnage().getTaille()*2;
		assertEquals(4,res);
		
		
	}

}
