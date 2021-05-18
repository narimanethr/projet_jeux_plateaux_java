package actions;
import Joueur.Joueur;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import personnages.Armee;
import plateaux.*;
import tuiles.*;

public class DeployerGuerre implements Action{
	protected Plateau plateau;
	/** modeliser l action Deploiement agricole 
	 * 
	 * @param p plateau sue lequel on deploie 
	 */
	public DeployerGuerre(Plateau p) {
		this.plateau=p;
		
	}
	/**
	 * execute l'action deploie
	 * @param j joueur qui va deployer
	 * @param y position de la tuile ou en deployer 
	 * @param x position de la tuile ou en deployer 
	 * @param o une Armee a deployer
	 * @throws RangeOutOfCapacityTileException
	 * @throws NoteFreeTileException
	 * @throws StockEmptyException
	 */
	public void execute(Joueur j,int y ,int x, Armee a)throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException{
	
		if( a.getTaille()<=this.plateau.getTuile(y,x).getCapacite()) {
			if(this.plateau.getTuile(y,x).isFree()){
				if(j.getNbPersonnage()>=a.getTaille()){
					this.plateau.getTuile(y,x).setProprietaire(j);		
					this.plateau.getTuile(y,x).setPersonnage(a); 
					j.setNbPersonnage(j.getNbPersonnage()-a.getTaille());
					affectAdj(j,y,x,a);
					
				}
				else {
			
					throw new StockEmptyException("le stock d armee est insuffisant" );
				}
			}
			else {
				
				throw new NoteFreeTileException("la tuile n'est pas vide ou de type Ocean");
			}
		}
		else {
			
			throw new RangeOutOfCapacityTileException("taille de l'armee est supperieur a la capacite de la tuile ");
		}
		
	}
	/**
	 * methode utilser dans execute qui mis en oeuvre les actions qui affect les tuiles adjacentes a la tuile ou on a deployer
	 * @param j joueur qui deploie
	 * @param y position de la tuile ou on deploie 
	 * @param x position de la tuile ou on deploie 
	 * @param a armme a deployer
	 */
	private void affectAdj(Joueur j,int y ,int x,Armee a){ 
		Tuile[] t=new Tuile[4];
		for(int i=0;i<4;i++) {
			t[i]=null;
		}
		if (y<this.plateau.getHauteur()-1 & y>=0) {
			t[0]=this.plateau.getTuile(y+1,x);
		}
		if(y>0 & y<this.plateau.getHauteur()){
			t[1]=this.plateau.getTuile(y-1,x);
		}
		if(x>=0 &x<this.plateau.getLargeur()-1){
			t[3]=this.plateau.getTuile(y,x+1);
		}
		if (x>0 &x<this.plateau.getLargeur()) {
			t[2]=this.plateau.getTuile(y,x-1);
		}
		for(int i=0;i<4;i++) {
			if(t[i]!=null) {
				int v= converTailleTuile(t[i],j);
				if(v<a.getTaille() &  t[i].hasProprietaire() & t[i].getProprietaire()!=j) {
					t[i].getPeresonnage().subTaille(v/2);
				}
				else if(v<1  & t[i].hasProprietaire() & t[i].getProprietaire()!=j) { // type ocean 
					t[i].setProprietaire(j);
					a.addNbOr(2);

				}
				else if(a.getTaille()<v) {
					a.addTaille(1);
					a.addNbOr(1);
				}

			}

		}

	}
	
	/**
	 * methode qui renvoie la taille de la tuile donnee en parametre  a considéree en fonction de son type
	 * @param t tuile
	 * @param j jeueur qui deploie 
	 * @return la taille de la tuile
	 */
	public int converTailleTuile(Tuile t,Joueur j){
		int res=0;
		if(!t.isFree() && t.getPeresonnage()!=null) {
			if (t instanceof Montagne & t.getProprietaire()!=j) {
				res= t.getPeresonnage().getTaille()+2;
			}
			else{

				res= t.getPeresonnage().getTaille();
			}
		}

		return res;
	}

}





