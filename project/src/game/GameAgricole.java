package game;

import java.util.Random;
import Joueur.*;

import actions.Action;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import personnages.Ouvrier;
import actions.*;
import plateaux.PlateauAgricole;
import plateaux.PlateauGuerre;

public class GameAgricole {
	protected JoueurAgricole joueur1; 
	protected JoueurAgricole joueur2;
	protected PlateauAgricole plateau;
	public GameAgricole(PlateauAgricole p,JoueurAgricole j1, JoueurAgricole j2) {
		this.joueur1 = j1;
		this.joueur2 = j2;
		this.plateau=p;
	}
	public void playOneRound(JoueurAgricole j) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		this.executeActionAlea(j);
		RecolterAgricole R=new RecolterAgricole(this.plateau);
		Remunere N=new Remunere(this.plateau);
		R.execute(j);
		System.out.println(j.getName()+" a recolter ");
		N.execute(j);
		System.out.println(j.getName()+" a remun ");
	}

	public void executeActionAlea(JoueurAgricole j) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		Random r=new Random();
		int a=r.nextInt(3);
		int y=r.nextInt(this.plateau.getHauteur());
		int x=r.nextInt(this.plateau.getLargeur());
	
		if(a==0) {
			DeployerAgricole d=new DeployerAgricole(this.plateau);
			d.execute(j, y, x, new Ouvrier(1));
			System.out.println(j.getName()+" a deployer ");
		}
		else if(a==1) {
			EchangeRessources E = new EchangeRessources(this.plateau);
			E.execute(j);
			System.out.println(j.getName()+" a echange ses ressources ");
		}
		else{
			NeRienFaireAgricole n=new NeRienFaireAgricole(this.plateau);
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
		}
		
	}


}
