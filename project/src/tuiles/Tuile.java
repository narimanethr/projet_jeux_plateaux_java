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
	/* Creates a new  Tile with Ressources res,a  capacity cap ,horizontal and vertical coordinates x and y 
	 * @param res Ressources  , the ressources of the tile 
	 * @param cap the capacity of the tile 
	 * @param y the vertical coordinate of the tile 
	 * @param x the horizontal  coordinate of the tile 
	 * 
	 */
	public Tuile(Ressources res,int cap,int y,int x) {
		this.name = "";
		this.res = res;
		this.capacite=cap;
		this.position[0]=y;
		this.position[1]=x;
		this.proprietaire=null;
		this.peresonnage=null;
	}
	/*return's the Ressources of the tile 
	 * @return res ,the  Ressources of the tile
	 * 
	 */
	
	public Ressources getRes() {
		return res;
	}
	/*return's the name of the tile 
	 * @return name ,the  name of the tile
	 * 
	 */

	public String getName() {
		return name;
	}
	/*Set's the Ressources of the tile 
	 * @param  name  ,the name  of the tile that we want to replace 
	 * 
	 */

	public void setName(String name) {
		this.name = name;
	}
	/*return's the owner  of the tile 
	 * @return proprietaire ,the  owner  of the tile
	 * 
	 */
	public Joueur getProprietaire() {
		return this.proprietaire;
	}
	/*Set's the owner  of the tile 
	 * @param j ,Joueur  ,the  owner  of the tile that we want to replace 
	 * 
	 */
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
	 * @return cout , cost of the tile 
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
	/*Check's if the tile has an owner , false if there  is not an owner or true instead 
	 * @return True if there is an owner or false instead 
	 * 
	 */
    public boolean hasProprietaire() {
    	return this.proprietaire!=null;
    }
    /*Check's if the tile has  ressources  , false if there  is no ressources  or true instead 
	 * @return True if there is an owner or false instead 
	 * 
	 */
    public boolean hasRessources() {
    	return this.res !=null;
    	}

	
}