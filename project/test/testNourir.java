import static org.junit.jupiter.api.Assertions.*;
import actions;
import plateaux;
class testNourir {
	private Nourir n;
	private PlateauGuerre plateau ;
	@Before
	public void before() {		
		this.n = new Nourir(plateau);
		
	}
	

	@Test
	public void testExecute() {
		
	}

	@Test
	public void testCoutArmee() {
	
		
	}



    // ---Pour permettre l'execution des tests ----------------------
    
    public static junit.framework.Test suite() {
    	return new junit.framework.JUnit4TestAdapter(test.testNourir.class);
    }

	

}
