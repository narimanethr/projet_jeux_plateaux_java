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
		//System.out.println("plateau guerre \n");
		//p1.affiche();
		//System.out.println("nbre de tuiles de type Ocean: "+p1.getNBtuilOcean() + " \n");
		System.out.println("plateau agricole \n");
		p2.affiche();
		System.out.println("nbre de tuiles de type Ocean: "+p2.getNBtuilOcean() + " \n");
		//System.out.println(p2.AllcontainsKey());
		/**for (int i=0;i<p2.getHauteur();i++) {
			for (int j=0; j<p2.getLargeur();j++) {
				if(p2.getTuile(i, j).hasRessources()) {
					System.out.println(p2.TcontainsKey(p2.getTuile(i, j)));
				}
			}
		}*/
		RessourceAgricole b=new Ble(); 
		JoueurAgricole je=new JoueurAgricole("test");
		Map<RessourceAgricole, Integer> m = je.getRessources();
		System.out.println(m.containsKey(new Ble()));
	}

}
