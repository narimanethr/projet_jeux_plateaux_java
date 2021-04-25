package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import personnages.Armee;
import personnages.Personnage;
class testPersonnage {
	private Personnage p1;
	 @Before
	   public void before() {
	      this.p1 = new Armee(10);
	     
	   }
	   @Test
	   public void testgetNbOr() {
	      assertEquals(0, this.p1.getNbOr());
	   }

	  
	   @Test
	   public void testgetTaille() {
	      assertEquals(10, this.p1.getTaille());
	      
	   }



	   // ---Pour permettre l'execution des tests ----------------------

	   public static junit.framework.Test suite() {
		      return new junit.framework.JUnit4TestAdapter(test.testPersonnage.class);
		   }

	

}
