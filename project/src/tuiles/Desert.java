package tuiles;

import ressources.Ressources;

public class Desert extends Tuile {
	public Desert(Ressources res,int cap,int y,int x) {
		super(res,cap,y,x);
		this.cout=3;
		this.name="desert";
		this.bonus=4;
	}

}
