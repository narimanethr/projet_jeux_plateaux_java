package actions;
import java.util.Iterator;
import java.util.Set;


import Joueur.JoueurAgricole;
import plateaux.PlateauAgricole;
import ressources.agricole.Ble;
import ressources.agricole.Bois;
import ressources.agricole.RessourceAgricole;
import ressources.agricole.Roches;
import ressources.agricole.Sable;
import tuiles.Desert;
import tuiles.Foret;
import tuiles.Montagne;
import tuiles.Plaine;

public class EchangeRessources implements Action{
	protected PlateauAgricole plateau;
	/* create a new  EchangeRessources action  with p the gameBoard
	 * @param p PlateauAgricole
	 * 
	 */
	public EchangeRessources(PlateauAgricole p) {
		this.plateau=p;
	}
	public void execute(JoueurAgricole j) {
		Set<String> keys =j.getRessources().keySet();
		Iterator<String> it =keys.iterator();
		while (it.hasNext()) {
			String res=it.next();
			int v=j.getRessources().get(res);
			int a= this.convertVersOr(res);
			j.addNbOr(v*a);
			j.getRessources().replace(res, 0);
		}
	}
	/*Convert's the given ressources into or 
	 * @param res , the name of the ressource that we want to convert 
	 * 
	 */
	

	int convertVersOr(String res) {
		switch(res) {
		case "ble": return new Ble().getUnit();
		case "roches": return new Roches().getUnit();
		case "bois": return new Bois().getUnit();
		case "sable": return new Sable().getUnit();
		}
		return 0;
	}
}