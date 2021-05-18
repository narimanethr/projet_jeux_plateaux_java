package ressources.agricole;

import ressources.Ressources;

public abstract class RessourceAgricole implements Ressources {
	protected int pieces;
	protected String name;
	
	public RessourceAgricole(){
		this.pieces=0;
		this.name="";
		}
	
	public int getUnit() {
		return this.pieces;
	}

	public String getName() {
		return this.name;
	}

	
}