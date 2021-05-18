package ressources.guerre;

import ressources.Ressources;

public abstract class RessourceGuerre implements Ressources{
	protected int unite;
	protected String name;
	public RessourceGuerre() {
		this.unite=0;
		this.name ="";
	}
	/**
	 * return the name of ressources
	 * @return name 
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * return the unite
	 * @return unite 
	 */
	public int getUnit() {
		return this.unite;
	}
}
