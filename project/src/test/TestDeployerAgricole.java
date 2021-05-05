package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Joueur.Joueur;
import Joueur.JoueurAgricole;
import actions.DeployerAgricole;
import exception.NoteFreeTileException;
import image.Image;
import image.UnknownPixelException;
import image.color.GrayColor;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;
import ressources.agricole.Roches;
import tuiles.Ocean;

class TestDeployerAgricole {
	private PlateauAgricole p;
	private Ouvrier o;
	private JoueurAgricole j1;
	private DeployerAgricole a;
	private Ocean o1;
	

	@Test
	void TestExecute() throws NoteFreeTileException {
		this.p = new PlateauAgricole(20,10);
		this.j1 = new JoueurAgricole("player1");
		this.o= new Ouvrier(2);
		this.a = new DeployerAgricole(p);
		for(int x=0;x<this.p.getLargeur();x++){
			for (int y=0;y<this.p.getHauteur();y++) {
				if(!(this.p.getTuile(5, 3) instanceof Ocean)) {
					this.a.execute(j1, 5, 3, o);
				assertEquals(j1,p.getTuile(5, 3).getProprietaire());
				assertEquals(34,j1.getNbPersonnage());
				
				
				}
			
				
				
			}
			
			
			

		}
	}
		@Test
		public void TestNoteFreeTileExceptionthrows() throws NoteFreeTileException {
			this.p = new PlateauAgricole(20,10);
			this.j1 = new JoueurAgricole("player1");
			this.o= new Ouvrier(2);
			this.a = new DeployerAgricole(p);
			this.a.execute(j1, 1, 1, o);
			
			
			
			
		}
		
		
		
		

	

		
		
	

	
}
