package actions;

import Joueur.JoueurGuerre;
import plateaux.Plateau;

public class NeRienFaire implements Action{
	protected Plateau plateau;
	/* create a new NeRienFaire action  with p the gameBoard
	 * @param p Plateau ,the gameBoard
	 * 
	 */
	public NeRienFaire(Plateau p) {
		this.plateau=p;
	}
	public void execute(JoueurGuerre j) {
		
	}
}
