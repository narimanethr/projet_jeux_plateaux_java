package plateaux;

import java.util.Random;
import ressources.guerre.*;
import Joueur.JoueurGuerre;
import tuiles.*;



public class PlateauGuerre extends Plateau{


	public PlateauGuerre(int l, int h) {
		super(l, h);
		
	}
	/**
	 * return a random tile
	 * @param y a position
	 * @param x a position
	 * @return  Tuile 
	 */
	public Tuile getTuileAleatoire(int y,int x){
		Random r = new Random();
		int t=r.nextInt(4);
		 switch(t) {
			case 0: return new Plaine(new Ble(),5,y,x);
			case 1: return new Montagne(new Roches(),3,y,x);
	        case 2: return new Foret(new Bois(),3,y,x);
	        case 3: return new Desert(new Sable(),5,y,x);
	        
		 }
		
		return null;
	}
	public boolean AllTileNotFree() {
		boolean res =true;
		for (int i=0;i<this.hauteur;i++) {
			for (int j=0; j<this.largeur;j++) {
				if(this.getTuile(i, j).isFree()){
					res=false;
				}
			}
		}
		return res;
	}

}
