package personnages;

public abstract class Personnage {
	protected int nbOr;
	protected int taille;
	
	public Personnage(int t) {
		this.taille=t;
		this.nbOr=0;
		
	}
	/**
	 * return NbOr
	 * @return nbOr
	 */
	public  int getNbOr() {
		return this.nbOr;
	}
	/**
	 * Add NbOr
	 * @param n nbOr
	 */
	public void addNbOr(int n ) {
		this.nbOr+=n;
	}	
	/**
	 * return  taille
	 * @return taille
	 */
	public int getTaille() {
		return this.taille;
	}
	/**
	 * Add taille
	 * @param t a size
	 */
	public void addTaille(int t) {
		this.taille = taille+t;
	}
	/**
	 * substracts taille
	 * @param t a size
	 */
	public void subTaille(int t) {
		this.taille = taille - t;
	}
	public String toString() {
		return " ";
	}

}



