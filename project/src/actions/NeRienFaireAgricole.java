package actions;

import Joueur.Joueur;
import plateaux.Plateau;
import tuiles.Tuile;

public class NeRienFaireAgricole extends NeRienFaire implements Action {
	/**
	 * modelise l action ne rien faire agricole 
	 * @param p plateau ou se deroule l action 
	 */
	public NeRienFaireAgricole(Plateau p) {
		super(p);
	
	}
	/**
	 * execute l action ne rien faire 
	 * @param j joueur qui execute l action 
	 */
	public void execute(Joueur j) {
		for(int x=0;x<this.plateau.getLargeur();x++){
			for (int y=0;y<this.plateau.getHauteur();y++) {
				if(this.plateau.getTuile(y, x).hasProprietaire()&this.plateau.getTuile(y, x).getProprietaire()==j) {
					RecoisPieces(j, this.plateau.getTuile(y, x));
				}
			}
		}
			
		} 
	/**
	 * permet au joueur de recevoir l or en fonction de type de tuile ou il se situe le joueur 
	 * @param j joueur qui va recevoir l or 
	 * @param t tuile ou il se situe
	 */
	public void RecoisPieces(Joueur j, Tuile t) {
		if (t.getName()=="foret" ||t.getName()=="plaine") {
			j.addNbOr(1);
		}
		else if(t.getName()=="desert" ) {
			j.addNbOr(2);
		}
	}
	

}
