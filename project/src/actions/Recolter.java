package actions;
import Joueur.Joueur;
import plateaux.PlateauGuerre;

public class Recolter {
	protected PlateauGuerre plateau;
	public Recolter(PlateauGuerre p) {
		this.plateau=p;
		}
	public void execute(Joueur j) {
		for(int x=0;x<this.plateau.getLargeur();x++){
			for (int y=0;y<this.plateau.getHauteur();y++) {
				j.addUnites(this.plateau.getTuile(y, x).getRes().getUnit());
			}
		}
	}

}
