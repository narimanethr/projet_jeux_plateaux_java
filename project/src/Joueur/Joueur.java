package Joueur;
public class Joueur {
	private int nbOr;
	private int unites;
	private String name;
	private int nbPersonnage;
	
	public Joueur(int nbPersonnage, int nbOr, String name, int unites) {
		super();
		this.setNbOr(nbOr);
		this.setUnites(unites);
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
	public void setNbOr(int nbOr) {
		this.nbOr = nbOr;
	}
	public int getUnites() {
		return unites;
	}
	public void setUnites(int unites) {
		this.unites = unites;
	}


}
