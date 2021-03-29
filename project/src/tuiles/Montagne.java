package tuiles;

import ressourcesAgricole.Roches;

public class Montagne extends Tuile {

	public Montagne() {
		this.res=new Roches();
		this.name="montagne";
		this.bonus=4;
	}

}
