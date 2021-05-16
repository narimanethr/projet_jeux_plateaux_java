

import static org.junit.Assert.*;

import org.junit.Test;

import ressources.agricole.Ble;
import ressources.agricole.Bois;
import ressources.agricole.RessourceAgricole;
import ressources.agricole.Roches;
import ressources.agricole.Sable;

public class TestRessourcesAgricole {
	private RessourceAgricole r1;
	private RessourceAgricole r2;
	private RessourceAgricole r3;
	private RessourceAgricole r4;

	@Test
	public void TestGetUnit() {
		this.r1 = new Ble();
		this.r2 = new Bois();
		this.r3 = new Roches();
		this.r4 = new Sable();
		assertEquals(2,r1.getUnit());
		assertEquals(2,r2.getUnit());
		assertEquals(8,r3.getUnit());
		assertEquals(5,r4.getUnit());
		
	}

}
