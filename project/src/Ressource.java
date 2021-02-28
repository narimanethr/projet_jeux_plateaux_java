
public enum Ressource {
	sable, ble, roches, bois;
 
	public int getPieces() {
		int res = 0;
		if(this==sable) {
			res=5;
		}
		else if(this==bois || this==ble) {
			res= 2;
		}
		else if(this==roches) {
			res= 8;
		}
		return res;
	}
}
