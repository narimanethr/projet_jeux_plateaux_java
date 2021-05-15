package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Joueur.JoueurAgricole;
import Joueur.JoueurGuerre;
import actions.DeployerGuerre;
import actions.Nourir;
import actions.RecolterGuerre;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import personnages.Armee;
import personnages.Personnage;
import plateaux.PlateauGuerre;
import ressources.Ressources;
import ressources.agricole.Sable;
import ressources.guerre.Ble;
import ressources.guerre.Bois;
import ressources.guerre.Roches;
import tuiles.Desert;
import tuiles.Foret;
import tuiles.Montagne;
import tuiles.Plaine;
import tuiles.Tuile;

public class TestNourir {


	@Test
	public void TestExecute1() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {

		PlateauGuerre p3 = new PlateauGuerre(4,2);
		JoueurGuerre j3 = new JoueurGuerre("player1");
		Armee a3 = new Armee(1);
		Nourir n = new Nourir(p3);
		DeployerGuerre d = new DeployerGuerre(p3);
		RecolterGuerre r = new RecolterGuerre(p3);
		for(int y=0;y<p3.getHauteur();y++){
			for (int x=0;x<p3.getLargeur();x++) {
				if(p3.getTuile(y, x).isFree()&p3.getTuile(y, x).hasProprietaire()){
					d.execute(j3, y, x, a3);
					r.execute(j3);
					int nbOrPersInit=p3.getTuile(y, x).getPeresonnage().getNbOr();
					assertTrue(nbOrPersInit==0);
					n.execute(j3);
					int nbOrPersAfter=p3.getTuile(y, x).getPeresonnage().getNbOr();
					assertTrue(nbOrPersAfter==nbOrPersInit+n.coutArmee(p3.getTuile(y, x)));
				}
			}
		}
	}

	@Test 
	public void TestCoutArmee() {
		Nourir n = new Nourir(new PlateauGuerre(4,2));
		Armee a=new Armee(2);
		Tuile plaine= new Plaine(new Ble(),5,0,0);
		Tuile montagne= new Montagne(new Roches(),3,0,0);
		Tuile foret =new Foret(new Bois(),3,0,0);
		Tuile desert= new Desert(new Sable(),5,0,0);
		plaine.setPersonnage(a);
		montagne.setPersonnage(a);
		foret.setPersonnage(a);
		desert.setPersonnage(a);
		assertTrue(n.coutArmee(desert)==4);
		assertTrue(n.coutArmee(foret)==2);
		assertTrue(n.coutArmee(montagne)==2);
		assertTrue(n.coutArmee(plaine)==2);

	}
		
		
	


	
}
