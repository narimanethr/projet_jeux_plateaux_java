package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import Joueur.Joueur;
public class  testJoueur {
	private Joueur p1;
	 @Before
	   public void before() {
	      this.p1 = new Joueur(35, 20,"p1",12);
	     
	   }

	   @Test
	   public void testGetName() {
	      assertEquals("p1", this.p1.getName());
	   }

	   @Test
	   public void testUnites() {
	      assertEquals(12, this.p1.getUnites());
	   }
	   @Test
	   public void testNbOr() {
	      assertEquals(20, this.p1.getNbOr());
	      
	   }
	   @Test
	   public void testNbPersonnage() {
	      assertEquals(35, this.p1.getNbPersonnage());
	     
	   }



	   // ---Pour permettre l'execution des tests ----------------------

	   public static junit.framework.Test suite() {
		      return new junit.framework.JUnit4TestAdapter(test.testJoueur.class);
		   }



}
