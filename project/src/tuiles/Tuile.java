package tuiles;
import java.util.Random;

import ressources.Ressource;

public abstract class Tuile {
	protected String name;
	protected Ressource res;
	public Tuile(){
		this.res=null;
		this.name="";
	}
	public Ressource getRessources() {
		return this.res;
	}
	public String getName() {
		return this.name;
	}

}
