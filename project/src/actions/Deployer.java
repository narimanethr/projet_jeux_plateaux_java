package actions;
import Joueur.Joueur;
import personnages.Armee;
import plateaux.PlateauGuerre;
import tuiles.*;

public class Deployer {
	protected PlateauGuerre plateau;
	protected Joueur joueur;
	protected Armee armee;
	protected int [] position=new int[2];
	public Deployer(PlateauGuerre p,int y,int x, Armee a) {
		this.armee=a;
		this.plateau=p;
		this.position[0]=y;
		this.position[1]=x;
		
	}
	void execute(Joueur j){
		int y=this.position[0];
		int x=this.position[1];
		if( !(this.plateau.getTuile(y,x) instanceof Ocean)& this.plateau.getTuile(y,x).isFree() &this.armee.getTaille()<=this.plateau.getTuile(y,x).getCapacite()){
			this.armee.setPosition(y, x);
			
		}
		
	}
	void affectAdj(){
		int y=this.position[0];
		int x=this.position[1];
		Tuile[] t=new Tuile[4];
		t[0]=this.plateau.getTuile(y+1,x);
		t[1]=this.plateau.getTuile(y+1,x);
		t[2]=this.plateau.getTuile(y,x-1);
		t[3]=this.plateau.getTuile(y,x+1);
		for(int i=0;i<4;i++) {
			if()
		}
		
	}

}




