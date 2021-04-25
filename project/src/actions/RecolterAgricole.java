package actions;

import Joueur.Joueur;
import plateaux.*;

public class RecolterAgricole extends RecolterGuerre {

	public RecolterAgricole(Plateau p) {
		super(p);
		
	}
	public void execute(Joueur j) {
		for(int x=0;x<this.plateau.getLargeur();x++){
			for (int y=0;y<this.plateau.getHauteur();y++) {
				if(this.plateau.getTuile(y, x).getProprietaire()==j) {
					j.setRessources(this.plateau.getTuile(y, x).getRes());
				}
			}
		}
	}

}
