package ressources.guerre;

public abstract class RessourceGuerre {
	protected int unite;
	public RessourceGuerre() {
		this.unite=0;
	}
	public int getPieces() {
		return this.unite;
	}
}
