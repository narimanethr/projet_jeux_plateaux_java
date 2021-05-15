package test;
import static org.junit.Assert.*;
import org.junit.Test;
import personnages.Armee;
import personnages.Personnage;

public class TestPersonnage {
	private Personnage p1;
	

	@Test
	public void TestGetNbOr() {
		this.p1= new Armee(5);
		assertEquals(0,p1.getNbOr());
		
	}
	@Test
	public void TestAddNbOr() {
		this.p1= new Armee(5);
		this.p1.addNbOr(5);
		assertEquals(5,p1.getNbOr());
		
	}
	@Test
	public void TestGetTaille() {
		this.p1= new Armee(5);
		assertEquals(5,p1.getTaille());
		
		
	}
	@Test
	public void TestSubTaille() {
		this.p1= new Armee(5);
		this.p1.subTaille(2);
		assertEquals(3,p1.getTaille());
		
	}

}
