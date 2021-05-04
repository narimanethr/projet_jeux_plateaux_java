package test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import ressources.guerre.*;
class TestRessourcesGuerre {
	private Ble r1;
	private Bois r2;
	private Roches r3;
	private Sable r4;
	@Test
	void TestGetUnit() {
		this.r1 = new Ble();
		this.r2 = new Bois();
		this.r3 = new Roches();
		this.r4 = new Sable();
		assertEquals(5,r1.getUnit());
		assertEquals(1,r2.getUnit());
		assertEquals(0,r3.getUnit());
		assertEquals(0,r4.getUnit());
		
	}

}
