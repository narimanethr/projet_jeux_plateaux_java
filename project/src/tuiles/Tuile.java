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
	/* return's the capacity 
	 * @return capacite 
	 * 
	 */

	public int getCapacite() {
		return capacite;
	}
	/* return's the cost
	 * @return cout 
	 * 
	 */

	public int getCout() {
		return cout;
	}
	/* Check's the tile is free  
	 * @return true if there is a owner or false instead .
	 * 
	 */
	public boolean isFree() {
		return this.proprietaire==null;
	}
	/* return's the Character 
	 * @return personnage 
	 * 
	 */
	

	public Personnage getPeresonnage() {
		return this.peresonnage;
	}
	/* Set's the Character 
	 * @param p a character
	 * 
	 */
	
	public void setPersonnage(Personnage p) {
		this.peresonnage=p;
	}
    public boolean hasProprietaire() {
    	return this.proprietaire!=null;
    }

	
}