package actions;

import Joueur.JoueurGuerre;
import plateaux.Plateau;

public class NeRienFaire implements Action{
	protected Plateau plateau;
	public NeRienFaire(Plateau p) {
		this.plateau=p;
	}
	public void execute(JoueurGuerre j) {
		
	}
}
