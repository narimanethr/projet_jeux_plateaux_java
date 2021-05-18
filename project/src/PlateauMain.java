import java.util.Map;

import Joueur.JoueurAgricole;
import plateaux.*;
import ressources.agricole.Ble;
import ressources.agricole.RessourceAgricole;


public class PlateauMain {

	public PlateauMain() {
		// TODO Auto-generated constructor stub
	}
	


	public static void main(String[] args) {
		PlateauGuerre p1 = new PlateauGuerre(10,5);
		PlateauAgricole p2 = new PlateauAgricole(10,5);
		System.out.println("plateau guerre \n");
		p1.affiche();
		System.out.println("nbre de tuiles de type Ocean: "+p1.getNBtuilOcean() + " \n");
		System.out.println("plateau agricole \n");
		p2.affiche();
		System.out.println("nbre de tuiles de type Ocean: "+p2.getNBtuilOcean() + " \n");
		
	}

}
