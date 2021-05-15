package game;

import java.util.Random;
import Joueur.*;
import Joueur.JoueurGuerre;
import actions.Action;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import personnages.Armee;
import actions.*;
import plateaux.PlateauGuerre;

public class Game {
	protected JoueurGuerre joueur1; 
	protected JoueurGuerre joueur2;
	protected PlateauGuerre plateau;
	public Game(PlateauGuerre p,JoueurGuerre j1, JoueurGuerre j2) {
		this.joueur1 = j1;
		this.joueur2 = j2;
		this.plateau=p;
	}
	public void playOneRound(JoueurGuerre j) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		try {
			this.executeActionAlea(j);
			RecolterGuerre R=new RecolterGuerre(this.plateau);
			Nourir N=new Nourir(this.plateau);
			R.execute(j);
			System.out.println(j.getName()+" a recolter ");
			N.execute(j);
			System.out.println(j.getName()+" a nouri ");
		}
		catch (Exception e){
			System.out.println(e);
		}
		
	}

	public void executeActionAlea(JoueurGuerre j) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		Random r=new Random();
		int a=r.nextInt(2);
		
		if(a==0) {
			   DeployerGuerre d=new DeployerGuerre(this.plateau);
			   int armSize=r.nextInt(5)+1;
			   int y=r.nextInt(this.plateau.getHauteur());
			   int x=r.nextInt(this.plateau.getLargeur());
			  
			   d.execute(j, y, x,new Armee(armSize));
			   System.out.println(j.getName()+" a deployer ");
		}
		else {
			NeRienFaire n=new NeRienFaire(this.plateau);
			n.execute(j);
			System.out.println(j.getName()+" n'a rien fait ");
		}

	}
	public void play() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		int nbTours =0;
		while( !this.plateau.AllTileNotFree() & nbTours <10) {
			this.playOneRound(this.joueur1);
			this.playOneRound(this.joueur2);
			nbTours+=1;
			System.out.println("nb tours: "+nbTours);
			
		}
		System.out.println(this.gagnant(this.joueur2, this.joueur1));
		
	}
	public String gagnant(JoueurGuerre j1,JoueurGuerre j2) {
		String res="";
		int i1=j1.getNbOr();
		int i2=j2.getNbOr();
		if(i1==i2) {
			res="�galit� entre "+j1.getName()+" et "+j2.getName();
		}
		else if(i1>i2) {
			res="le joueur "+j1.getName()+" a gagn�!";
		}
		else {
			res="le joueur "+j2.getName()+" a gagn�!";
		}
		
		return res;
	}


}
