package tuiles;
import ressources.Ressources;

public class Plaine extends Tuile {

	public Plaine(Ressources res,int cap,int y,int x) {
		super(res,cap,y,x);
		this.name="plaine";
		this.bonus=1;
		this.cout=1;
	}

}

