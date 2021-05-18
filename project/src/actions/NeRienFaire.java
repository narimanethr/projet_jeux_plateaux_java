package actions;

import Joueur.JoueurGuerre;
import plateaux.Plateau;

public class NeRienFaire implements Action{
	protected Plateau plateau;
	/**
	 * modelisation de l action ne rien faire
	 * @param p plateau ou se deroule l action 
	 */
	public NeRienFaire(Plateau p) {
		this.plateau=p;
	}
	/**
	 * execute ml action ne rien faire 
	 * @param j joueur qui execute l action 
	 */
	public void execute(JoueurGuerre j) {
		
	}
}
