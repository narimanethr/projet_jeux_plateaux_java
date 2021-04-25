package actions;
import java.util.Iterator;
import java.util.Set;


import Joueur.Joueur;
import plateaux.PlateauAgricole;
import ressources.Ressources;
import ressources.agricole.RessourceAgricole;

public class EchangeRessources {
	protected PlateauAgricole plateau;
	public EchangeRessources(PlateauAgricole p) {
		this.plateau=p;
	}
	public void execute(Joueur j) {
		Set<RessourceAgricole> keys =j.getRessources().keySet();
		Iterator<RessourceAgricole> it =keys.iterator();
		while (it.hasNext()) {
			RessourceAgricole res=it.next();
			int v=j.getRessources().get(res);
			int a= res.getUnit();
			j.addNbOr(v*a);
			j.getRessources().replace(res, 0);
		}
	}
	}

