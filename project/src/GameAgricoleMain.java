import Joueur.JoueurAgricole;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import game.GameAgricole;
import plateaux.PlateauAgricole;


public class GameAgricoleMain {
	

	public static void main(String[] args) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		String name1 =args[0];
		String name2 =args[1];
		PlateauAgricole p1 = new PlateauAgricole(10,5);
		JoueurAgricole j1=new JoueurAgricole(name1);
		JoueurAgricole j2=new JoueurAgricole(name2);
		GameAgricole game =new GameAgricole(p1,j1,j2);
		game.play();

	}

}