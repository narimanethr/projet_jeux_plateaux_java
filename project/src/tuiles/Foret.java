package tuiles;
import ressources.Ressources;
public class Foret extends Tuile {
	/* Creates a new Foret Tile with Ressources res,a  capacity cap ,horizontal and vertical coordinates x and y 
	 * @param res Ressources  , the ressources of the tile 
	 * @param cap the capacity of the tile 
	 * @param y the vertical coordinate of the tile 
	 * @param x the horizontal  coordinate of the tile 
	 * 
	 */

	public Foret(Ressources res,int cap,int y,int x) {
		super(res,cap,y,x);
		this.name="foret";
		this.bonus=4;
		this.cout=1;
	}

}
