package personnages;

public abstract class Personnage {
	protected int nbOr;
	protected int taille;
	
	public Personnage(int t) {
		this.taille=t;
		this.nbOr=0;
		
	}
	/*return's NbOr
	 * @return nbOr
	 * 
	 */
	public  int getNbOr() {
		return this.nbOr;
	}
	/*Add's NbOr
	 * @param nbOr
	 * 
	 */
	public void addNbOr(int n ) {
		this.nbOr+=n;
	}
	/*return's position
	 * @return position
	 * 
	 */
	
	
	 /**
     * set's a new position 
     * @param y a vertical position
     * @param x an horizontal position
     * 
     */
	
	/*return's taille
	 * @return taille
	 * 
	 */
	public int getTaille() {
		return this.taille;
	}
	/*Add's taille
	 * @param t  a size 
	 * 
	 */
	public void addTaille(int t) {
		this.taille = taille+t;
	}
	/*substracts 's taille
	 * @param t  a size 
	 * 
	 */
	public void subTaille(int t) {
		this.taille = taille - t;
	}
	public String toString() {
		return " ";
	}

}



