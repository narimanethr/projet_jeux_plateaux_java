package tuiles;

import ressources.Ressources;

public class Montagne extends Tuile {

	public Montagne(Ressources res,int cap,int y,int x) {
		super(res,cap,y,x);
		this.name="montagne";
		this.bonus=4;
		this.cout=5;
				}

}
