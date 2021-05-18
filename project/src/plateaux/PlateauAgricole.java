package plateaux;
import java.util.Map;
import java.util.Random;

import Joueur.JoueurAgricole;
import ressources.agricole.*;
import tuiles.*;

public  class PlateauAgricole extends Plateau{
	protected int largeur;
	protected	int hauteur;
	protected Tuile [][] plateau;
	 /**
     * create a new PlateauAgricole with the given width l, and h as height
     * @param l the width
     * @param h the height 
     */
	public PlateauAgricole(int l, int h){   
		super(l,h);
		}

}


	
	