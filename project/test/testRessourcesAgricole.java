package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import ressources.agricole.*;
class testRessourcesAgricole {
	private Bois b1;
	private Ble b2;
	private Roches b3;
	private Sable b4;


	   @Test
	   public void testGetPieces() {
	      assertEquals(2, this.b1.getPieces());
	      assertEquals(2, this.b2.getPieces());
	      assertEquals(8, this.b3.getPieces());
	      assertEquals(5, this.b4.getPieces());
	   }

	   // ---Pour permettre l'execution des tests ----------------------

	   public static junit.framework.Test suite() {
		      return new junit.framework.JUnit4TestAdapter(test.testRessourcesAgricole.class);
		   }

	
}
