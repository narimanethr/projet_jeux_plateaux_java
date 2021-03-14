package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import ressources.guerre.*;
public class testRessourcesGuerre {
	private Bois b1;
	private Ble b2;
	private Roches b3;
	private Sable b4;

	   @Test
	   public void testGetPieces() {
	      assertEquals(1, this.b1.getPieces());
	      assertEquals(5, this.b2.getPieces());
	      assertEquals(0, this.b3.getPieces());
	      assertEquals(0, this.b4.getPieces());
	   }

	   // ---Pour permettre l'execution des tests ----------------------

	   public static junit.framework.Test suite() {
		      return new junit.framework.JUnit4TestAdapter(test.testRessourcesGuerre.class);
		   }


}
