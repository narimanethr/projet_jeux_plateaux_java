package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Joueur.JoueurAgricole;
import Joueur.JoueurGuerre;
import actions.DeployerAgricole;
import actions.DeployerGuerre;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import personnages.Armee;
import personnages.Ouvrier;
import plateaux.PlateauAgricole;
import plateaux.PlateauGuerre;
import ressources.agricole.Roches;
import tuiles.Montagne;
import tuiles.Ocean;
import tuiles.Tuile;

public class TestDeployerGuerre {

	@Test
	public void TestExecute() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		PlateauGuerre p = new PlateauGuerre(4,4);
		JoueurGuerre j1 = new JoueurGuerre("player1");
		DeployerGuerre d = new  DeployerGuerre(p);
		Armee a = new Armee(1);
		for(int y=0;y<p.getHauteur();y++){
			for (int x=0;x<p.getLargeur();x++) {
				Tuile t = p.getTuile(y,x);
				if(t.isFree() & j1.getNbPersonnage()>=a.getTaille()& a.getTaille()<=t.getCapacite()){
					assertEquals(null,p.getTuile(y, x).getProprietaire()); // précondition 
					int nbrPersonneInit = j1.getNbPersonnage();
					d.execute(j1, y, x, a);
					int nbrPersonneAfter = j1.getNbPersonnage();
					assertEquals(a,p.getTuile(y, x).getPeresonnage());
					assertEquals(j1,p.getTuile(y, x).getProprietaire());
					assertTrue( nbrPersonneAfter==nbrPersonneInit-a.getTaille());
				}			
			}
		}

	}
	@Test( expected = StockEmptyException.class)
	public void TestStockEmptyException() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException  {
		PlateauGuerre p1 = new PlateauGuerre(20,10);
		JoueurGuerre j1 = new JoueurGuerre("player1");
		j1.setNbPersonnage(0);
		DeployerGuerre a1 = new DeployerGuerre(p1);
		for(int x=0;x<p1.getLargeur();x++){
			for (int y=0;y<p1.getHauteur();y++) {
				assertEquals(null,p1.getTuile(y, x).getProprietaire()); // précondition 
				if(p1.getTuile(y, x).isFree()) {
		
					Armee o2= new Armee(p1.getTuile(y, x).getCapacite());
					a1.execute(j1, y, x,o2);
	
				}
				 
			}
		}
	}
	@Test( expected = RangeOutOfCapacityTileException.class)
	public void TestRangeOutOfCapacityTileException() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		PlateauGuerre p2 = new PlateauGuerre(20,10);
		JoueurGuerre j2 = new JoueurGuerre("player1");
		DeployerGuerre a2 = new DeployerGuerre(p2);
		for(int x=0;x<p2.getLargeur();x++){
			for (int y=0;y<p2.getHauteur();y++) {
				assertEquals(null,p2.getTuile(y, x).getProprietaire()); // précondition 
				if(p2.getTuile(y, x).isFree()) {

					Armee o2= new Armee(p2.getTuile(y, x).getCapacite()+1);
					a2.execute(j2, y, x,o2);
	
				}
				 
			}
		}
	}
	@Test( expected = NoteFreeTileException.class)
	public void TestNoteFreeTileExceptionthrows2() throws NoteFreeTileException, RangeOutOfCapacityTileException, StockEmptyException {
		PlateauGuerre p3 = new PlateauGuerre(20,10);
		JoueurGuerre j3 = new JoueurGuerre("player1");
		Armee o3= new Armee(1);
		DeployerGuerre a3 = new DeployerGuerre(p3);
		for(int x=0;x<p3.getLargeur();x++){
			for (int y=0;y<p3.getHauteur();y++) {
				assertEquals(null,p3.getTuile(y, x).getProprietaire()); // précondition 
				if(p3.getTuile(y, x).isFree() ) {
					int nbrPersonnageinit = j3.getNbPersonnage();
					a3.execute(j3, y, x, o3);
					int nbrPersonnageAfter = j3.getNbPersonnage();
				     assertEquals(j3,p3.getTuile(y, x).getProprietaire()); 
				     assertTrue(nbrPersonnageAfter<nbrPersonnageinit);		
				}
				a3.execute(j3, y, x, o3); //deploiement sur une tuile dejai occupé 
			}
		}
	}
		

	@Test
	public void TestConverTailleTuile() {
		PlateauGuerre p4 = new PlateauGuerre(1,1);
		JoueurGuerre j4 = new JoueurGuerre("player1");
		DeployerGuerre d4 = new  DeployerGuerre(p4);

		for(int y=0;y<p4.getHauteur();y++){
			for (int x=0;x<p4.getLargeur();x++) {
				if(p4.getTuile(y, x).isFree() && p4.getTuile(y, x).getPeresonnage()!=null) {
					if (p4.getTuile(y, x) instanceof Montagne & p4.getTuile(y, x).getProprietaire()!=j4) {
						int tailleInit = p4.getTuile(y, x).getPeresonnage().getTaille();
						int res=d4.converTailleTuile(p4.getTuile(y, x),j4);
						assertTrue(res==tailleInit+2);

					}
					else{
						int tailleInit = p4.getTuile(y, x).getPeresonnage().getTaille();
						int res=d4.converTailleTuile(p4.getTuile(y, x),j4);
						assertTrue(res==tailleInit);

					}

				}

			}


		}	

	}

}
