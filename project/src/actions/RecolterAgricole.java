package actions;

import Joueur.JoueurAgricole;
import plateaux.*;

public class RecolterAgricole extends RecolterGuerre implements Action {
	/* create a new RecolterAgricole action  with p the gameBoard
	 * 
	 */

	public RecolterAgricole(Plateau p) {
		super(p);
		
	}
	public void execute(JoueurAgricole j) {
		for(int x=0;x<this.plateau.getLargeur();x++){
			for (int y=0;y<this.plateau.getHauteur();y++) {
				if(this.plateau.getTuile(y, x).hasRessources() && this.plateau.getTuile(y, x).getProprietaire()==j) {
					j.setRessources(this.plateau.getTuile(y, x).getRes().getName());
				}
			}
		}
	}

}
