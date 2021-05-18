package actions;

import Joueur.JoueurGuerre;
import plateaux.PlateauGuerre;
import tuiles.*;

public class Nourir implements Action {
	protected PlateauGuerre plateau;
	/**
	 * modeliser l action nourrir  
	 * @param p plateau du jeux 
	 */
	public Nourir(PlateauGuerre p) {
		this.plateau=p;
	}
	/**
	 * execute l action Nourir pour nouir ses armees
	 * @param j joueur qui execute l action 
	 */
	public void execute (JoueurGuerre j) {
		for(int x=0;x<this.plateau.getLargeur();x++){
			for (int y=0;y<this.plateau.getHauteur();y++) {
				if(this.plateau.getTuile(y, x).hasProprietaire() &this.plateau.getTuile(y, x).getProprietaire()==j){ 
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
	/**
	 * renvoie le cout d une armee en fonction de type de la tuile ou elle se situe
	 * @param t tuile
	 * @return cout
	 */
	public int coutArmee(Tuile t) {
		int res=0;
		if(t.getPeresonnage()!=null) {
			if (t instanceof Desert) {
				res=t.getPeresonnage().getTaille()*2;
			}
			else {
				res=t.getPeresonnage().getTaille();
			}
		}
		
		return res;
	}

}




