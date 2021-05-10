package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import Joueur.Joueur;
import Joueur.JoueurAgricole;
import ressources.agricole.RessourceAgricole;

class TestJoueurAgricole {
	private Joueur p1;
	private Map<RessourceAgricole, Integer> mp = new HashMap<>();
	
	   @Test
	   public void TestGetName() {
		   this.p1 = new JoueurAgricole("p1");
	      assertEquals("p1", p1.getName());
	   }
	   @Test
	   public void TestSetRessources() {
		      
		  
	   }
	   @Test
	   public void TestGetRessources() {
		   this.p1 = new JoueurAgricole("p1");
		  
		   
		  
	   }
	   @Test
	   public void TestSetName() {
		   this.p1 = new JoueurAgricole("p1");
		   this.p1.setName("p2");
	      assertEquals("p2", p1.getName());
	   }
	   @Test
	   public void TestGetNbPersonnage() {
		   this.p1 = new JoueurAgricole("p1");
	      assertEquals(0, p1.getNbPersonnage());
	   }
	   @Test
	   public void TestSetNbPersonnage() {
		   this.p1 = new JoueurAgricole("p1");
		   this.p1.setNbPersonnage(3);
	      assertEquals(3, p1.getNbPersonnage());
	   }

	   @Test
	   public void TestGetNbOr() {
		   this.p1 = new JoueurAgricole("p1");
	      assertEquals(15, p1.getNbOr());
	   }
	   @Test
	   public void TestGetUnites() {
		   this.p1 = new JoueurAgricole("p1");
	      assertEquals(10, p1.getUnites());
	   }
	   @Test
	   public void TestAddNbOr() {
		   this.p1 = new JoueurAgricole("p1");
		   this.p1.addNbOr(1);   
	      assertEquals(16, p1.getNbOr());
	   }
	   @Test
	   public void TestSubNbOr() {
		   this.p1 = new JoueurAgricole("p1");
		   this.p1.subNbOr(1);   
	      assertEquals(14, p1.getNbOr());
	   }
	   @Test
	   public void TestSetNbOr() {
		   this.p1 = new JoueurAgricole("p1");
		   this.p1.setNbOr(10);   
	      assertEquals(10, p1.getNbOr());
	   }
	   @Test
	   public void TestAddUnites() {
		   this.p1 = new JoueurAgricole("p1");
		   this.p1.addUnites(2);   
	      assertEquals(12, p1.getUnites());
	   }
	   @Test
	   public void TestSubUnites() {
		   this.p1 = new JoueurAgricole("p1");
		   this.p1.subUnites(2);   
	      assertEquals(8, p1.getUnites());
	   }
	   
	   
	   
	   

	 
	     
	
	




}
