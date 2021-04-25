import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import actions.*;
import plateaux.*;
import joueur;
class testDeployer {
	private Joueur p1;
	private DeployerGuerre d;
	private PlateauGuerre plateau ;
	@Before
	public void before() {		
		this.d = new DeployerGuerre(plateau);
	    this.p1 = new Joueur(35, 20,"p1",12);
		
	}
	

	@Test
	public void testExecute() {
	
	}

	@Test
	public void testAffectAdj() {
	
	}



    // ---Pour permettre l'execution des tests ----------------------
    
    public static junit.framework.Test suite() {
    	return new junit.framework.JUnit4TestAdapter(test.testDeployerGuerre.class);
    }


}
