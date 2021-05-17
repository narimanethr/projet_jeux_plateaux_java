package tuiles;

import ressources.Ressources;

public class Montagne extends Tuile {
	/* Creates a new Montagne Tile with Ressources res,a  capacity cap ,horizontal and vertical coordinates x and y 
	 * @param res Ressources  , the ressources of the tile 
	 * @param cap the capacity of the tile 
	 * @param y the vertical coordinate of the tile 
	 * @param x the horizontal  coordinate of the tile 
	 * 
	 */

	public Montagne(Ressources res,int cap,int y,int x) {
		super(res,cap,y,x);
		this.name="montagne";
		this.bonus=4;
		this.cout=5;
				}

}
