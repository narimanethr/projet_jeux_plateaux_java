package actions;

import Joueur.JoueurAgricole;
import plateaux.PlateauAgricole;

public class Remunere implements Action {
	private PlateauAgricole plateau;
	/**
	 * modeliser l action remunere  
	 * @param p plateau du jeux 
	 */
	public Remunere(PlateauAgricole p) {
		this.plateau=p;
	}
	/**
	 * execute l action remunere
	 * @param j joueur qui execute l action 
	 */
	public void execute (JoueurAgricole j) {
		for(int x=0;x<this.plateau.getLargeur();x++){
			for (int y=0;y<this.plateau.getHauteur();y++) {
				if (this.plateau.getTuile(y, x).hasProprietaire()&this.plateau.getTuile(y, x).getProprietaire()==j) {
					int cout =this.plateau.getTuile(y, x).getCout();
					if(this.plateau.getTuile(y, x).getProprietaire().getUnites()>=cout) {
						this.plateau.getTuile(y, x).getProprietaire().subNbOr(cout);
						this.plateau.getTuile(y, x).getPeresonnage().addNbOr(cout);
					}
					else {
						this.plateau.getTuile(y, x).setPersonnage(null);
						this.plateau.getTuile(y, x).setProprietaire(null);
					}
				}
				}
		}
		}
}

