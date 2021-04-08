package tuiles;
import ressources.Ressources;
public class Foret extends Tuile {

	public Foret(Ressources res,int cap,int y,int x) {
		super(res,cap,y,x);
		this.name="foret";
		this.bonus=4;
		this.cout=1;
	}

}
