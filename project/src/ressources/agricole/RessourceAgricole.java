package ressources.agricole;

import ressources.Ressources;

public abstract class RessourceAgricole implements Ressources {
	protected int pieces;
	protected String name;
	
	public RessourceAgricole(){
		this.pieces=0;
		this.name="";
		}
	/**
	 *number of unities of ressources
	 *@return pieces  
	 */
	public int getUnit() {
		return this.pieces;
	}
    /**
     * return the name of ressources
     * @return name
     */
	public String getName() {
		return this.name;
	}

	
}