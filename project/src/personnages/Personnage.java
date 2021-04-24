package personnages;

public abstract class Personnage {
	protected int nbOr;
	protected int taille;
	protected int [] position=new int[2];
	public Personnage(int t) {
		this.taille=t;
		this.nbOr=0;
		this.position[0]=(Integer) null;
		this.position[1]=(Integer) null;
	}
	public  int getNbOr() {
		return this.nbOr;
	}
	public void addNbOr(int n ) {
		this.nbOr+=n;
	}
	
	public int[] getPosition() {
		return this.position;
	}
	public void setPosition(int y, int x) {
		this.position[0] = y;
		this.position[1]=x;
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



