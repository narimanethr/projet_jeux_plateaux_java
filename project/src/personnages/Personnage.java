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
	
	public int[] getPosition() {
		return this.position;
	}
	 /**
     * set's a new position 
     * @param y a vertical position
     * @param x an horizontal position
     * 
     */
	public void setPosition(int y, int x) {
		this.position[0] = y;
		this.position[1]=x;
	}
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



