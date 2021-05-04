package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Joueur.JoueurAgricole;
import personnages.Armee;
import plateaux.PlateauAgricole;

class TestRenumere {
	private PlateauAgricole p;
	private JoueurAgricole j;
	private Armee a;
	

	@Test
	void TestExecute() {
		this.p = new PlateauAgricole(10,20);
		this.j = new JoueurAgricole("j1");
		this.a = new Armee(2);
		for(int x=0;x<this.p.getLargeur();x++){
			for (int y=0;y<this.p.getHauteur();y++) {
				this.p.getTuile(6, 3).setProprietaire(j);
				this.p.getTuile(6, 3).setPersonnage(a);
				if(this.p.getTuile(6, 3).getProprietaire().getUnites()>=1) {
					this.p.getTuile(6, 3).getProprietaire().subNbOr(1);
					assertEquals(14,j.getNbOr());
					this.p.getTuile(6, 3).getPeresonnage().addNbOr(1);
					assertEquals(1,p.getTuile(6, 3).getPeresonnage().getNbOr());
					
					
					
				}
				else {
					this.p.getTuile(6, 3).setPersonnage(null);
					this.p.getTuile(6, 3).setProprietaire(null);
					assertEquals(null,p.getTuile(6, 3).getPeresonnage());
					assertEquals(null,p.getTuile(6,3).getProprietaire());
					
				}
				
			}
		
	}

}
}
