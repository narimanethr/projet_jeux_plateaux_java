package personnages;

public abstract class Personnage {
	protected int nbOr;
	protected int taille;
	public Personnage(int t) {
		this.taille=t;
		this.nbOr=0;
	}
	public  int getNbOr() {
		return this.nbOr;
	}
	public void setNbOr(int n ) {
		this.nbOr+=n;
	}
	
	public int getTaille() {
		return this.taille;
	}
	public void addTaille(int t) {
		this.taille = taille+t;
	}
	public void subTaille(int t) {
		this.taille = taille - t;
	}
	public String toString() {
		return " ";
	}

}



