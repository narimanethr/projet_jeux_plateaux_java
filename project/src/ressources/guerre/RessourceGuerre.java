package ressources.guerre;

import ressources.Ressources;

public abstract class RessourceGuerre implements Ressources{
	protected int unite;
	protected String name;
	public RessourceGuerre() {
		this.unite=0;
		this.name ="";
	}
	/*return 's the  name 
	 * @return name  the  name
	 * 
	 */
	public String getName() {
		return this.name;
	}
	
	/*return 's the unite
	 * @return unite the  unite 
	 * 
	 */
	public int getUnit() {
		return this.unite;
	}
}
