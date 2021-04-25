package ressources.guerre;

import ressources.Ressources;

public abstract class RessourceGuerre implements Ressources{
	protected int unite;
	public RessourceGuerre() {
		this.unite=0;
	}
	/*return 's the unite
	 * @return unite the  unite 
	 * 
	 */
	public int getUnit() {
		return this.unite;
	}
}
