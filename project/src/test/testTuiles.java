package test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import tuiles.*;
import ressources.agricole.*;
class testTuiles {
	private Ocean n1;
	private Montagne n2;
	private Foret n3;
	private Plaine n4;
	private Desert n5;
	private Bois b1;
	private Ble b2;
	private Roches b3;
	private Sable b4;
	

	 @Test
	   public void testGetRessources() {
	      assertEquals(null, this.n1.getRes());
	      assertEquals(b1, this.n3.getRes());
	      assertEquals(b4, this.n5.getRes());
	      assertEquals(b3, this.n2.getRes());
	      assertEquals(b2, this.n4.getRes());
	     
	   }
	 @Test
	   public void testGetName() {
	      assertEquals("ocean", this.n1.getName());
	      assertEquals("montagne", this.n2.getName());
	      assertEquals("foret", this.n3.getName());
	      assertEquals("plaine", this.n4.getName());
	      assertEquals("desert", this.n5.getName());
	   }
	   // ---Pour permettre l'execution des tests ----------------------

	   public static junit.framework.Test suite() {
		      return new junit.framework.JUnit4TestAdapter(test.testTuiles.class);
		   }
	 



}
