package ressources.agricole;

import ressources.Ressources;

public abstract class RessourceAgricole implements Ressources {
	protected int pieces;
	
	public RessourceAgricole(){
		this.pieces=0;
	}
	public int getUnit() {
		return this.pieces;
	}
}