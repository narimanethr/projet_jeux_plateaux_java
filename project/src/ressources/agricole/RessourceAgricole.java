package ressources.agricole;

import ressources.Ressources;

public abstract class RessourceAgricole implements Ressources {
	protected int pieces;
	
	public RessourceAgricole(){
		this.pieces=0;
	}
	/*return's the number of pieces 
	 *   @return pieces number of pieces 
	 * 
	 */
	public int getPieces() {
		return this.pieces;
	}
}