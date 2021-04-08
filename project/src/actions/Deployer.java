package actions;
import Joueur.Joueur;
import personnages.Armee;
import plateaux.PlateauGuerre;
import tuiles.*;

public class Deployer {
	protected PlateauGuerre plateau;
	protected Joueur joueur;
	protected Armee armee;
	protected boolean choixDep=true;
	protected int [] position=new int[2];
	public Deployer(PlateauGuerre p,int y,int x, Joueur j, Armee a,boolean c) {
		this.armee=a;
		this.joueur=j;
		this.plateau=p;
		this.position[0]=y;
		this.position[1]=x;
		this.choixDep=c;
		
		if(!this.choixDep) {
			if( !(this.plateau.getTuile(y,x) instanceof Ocean)& this.plateau.getTuile(y,x).isFree() & this.plateau.getTuile(y,x).getCapacite()) {
				this.armee.setPosition(y, x);
			}
		}
		
	}

}
