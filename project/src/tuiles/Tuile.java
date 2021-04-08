package tuiles;
import Joueur.Joueur;
import ressources.Ressources;
import ressources.agricole.RessourceAgricole;

public abstract class Tuile {
	protected Joueur proprietaire;
	protected int bonus;
	protected String name;
	protected int capacite;
	protected int cout;
	protected int [] position=new int[2];
	protected Ressources res;
	public Tuile(Ressources res,int cap,int y,int x) {
		this.name = "";
		this.res = res;
		this.capacite=cap;
		this.position[0]=y;
		this.position[1]=x;
	}
	
	public Ressources getRes() {
		return res;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Joueur getProprietaire() {
		return this.proprietaire;
	}
	public void setProprietaire(Joueur j) {
		this.proprietaire=j;
	}

	public int getCapacite() {
		return capacite;
	}


	public int getCout() {
		return cout;
	}

	
}