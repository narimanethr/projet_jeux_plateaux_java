package actions;
import Joueur.JoueurGuerre;
import plateaux.*;
import tuiles.Ocean;


public class RecolterGuerre implements Action{
	protected Plateau plateau;
	
	public RecolterGuerre(Plateau p) {
		this.plateau=p;
		}
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
