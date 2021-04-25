package actions;


import Joueur.Joueur;
import exception.NoteFreeTileException;
import personnages.Ouvrier;
import plateaux.Plateau;
import tuiles.*;


public class DeployerAgricole extends DeployerGuerre{
	public DeployerAgricole(Plateau p) {
		super(p);
	}
	void execute(Joueur j,int y ,int x, Ouvrier o){
		if (!(this.plateau.getTuile(y,x) instanceof Ocean)& this.plateau.getTuile(y,x).isFree()) {
			this.plateau.getTuile(y,x).setProprietaire(j);		}
	        this.plateau.getTuile(y,x).setPersonnage(o);
	        j.setNbPersonnage(j.getNbPersonnage()-1);
		}
	
		
	}

