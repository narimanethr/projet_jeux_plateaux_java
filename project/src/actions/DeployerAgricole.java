
package actions;


import Joueur.Joueur;
import exception.NoteFreeTileException;
import personnages.Ouvrier;
import plateaux.Plateau;
import tuiles.*;


public class DeployerAgricole extends DeployerGuerre implements Action{
	public DeployerAgricole(Plateau p) {
		super(p);
	}
	public void execute(Joueur j,int y ,int x, Ouvrier o) throws NoteFreeTileException{
		if ( this.plateau.getTuile(y,x).isFree()) {
			this.plateau.getTuile(y,x).setProprietaire(j);		
	        this.plateau.getTuile(y,x).setPersonnage(o);
	        j.setNbPersonnage(j.getNbPersonnage()-1);
		    }
		else {
			throw new NoteFreeTileException("la tuile n'est pas vide ou de type Ocean");
		}
	}
	
		
	}

