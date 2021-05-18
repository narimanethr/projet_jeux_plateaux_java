package tuiles;
import Joueur.Joueur;
import personnages.Personnage;
import ressources.Ressources;
import ressources.agricole.RessourceAgricole;

public abstract class Tuile {
	protected Joueur proprietaire;
	
	protected int bonus;
	protected String name;
	protected int capacite;
	protected int cout;
	protected Personnage peresonnage;
	protected int [] position=new int[2];
	protected Ressources res;
	public Tuile(Ressources res,int cap,int y,int x) {
		this.name = "";
		this.res = res;
		this.capacite=cap;
		this.position[0]=y;
		this.position[1]=x;
		this.proprietaire=null;
		this.peresonnage=null;
	}
	
	/**
	 * return ressource of tile
	 * @return res 
	 */
	public Ressources getRes() {
		return res;
	}
/**
 * return the name of the tile
 * @return name 
 */
	public String getName() {
		return name;
	}
/**
 * set the name of tile
 * @param name the name to replace 
 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * return the owner of the tile
	 * @return proprietaire the owner  
	 */
	public Joueur getProprietaire() {
		return this.proprietaire;
	}
	/**
	 * set the owner of the tile by j player 
	 * @param j player to replace 
	 */
	public void setProprietaire(Joueur j) {
		this.proprietaire=j;
	}
	
/**
 * return the capacity 
 * @return capacite
 */
	public int getCapacite() {
		return capacite;
	}
	/**
	 * return the cost
	 * @return cout 
	 */

	public int getCout() {
		return cout;
	}
	/**
	 * Check the tile if is free
	 * @return true if there is a owner or false instead
	 */
	public boolean isFree() {
		return this.proprietaire==null;
	}
/**
 * return the Character
 * @return personnage 
 */
	public Personnage getPeresonnage() {
		return this.peresonnage;
	}
	/**
	 * Set the Character
	 * @param p a character
	 */
	
	public void setPersonnage(Personnage p) {
		this.peresonnage=p;
	}
/**
 * return the number of bonus to each tile
 * @return bonus 
 */
    public int getBonus() {
		return this.bonus;
	}

/**
 * return the position of tile
 * @return position 
 */
	public int[] getPosition() {
		return position;
	}
/**
 * check if the tile has an owner 
 * @return true or false 
 */
	public boolean hasProprietaire() {

    	return this.proprietaire!=null;
    }
	/**
	 * check if the tile has a ressources 
	 * @return true or false 
	 */
    public boolean hasRessources() {
    	return this.res !=null;
    	}

	
}