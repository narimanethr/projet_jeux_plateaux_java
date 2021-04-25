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
		List<Student> sorted = this.group.alphabeticalOrder();
		assertTrue(sorted.get(0).getName().compareTo(sorted.get(1).getName()) <= 0);
		assertTrue(sorted.get(1).getName().compareTo(sorted.get(2).getName()) <= 0);
	}

	@Test
	public void testCoutArmee() {
		// st3 > st1 > st2
		st1.addMark(Subject.POO, 10);
		st1.addMark(Subject.BDD1, 12);
		st2.addMark(Subject.POO, 8);
		st2.addMark(Subject.BDD1, 10);
		st3.addMark(Subject.POO, 15);
		st3.addMark(Subject.BDD1, 15);
		
		List<Student> sorted = this.group.averageOrder();
		assertEquals(st3, sorted.get(0));
		assertEquals(st1, sorted.get(1));
		assertEquals(st2, sorted.get(2));
		
	}



    // ---Pour permettre l'execution des tests ----------------------
    
    public static junit.framework.Test suite() {
    	return new junit.framework.JUnit4TestAdapter(test.testNourir.class);
    }

	

}
