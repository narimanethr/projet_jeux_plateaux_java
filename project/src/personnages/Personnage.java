package personnages;

public abstract class Personnage {
	protected int nbOr;
	protected int taille;
	
	public Personnage(int t) {
		this.taille=t;
		this.nbOr=0;
		
	}
	/**
	 * return Number of gold's personnage
	 * @return nbOr
	 */
	public  int getNbOr() {
		return this.nbOr;
	}
	/**
	 * Add Number of gold n to personnage
	 * @param n nbOr
	 */
	public void addNbOr(int n ) {
		this.nbOr+=n;
	}	
	/**
	 * return  size of personnage
	 * @return taille
	 */
	public int getTaille() {
		return this.taille;
	}
	/**
	 * Add size t to the personnage 
	 * @param t a size
	 */
	public void addTaille(int t) {
		this.taille = taille+t;
	}
	/**
	 * substract size t from personnage's size 
	 * @param t a size
	 */
	public void subTaille(int t) {
		this.taille = taille - t;
	}
	public String toString() {
		return " ";
	}

}



