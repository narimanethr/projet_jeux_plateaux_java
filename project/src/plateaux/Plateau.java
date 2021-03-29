package plateaux;
import tuiles.Ocean;
import tuiles.Tuile;

public class Plateau {
	private int largeur;
	private	int hauteur;
	private Tuile [][] plateau;
	
	public Plateau(int l, int h){
		this.largeur=l;
		this.hauteur=h;
		plateau = new Tuile[this.hauteur][this.largeur];
		for (int i=0;i<this.hauteur;i++) {
			for (int j=0; j<this.largeur;j++) {
				
			}
		}
	}
	public int getNbTuiles() {
		return this.hauteur*this.largeur;
	}
	public  Tuile getTuile(int x,int y) {
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
	public int getNbTuiAjsOcean(int i, int j) {
		int res=0;
		if ((plateau[i][j+1])instanceof Ocean ) {
			res+=1;
			
		}
		if ((plateau[i][j-1])instanceof Ocean ) {
			res+=1;
			
		}
		if ((plateau[i+1][j])instanceof Ocean ) {
			res+=1;
			
		}
		if ((plateau[i-1][j+1])instanceof Ocean ) {
			res+=1;
		}
		return res;
		
	}
	

}