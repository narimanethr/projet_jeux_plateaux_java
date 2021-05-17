package plateaux;
import java.util.Map;
import java.util.Random;

import Joueur.JoueurAgricole;
import ressources.agricole.*;
import tuiles.*;

public abstract class Plateau{
	protected int largeur;
	protected	int hauteur;
	protected Tuile [][] plateau;
	 /**
     * create a new PlateauAgricole with the given width l, and h as height
     * @param l the width
     * @param h the height 
     */
	public Plateau(int l, int h){                
		this.largeur=l;
		this.hauteur=h;
		plateau = new Tuile[this.hauteur][this.largeur];
		for (int i=0;i<this.hauteur;i++) {
			for (int j=0; j<this.largeur;j++) {
				plateau[i][j]=new Ocean(null,1,j,i);
			}
		}
		Random r = new Random();
		int y= r.nextInt(this.hauteur);
		int x= r.nextInt(this.largeur);
		int nb=(this.getNbTuiles()*2/3);
		plateau[y][x]=getTuileAleatoire(y,x);
		while(getNBtuilOcean() >nb) {
			int y1= r.nextInt(this.hauteur);
			int x1= r.nextInt(this.largeur);
			if((hasAjNotOcean(y1, x1) & (this.plateau[y1][x1])instanceof Ocean )) {
				plateau[y1][x1]=getTuileAleatoire(y1,x1);
			}
		}
	}
	/* return's the number of tiles 
	 * @return  hauteur*this.largeur
	 * 
	 */
	public int getNbTuiles() {
		return this.hauteur*this.largeur;
	}
	/*return's a tile in the Board Game with given coordinates 
	 * @param y  horizontal position
	 * @param x vertical position  
	 * @return plateau[y][x]
	 */
	
	public Tuile getTuile(int y,int x) {
		return this.plateau[y][x];
	}
	/*return 's the height 
	 * @return hauteur the height 
	 * 
	 */
	public int getHauteur() {
		return this.hauteur;
	}
	/*return 's the width 
	 * @return largeur  the width
	 * 
	 */
	public int getLargeur() {
		return this.largeur;
	}
	
	public String toString() {
		return "ce plateau est de taille "+this.getNbTuiles();
	}
	public Tuile getTuileAleatoire(int y,int x){
		Random r = new Random();
		int t=r.nextInt(4);
		 switch(t) {
			case 0: return new Plaine(new Ble(),1,y,x);
			case 1: return new Montagne(new Roches(),1,y,x);
	        case 2: return new Foret(new Bois(),1,y,x);
	        case 3: return new Desert(new Sable(),1,y,x);
	        
		 }
		
		return null;
	}
	/* check's if the current tile has not a tile of ocean type 
	 * @param i a position 
	 * @param j a position 
	 * @return true if it has a tile of ocean type , or false instead 
	 * 
	 */
	
	

	
	public boolean hasAjNotOcean(int i, int j) {
		boolean res=false;
		if (j<this.getLargeur()-1 && !((plateau[i][j+1])instanceof Ocean )) {
			res=true;
			
		}
		if (j>0 &&!((plateau[i][j-1])instanceof Ocean )) {
			res=true;
			
		}
		if (i<this.getHauteur()-1 && !((plateau[i+1][j])instanceof Ocean )  ){
			res=true;
			
		}
		if (i>0 && !((plateau[i-1][j])instanceof Ocean )) {
			res=true;
		}
		return res;
	
	}
	/* return's the number of tiles of type Ocean
	 * @return res the number of tiles of type Ocean
	 */
	public int getNBtuilOcean() {
		int res=0;
		for (int i=0;i<this.hauteur;i++) {
			for (int j=0; j<this.largeur;j++) {
				if ((plateau[i][j])instanceof Ocean ) {
					res+=1;
				}
			}
		}
		return res;
	}
	public void affiche() {
		String t[]=new String[this.getHauteur()];
		for (int i=0;i<this.hauteur;i++) {
			t[i]="";
			for (int j=0; j<this.largeur;j++) {
				//plateau[i][j]=new Ocean(null,1,j,i);
				t[i]+= this.getTuile(i, j).getName()+ " ";
			}
			t[i]+="\n";
		}
		for (int i=0;i<this.hauteur;i++) {
			System.out.println(t[i]);
		}
		              		
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
	public boolean AllcontainsKey() {
		boolean res=true;
		JoueurAgricole joueur=new JoueurAgricole("test");
		Map<String, Integer> map = joueur.getRessources();
		for (int i=0;i<this.hauteur;i++) {
			for (int j=0; j<this.largeur;j++) {
				if(this.getTuile(i, j).hasRessources()&& map.containsKey(this.getTuile(i, j).getRes())==false) {
					res=false;
				}
			}
		}
		return res;
	}
	public boolean TcontainsKey(Tuile t) {
		JoueurAgricole joueur=new JoueurAgricole("test");
		Map<String, Integer> map = joueur.getRessources();
		return map.containsKey(t.getRes().getName());
	}

}
