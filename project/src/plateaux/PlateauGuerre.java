package plateaux;

import java.util.Random;
import ressources.guerre.*;
import tuiles.*;


public class PlateauGuerre extends PlateauAgricole{

	public PlateauGuerre(int l, int h) {
		super(l, h);
		
	}
	/* return's a random tile 
	 * @param y a position 
	 * @param x a position 
	 * @return  Tuile a tile 
	 */
	public Tuile getTuileAleatoire(int y,int x){
		Random r = new Random();
		int t=r.nextInt(4);
		 switch(t) {
			case 0: return new Plaine(new Ble(),5,y,x);
			case 1: return new Montagne(new Roches(),3,y,x);
	        case 2: return new Foret(new Bois(),3,y,x);
	        case 3: return new Desert(new Sable(),5,y,x);
	        
		 }
		
		return null;
	}

}
