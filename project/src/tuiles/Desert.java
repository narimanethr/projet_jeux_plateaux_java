package tuiles;

import ressources.Ressources;

public class Desert extends Tuile {
	/* Creates a new Desert Tile with Ressources res,a  capacity cap ,horizontal and vertical coordinates x and y 
	 * @param res Ressources  , the ressources of the tile 
	 * @param cap the capacity of the tile 
	 * @param y the vertical coordinate of the tile 
	 * @param x the horizontal  coordinate of the tile 
	 * 
	 */
	public Desert(Ressources res,int cap,int y,int x) {
		super(res,cap,y,x);
		this.cout=3;
		this.name="desert";
		this.bonus=4;
	}

}
