package Joueur;
public class Joueur {
	private int nbOr;
	private int unites;
	private String name;
	private int nbPersonnage;
	
	public Joueur(int nbPersonnage , String name) {
		this.name=name;
		this.nbPersonnage=nbPersonnage;
		this.nbOr=nbOr=0;
		this.unites=10;
	}
	/* return 's the name of player 
	 * @return name 
	 */
	public String getName() {
		return name;
	}
	/* set  's the name of player 
	 * @param  name 
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* return 's the number  of characters  
	 * @return nbPersonnage 
	 */
	
	public int getNbPersonnage() {
		return nbPersonnage;
	}
	/* set 's the number  of characters  
	 * @param  nbPersonnage 
	 */
	public void setNbPersonnage(int nbPersonnage) {
		this.nbPersonnage = nbPersonnage;
	}
	/* return 's the number  of gold  
	 * @return nbOr
	 */
	public int getNbOr() {
		return nbOr;
	}
	/* set's the number  of gold  
	 * @param nbOr
	 */
	public void setNbOr(int nbOr) {
		this.nbOr = nbOr;
	}
	/* return 's the unites  
	 * @return unites 
	 */
	public int getUnites() {
		return unites;
	}
	/* Add 's the unites  
	 * @param n the number of unites 
	 */
	public void addUnites(int n) {
		this.unites +=n;
	}
	/* Subsract's the unites  
	 * @param n the number of unites to subtract 
	 */
	public void subUnites(int n) {
		this.unites -=n;
	}


}
