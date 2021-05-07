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
	public DeployerGuerre(Plateau p) {
		this.plateau=p;
		
	}
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
			throw new RangeOutOfCapacityTileException("taille de l'armee est supperieur à la capacité de la tuile ");
		}

	}
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
				if(v<a.getTaille() & t[i].getProprietaire()!=j & !t[i].isFree() & t[i].getPeresonnage()!=null) {
					t[i].getPeresonnage().subTaille(v/2);
				}
				else if(v<1 & t[i].getProprietaire()!=j &!t[i].isFree()) {
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




