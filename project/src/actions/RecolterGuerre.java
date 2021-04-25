package actions;
import Joueur.Joueur;
import plateaux.*;


public class RecolterGuerre {
	protected Plateau plateau;
	
	public RecolterGuerre(Plateau p) {
		this.plateau=p;
		}
	public void execute(Joueur j) {
		for(int x=0;x<this.plateau.getLargeur();x++){
			for (int y=0;y<this.plateau.getHauteur();y++) {
				if(this.plateau.getTuile(y, x).getProprietaire()==j) {
					j.addUnites(this.plateau.getTuile(y, x).getRes().getUnit());
				}
			}
		}
	}

}
