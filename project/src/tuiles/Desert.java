package tuiles;

import ressources.agricole.Sable;

public class Desert extends Tuile {

	public Desert() {
		this.res=new Sable();
		this.name="desert";
		this.bonus=4;
	}

}
