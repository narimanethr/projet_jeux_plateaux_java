package actions;
import Joueur.Joueur;
import plateaux.*;


public class RecolterGuerre {
<<<<<<< HEAD
	protected Plateau plateau;
	public RecolterGuerre(Plateau p) {
=======
	protected PlateauGuerre plateau;
	/* create a RecolterGuerre with p a gameBoard 
	 * 
	 */
	public RecolterGuerre(PlateauGuerre p) {
>>>>>>> 98249aed851da14c9ad386fb7adbb90813a63d86
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
