package ressources.agricole;

import ressources.Ressources;

public abstract class RessourceAgricole implements Ressources {
	protected int pieces;
	protected String name;
	
	public RessourceAgricole(){
		this.pieces=0;
		this.name="";
		}
	/*return 's the unit 
	 * @return pieces 
	 * 
	 */
	
	public int getUnit() {
		return this.pieces;
	}
	/*return 's the name  
	 * @return name the name
	 * 
	 */

	public String getName() {
		return this.name;
	}

	
}