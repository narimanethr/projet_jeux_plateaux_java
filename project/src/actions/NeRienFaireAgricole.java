package actions;

import Joueur.Joueur;
import plateaux.Plateau;
import tuiles.Tuile;

public class NeRienFaireAgricole extends NeRienFaire implements Action {
	/* create a new NeRienFaireAgricole action  with p the gameBoard
	 * @param p Plateau , the gameBoard
	 * 
	 */

	public NeRienFaireAgricole(Plateau p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	public void execute(Joueur j) {
		for(int x=0;x<this.plateau.getLargeur();x++){
			for (int y=0;y<this.plateau.getHauteur();y++) {
				if(this.plateau.getTuile(y, x).hasProprietaire()&this.plateau.getTuile(y, x).getProprietaire()==j) {
					RecoisPieces(j, this.plateau.getTuile(y, x));
				}
			}
		}
			
		} 
	/* add's nbOr to the player j , according to the type of tile t
	 * @param j Joueur , the player that receive nbor
	 * @param t Tuile , the tile 
	 * 
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
