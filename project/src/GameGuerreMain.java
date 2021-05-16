import Joueur.JoueurGuerre;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import game.GameGuerre;
import plateaux.PlateauGuerre;

public class GameGuerreMain {

	public static void main(String[] args) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
	
		PlateauGuerre p1 = new PlateauGuerre(10,5);
		JoueurGuerre j1=new JoueurGuerre("j1");
		JoueurGuerre j2=new JoueurGuerre("j2");
		System.out.println(j1.getNbOr());
		System.out.println(j2.getNbOr());
		GameGuerre game =new GameGuerre(p1,j1,j2);
		game.play();
		
	}

}
