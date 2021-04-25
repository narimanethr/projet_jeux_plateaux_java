package plateaux;

import tuiles.Tuile;

public interface Plateau {
	public int getNbTuiles();

	public Tuile getTuile(int y,int x);
	public int getHauteur();

	public int getLargeur();

	public String toString();

}
