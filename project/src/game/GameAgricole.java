package game;

import java.util.Random;
import Joueur.*;

import actions.Action;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import personnages.Ouvrier;
import actions.*;
import plateaux.Plateau;
import plateaux.PlateauAgricole;
import plateaux.PlateauGuerre;

public class GameAgricole  {
	protected JoueurAgricole joueur1; 
	protected JoueurAgricole joueur2;
	protected PlateauAgricole plateau;
	public GameAgricole(PlateauAgricole p,JoueurAgricole j1, JoueurAgricole j2) {
		this.joueur1 = j1;
		this.joueur2 = j2;
		this.plateau=p;
	}
	public void playOneRound(JoueurAgricole j) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {

		try{
			this.executeActionAlea(j);
			RecolterAgricole R=new RecolterAgricole(this.plateau);
			Remunere N=new Remunere(this.plateau);
			R.execute(j);
			System.out.println(j.getName()+" a recolter ");
			N.execute(j);
			System.out.println(j.getName()+" a remun ");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

	public void executeActionAlea(JoueurAgricole j) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		Random r=new Random();
		int a=r.nextInt(3);
		if(a==0) {
			DeployerAgricole d=new DeployerAgricole(this.plateau);
			int y=r.nextInt(this.plateau.getHauteur());
			int x=r.nextInt(this.plateau.getLargeur());
			while(!this.plateau.getTuile(y, x).isFree()) {
				y=r.nextInt(this.plateau.getHauteur());
				x=r.nextInt(this.plateau.getLargeur());
			}
			d.execute(j, y, x, new Ouvrier(1));
			System.out.println(j.getName()+" a deployer ");
		}
		else if(a==1) {
			EchangeRessources E = new EchangeRessources((PlateauAgricole) this.plateau);
			E.execute(j);
			System.out.println(j.getName()+" a echange ses ressources ");
		}
		else{
			NeRienFaireAgricole n=new NeRienFaireAgricole(this.plateau);
			n.execute(j);
			System.out.println(j.getName()+" n'a rien fait ");
		}

	}
	public void play() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException{
		int nbTours =0;
		while( !this.plateau.AllTileNotFree() & nbTours <6) {
			this.playOneRound(this.joueur1);
			this.playOneRound(this.joueur2);
			nbTours+=1;
			System.out.println("nb tours: "+nbTours);
		}
		System.out.println(this.joueur1.getName()+" a: "+this.comulPointsPers(this.joueur1)+" pieces d or");
		System.out.println(this.joueur2.getName()+" a: "+this.comulPointsPers(this.joueur2)+" pieces d or");
		System.out.println("le gagnant est: "+this.Gagnant(this.joueur1,this.joueur2).getName());
	}
	public int comulPointsPers(JoueurAgricole j) {
		int res=0;
		for(int x=0;x<this.plateau.getLargeur();x++){
			for (int y=0;y<this.plateau.getHauteur();y++) {
				if(this.plateau.getTuile(y, x).hasProprietaire()&this.plateau.getTuile(y, x).getProprietaire()==j) {
					res+=this.plateau.getTuile(y, x).getPeresonnage().getNbOr();
				}
			}
		}
		return res;
	}
	
	public JoueurAgricole Gagnant(JoueurAgricole j1,JoueurAgricole j2) {
		JoueurAgricole g;
		int c1=this.comulPointsPers(j1);
		int c2=this.comulPointsPers(j2);
		if(c1>c2) {
			g=j1;
		}
		else {
			g=j2;
		}
		return g;
	}

}
