package actions;

import Joueur.Joueur;
import plateaux.PlateauGuerre;
import tuiles.*;

public class Nourir {
	protected PlateauGuerre plateau;
	/* create a new Nourir with p the gameBoard
	 * 
	 */
	public Nourir(PlateauGuerre p) {
		this.plateau=p;
	}
	public void execute (Joueur j) {
		for(int x=0;x<this.plateau.getLargeur();x++){
			for (int y=0;y<this.plateau.getHauteur();y++) {
				if(this.plateau.getTuile(y, x).getProprietaire()==j) {
					int cout=coutArmee(this.plateau.getTuile(y, x));
					if(this.plateau.getTuile(y, x).getProprietaire().getUnites()>=cout){
						this.plateau.getTuile(y, x).getProprietaire().subUnites(cout);
						this.plateau.getTuile(y, x).getPeresonnage().addNbOr(cout);
					}
					else {
						this.plateau.getTuile(y, x).setPersonnage(null);
						this.plateau.getTuile(y, x).getProprietaire().addUnites(1);
						this.plateau.getTuile(y, x).setProprietaire(null);
						
					}
					
				}
			}
		}
		
	}
	int coutArmee(Tuile t) {
		int res;
		if (t instanceof Desert) {
			res=t.getPeresonnage().getTaille()*2;
		}
		else {
			res=t.getPeresonnage().getTaille();
		}
		return res;
	}

}




