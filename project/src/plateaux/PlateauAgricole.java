package plateaux;
import java.util.Random;
import ressources.agricole.*;
import tuiles.*;

public abstract class PlateauAgricole{
	private int largeur;
	private	int hauteur;
	private Tuile [][] plateau;
	
	public PlateauAgricole(int l, int h){                 //Tuile(String name, RessourceAgricole res,int cap,int y,int x)
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
		int nbOfOc=getNBtuilOcean();
		plateau[y][x]=getTuileAleatoire(y,x);
		while(nbOfOc > (2/3)*(this.getNbTuiles()) ) {
			int y1= r.nextInt(this.hauteur);
			int x1= r.nextInt(this.largeur);
			plateau[y][x]=getTuileAleatoire(y,x);
			if((hasAjNotOcean(y1, x1) & (this.plateau[y1][x1])instanceof Ocean )) {
				plateau[y1][x1]=getTuileAleatoire(y1,x1);
			}
		}
	}
	
	public int getNbTuiles() {
		return this.hauteur*this.largeur;
	}
	
	
	public Tuile getTuile(int x,int y) {
		return this.plateau[y][x];
	}
	
	
	public int getHauteur() {
		return this.hauteur;
	}
	
	
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
	

	
	public boolean hasAjNotOcean(int i, int j) {
		boolean res=false;
		if (!((plateau[i][j+1])instanceof Ocean )) {
			res=true;
			
		}
		if (!((plateau[i][j-1])instanceof Ocean )) {
			res=true;
			
		}
		if (!((plateau[i+1][j])instanceof Ocean ) ){
			res=true;
			
		}
		if (!((plateau[i-1][j+1])instanceof Ocean )) {
			res=true;
		}
		return res;
	
	}
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
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	