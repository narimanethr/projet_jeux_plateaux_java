package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Joueur.JoueurGuerre;
import actions.DeployerGuerre;
import actions.RecolterGuerre;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import personnages.Armee;
import plateaux.PlateauGuerre;
import tuiles.Ocean;

class TestRecolterGuerre {


	
	
	@Test
	void TestExecute() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		Armee a = new Armee(1);
		JoueurGuerre j1  = new JoueurGuerre("p1");
		 PlateauGuerre p1 = new PlateauGuerre(1,1);
		//de taille 1 pour s'assurer que la tuile est libre (non ocean) 
       //et  assurer le deployment 
		 RecolterGuerre r = new RecolterGuerre(p1);
		 DeployerGuerre d = new DeployerGuerre(p1);
		int nbOrinit = j1.getNbOr();
		d.execute(j1, 0, 0, a );
		r.execute(j1);
		int nbOrAfter = j1.getNbOr();
		assertTrue(nbOrAfter > nbOrinit);
		assertTrue(nbOrAfter == p1.getTuile(0, 0).getRes().getUnit());
		
		
		
	
		
		
		
}
	
	@Test
	void TestExecute2() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		Armee a2 = new Armee(1);
		JoueurGuerre j2  = new JoueurGuerre("p1");
		 PlateauGuerre p2 = new PlateauGuerre(1,1);
		//de taille 1 pour s'assurer que la tuile est libre (non ocean) 
       //et  assurer le deployment 
		 RecolterGuerre r2 = new RecolterGuerre(p2);
		 DeployerGuerre d2= new DeployerGuerre(p2);
		for(int y=0;y<p2.getHauteur();y++){
			for (int x=0;x<p2.getLargeur();x++) {
				if(p2.getTuile(y, x).isFree()) {
					int nbOrinit = j2.getNbOr();
					d2.execute(j2, y, x, a2);
					r2.execute(j2);
					int nbOrAfter = j2.getNbOr();
					assertTrue(nbOrAfter > nbOrinit);
					
					
					
				
			
			}
		}
}


		
		
		
	
		
		
		
}
}
	



