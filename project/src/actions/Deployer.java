package actions;
import Joueur.Joueur;
import personnages.Armee;
import plateaux.PlateauGuerre;
import tuiles.*;

public class Deployer {
	protected PlateauGuerre plateau;
	public Deployer(PlateauGuerre p) {
		this.plateau=p;
		
	}
	void execute(Joueur j,int y ,int x, Armee a){
		if(!(this.plateau.getTuile(y,x) instanceof Ocean)& this.plateau.getTuile(y,x).isFree()
				& a.getTaille()<=this.plateau.getTuile(y,x).getCapacite() &j.getNbPersonnage()>=a.getTaille()) {
			this.plateau.getTuile(y,x).setProprietaire(j);		}
		    this.plateau.getTuile(y,x).setNbperesonnages(a.getTaille());
		    j.setNbPersonnage(j.getNbPersonnage()-a.getTaille());
		    affectAdj(j,y,x,a);
	}
	void affectAdj(Joueur j,int y ,int x,Armee a){ 
		Tuile[] t=new Tuile[4];
		for(int i=0;i<4;i++) {
			t[i]=null;
			}
		if (y<this.plateau.getHauteur()-1) {
			t[0]=this.plateau.getTuile(y+1,x);
		}
		if(y>0& (this.plateau.getTuile(y-1,x).getProprietaire())!=j) {
			t[1]=this.plateau.getTuile(y-1,x);
		}
		if(x<this.plateau.getLargeur()-1){
			t[3]=this.plateau.getTuile(y,x+1);
		}
		if (x>0) {
			t[2]=this.plateau.getTuile(y,x-1);
		}
		for(int i=0;i<4;i++) {
			int v= t[i].getNbperesonnages();
			if(v<a.getTaille() & t[i].getProprietaire()!=j) {
				t[i].setNbperesonnages(v/2);
			}
			else if(v<1 & t[i].getProprietaire()!=j) {
				t[i].setProprietaire(j);
				a.setNbOr(2);
				
			}
			else if(a.getTaille()<v) {
				a.addTaille(1);
				a.setNbOr(1);
			}
			}
		
	}

}




