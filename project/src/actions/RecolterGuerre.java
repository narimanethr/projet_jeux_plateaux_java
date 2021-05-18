package actions;
import Joueur.JoueurGuerre;
import plateaux.*;
import tuiles.Ocean;


public class RecolterGuerre implements Action{
	protected Plateau plateau;
	/**
	 * modelise l action recolte guerre
	 * @param p plateau ou se deroule l action
	 */
	public RecolterGuerre(Plateau p) {
		this.plateau=p;
		}
	/**
	 * execute l action recolter guerre 
	 * @param j joueur qui execute l action 
	 */
	public void execute(JoueurGuerre j) {
		for(int x=0;x<this.plateau.getLargeur();x++){
			for (int y=0;y<this.plateau.getHauteur();y++) {
				if(this.plateau.getTuile(y, x).getProprietaire()==j & !(this.plateau.getTuile(y, x) instanceof Ocean)) {
					j.addNbOr(this.plateau.getTuile(y, x).getRes().getUnit());
				}
			}
		}
	}

}
