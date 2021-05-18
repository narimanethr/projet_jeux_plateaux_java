 package Joueur;

import java.util.HashMap;
import java.util.Map;

import ressources.Ressources;
import ressources.agricole.*;

public abstract class Joueur {
	protected int nbOr;
	protected int unites;
	protected String name;
	protected int nbPersonnage;
	protected Map<String,Integer> ressources;
	public Joueur( String name) {
		this.name=name;
		this.nbPersonnage=0;
		this.nbOr=15; 
		this.unites=10; // pour guerre unites de nourriture
		this.ressources= new HashMap<>();
		String ble =new Ble().getName();
		String bois =new Bois().getName();
		String  roches =new Roches().getName();
		String sable =new Sable().getName();
		this.ressources.put(ble, 0);
		this.ressources.put(bois, 0);
		this.ressources.put(roches, 0);
		this.ressources.put(sable, 0);
		
	}
	public void setRessources(String k) {
		 int v = this.ressources.get(k);
		this.ressources.replace(k, v+1);
		
	}
	public Map<String, Integer> getRessources() {
		return this.ressources;
	}
	/**
	 * return the name of player
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * set the name of player
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * return the number  of characters 
	 * @return nbPersonnage
	 */
	
	public int getNbPersonnage() {
		return nbPersonnage;
	}
	/**
	 * set the number  of characters
	 * @param nbPersonnage
	 */
	public void setNbPersonnage(int nbPersonnage) {
		this.nbPersonnage = nbPersonnage;
	}
	/**
	 * return the number  of gold
	 * @return nbOr
	 */
	public int getNbOr() {
		return nbOr;
	}
    /**
     * add number n of gold to the player  
     * @param n number of gold
     */
	public void addNbOr(int n) {
		this.nbOr += n;
	}
	/**
	 * substract number n of gold from the player 
	 * @param n number of gold
	 */
	public void subNbOr(int n) {
		this.nbOr -= n;
	}
	/**
	 * set the number  of gold
	 * @param nbOr
	 */
	public void setNbOr(int nbOr) {
		this.nbOr = nbOr;
	}
	/**
	 * return the unites
	 * @return unites 
	 */
	public int getUnites() {
		return unites;
	}
	/**
	 * Add the unites
	 * @param n the number of unites
	 */
	public void addUnites(int n) {
		this.unites +=n;
	}
	/**
	 * Subsract the unites
	 * @param n the number of unites to subtract
	 */
	public void subUnites(int n) {
		this.unites -=n;
	}
	/**
	 * check if the stock of personnage is empty 
	 * @return true or false 
	 */
	public boolean StockEmpty() {
		return this.nbPersonnage==0;
	}
	@Override
	public String toString() {
		return "Joueur [nbOr=" + nbOr + ", unites=" + unites + ", name=" + name + ", nbPersonnage=" + nbPersonnage
				+ ", ressources=" + ressources + "]";
	}
	

}