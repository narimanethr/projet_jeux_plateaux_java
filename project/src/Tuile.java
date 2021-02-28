import java.util.Random;

public enum Tuile {
	montagne,plaine,desert,foret,ocean;
	
	private static Random random= new Random();
	
	public static Tuile alea(){
        return Tuile.values()[random.nextInt(Tuile.values().length)];
    }
	public Ressource getRessources() {
		Ressource res=null;
		if (this==montagne) {
			res= Ressource.roches;
		}
		else if (this==desert) {
			res= Ressource.sable;
			
		}
		else if (this==foret) {
			res= Ressource.bois;
			
		}
		else if (this==plaine) {
			res= Ressource.ble;
			
		}
		return res;
		
	}

}
