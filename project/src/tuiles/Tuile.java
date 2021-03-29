package tuiles;
import ressources.agricole.RessourceAgricole;

public abstract class Tuile {
	protected int bonus;
	protected String name;
	protected int capacite;
	protected RessourceAgricole res;
	public Tuile(String name, RessourceAgricole res,int cap) {
		super();
		this.name = name;
		this.res = res;
		this.capacite=cap;
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