package Joueur;

import java.util.HashMap;
import java.util.Map;

import ressources.Ressources;
import ressources.agricole.*;

public class Joueur {
	private int nbOr;
	private int unites;
	private String name;
	private int nbPersonnage;
	protected Map<RessourceAgricole,Integer> ressources;
	public Joueur(int nbPersonnage , String name) {
		this.name=name;
		this.nbPersonnage=nbPersonnage;
		this.nbOr=15;   //pour agrivole
		this.unites=10; // pour guerre
		this.ressources= new HashMap<>();
		RessourceAgricole ble =new Ble();
		RessourceAgricole bois =new Bois();
		RessourceAgricole roches =new Roches();
		RessourceAgricole sable =new Sable();
		this.ressources.put(ble, 0);
		this.ressources.put(bois, 0);
		this.ressources.put(roches, 0);
		this.ressources.put(sable, 0);
		
	}
	public void setRessources(Ressources k) {
		int v = this.ressources.get(k);
		this.ressources.replace((RessourceAgricole) k, v+1);
		
	}
	public Map<RessourceAgricole, Integer> getRessources() {
		return this.ressources;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNbPersonnage() {
		return nbPersonnage;
	}
	public void setNbPersonnage(int nbPersonnage) {
		this.nbPersonnage = nbPersonnage;
	}
	public int getNbOr() {
		return nbOr;
	}
	public void addNbOr(int n) {
		this.nbOr += n;
	}
	public void subNbOr(int n) {
		this.nbOr -= n;
	}
	public int getUnites() {
		return unites;
	}
	public void addUnites(int n) {
		this.unites +=n;
	}
	public void subUnites(int n) {
		this.unites -=n;
	}


}
