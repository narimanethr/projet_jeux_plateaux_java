package ressources.guerre;

import ressources.Ressources;

public abstract class RessourceGuerre implements Ressources {
	protected int unite;
	public RessourceGuerre() {
		this.unite=0;
	}
	public int getPieces() {
		return this.unite;
	}
}
