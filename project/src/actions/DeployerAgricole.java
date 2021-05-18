
package actions;


import Joueur.Joueur;
import exception.NoteFreeTileException;
import personnages.Ouvrier;
import plateaux.Plateau;
import tuiles.*;


public class DeployerAgricole extends DeployerGuerre implements Action{
	/** modeliser l action Deploiement agricole 
	 * 
	 * @param p plateau sue lequel on deploie 
	 */
	public DeployerAgricole(Plateau p) {
		super(p); 
	}
	/**
	 * execute l'action deploie
	 * @param j joueur qui va deployer
	 * @param y position de la tuile ou en deployer 
	 * @param x position de la tuile ou en deployer 
	 * @param o un ouvrier a deployer
	 * @throws NoteFreeTileException
	 */
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

