package actions;


import Joueur.Joueur;
import exception.NoteFreeTileException;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;
import tuiles.*;


public class DeployerAgricole {
	protected PlateauAgricole plateau;
	public DeployerAgricole(PlateauAgricole p) {
		this.plateau=p;
	}
	void execute(Joueur j,int y ,int x, Ouvrier o){
		if (!(this.plateau.getTuile(y,x) instanceof Ocean)& this.plateau.getTuile(y,x).isFree()) {
			this.plateau.getTuile(y,x).setProprietaire(j);		}
	        this.plateau.getTuile(y,x).setPersonnage(o);
	        j.setNbPersonnage(j.getNbPersonnage()-1);
		}
	
		
	}

