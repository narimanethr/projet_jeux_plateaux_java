import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import actions.*;
import tuiles.Ocean;
import actions;
import plateaux;
import personnages ;
import tuiles;
class testDeployerAgricole {
	private Joueur p1;
	private DeployerAgricole d1;
	private PlateauAgricole plateau ;
	private Ouvrier o1;
	private Montagne m;
	@Before
	public void before() {		
		this.d1 = new DeployerAgricole(plateau);
		this.p1 = new Joueur(35, 20,"p1",12);
		this.o1 = new Ouvrier(1);
		this.m =new Montagne("montagne",4,5,y,x);
		
		
	}
	@Test
	public void testExecute() {
		    assertFalse((this.plateau.getTuile(y,x) instanceof Ocean));
		    assertFalse(this.plateau.getTuile(y,x).isFree());
		    m.setProprietaire(p1);
		    assertEquals(m.setProprietaire(p1),this.plateau.getTuile(y,x).setProprietaire(p1));	
		    m..setPersonnage(o1);
            assertEquals(m..setPersonnage(o1),this.plateau.getTuile(y,x).setPersonnage(o1));
		    p1.setNbPersonnage(p1.getNbPersonnage()-1);
            assertEquals(0,p1.setNbPersonnage(p1.getNbPersonnage()-1));
	}

    // ---Pour permettre l'execution des tests ----------------------
    
    public static junit.framework.Test suite() {
    	return new junit.framework.JUnit4TestAdapter(test.testDeployerAgricole.class);
    }



}
