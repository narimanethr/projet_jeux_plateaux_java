package tuiles;
import ressources.agricole.RessourceAgricole;

public abstract class Tuile {
	protected String name;
	protected RessourceAgricole res;
	public Tuile(String name, RessourceAgricole res) {
		super();
		this.name = name;
		this.res = res;
	}
	
	public RessourceAgricole getRes() {
		return res;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}