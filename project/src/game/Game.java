package game;

import java.util.Random;
import Joueur.*;
import actions.Action;
import exception.NoteFreeTileException;
import exception.RangeOutOfCapacityTileException;
import exception.StockEmptyException;
import personnages.Armee;
import actions.*;
import plateaux.Plateau;
import plateaux.PlateauAgricole;
import plateaux.PlateauGuerre;

public abstract class Game {
	protected Joueur joueur1; 
	protected Joueur joueur2;
	protected Plateau plateau;
	public Game(Plateau p,Joueur j1, Joueur j2) {
		this.joueur1 = j1;
		this.joueur2 = j2;
		this.plateau=p;
	}
	public void playOneRound(Joueur j) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		try {
			this.executeActionAlea((JoueurGuerre) j);
			RecolterGuerre R=new RecolterGuerre(this.plateau);
			Nourir N=new Nourir((PlateauGuerre) this.plateau);
			R.execute((JoueurGuerre) j);
			System.out.println(j.getName()+" a recolter ");
			N.execute((JoueurGuerre) j);
			System.out.println(j.getName()+" a nouri ");
		}
		catch (Exception e){
			System.out.println(e);
		}
		
	}

	public void executeActionAlea(Joueur j) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		Random r=new Random();
		int a=r.nextInt(2);

		if(a==0) {
			DeployerGuerre d=new DeployerGuerre(this.plateau);
			int armSize=r.nextInt(5)+1;
			int y=r.nextInt(this.plateau.getHauteur());
			int x=r.nextInt(this.plateau.getLargeur());
			while(!this.plateau.getTuile(y, x).isFree()) {
				y=r.nextInt(this.plateau.getHauteur());
				x=r.nextInt(this.plateau.getLargeur());
			}
			while(armSize >this.plateau.getTuile(y,x).getCapacite()) {
				armSize=r.nextInt(5)+1;
			}
			d.execute(j, y, x,new Armee(armSize));
			System.out.println(j.getName()+" a deployer ");
		}
		else {
			NeRienFaire n=new NeRienFaire(this.plateau);
			n.execute((JoueurGuerre) j);
			System.out.println(j.getName()+" n'a rien fait ");
		}

	}
	public void play() throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		int nbTours =0;
		while( !(this.plateau).AllTileNotFree() & nbTours <10 && !this.joueur1.StockEmpty()&& !this.joueur2.StockEmpty()) {
			this.playOneRound(this.joueur1);
			this.playOneRound(this.joueur2);
			nbTours+=1;
			System.out.println("nb tours: "+nbTours);

		}
		System.out.println(this.joueur1.getName()+" a: "+this.pointsTotal(this.joueur1)+" pieces d or");
		System.out.println(this.joueur2.getName()+" a: "+this.pointsTotal(this.joueur2)+" pieces d or");
		System.out.println("le gagnant est: "+this.Gagnant(this.joueur1,this.joueur2).getName());
	}
	public int comulPointsPers(Joueur j) {
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
	public int pointsTotal(Joueur j) {
		int res=this.comulPointsPers(j)+this.cumulBonus(j)+j.getNbOr();
		return res;
		
	}
	
	public Joueur Gagnant(Joueur j1,Joueur j2) {
		Joueur g;
		int c1=this.comulPointsPers(j1)+this.cumulBonus(j1)+j1.getNbOr();
		int c2=this.comulPointsPers(j2)+this.cumulBonus(j2)+j2.getNbOr();
		if(c1>c2) {
			g=j1;
		}
		else {
			g=j2;
		}
		return g;
	}
	public int cumulBonus(Joueur j) {
		int res =0;
		int nbTerritoires =0; 
		for(int x=0;x<this.plateau.getLargeur();x++){
			for (int y=0;y<this.plateau.getHauteur();y++) {
				if(this.plateau.getTuile(y, x).hasProprietaire()&this.plateau.getTuile(y, x).getProprietaire()==j) {
					nbTerritoires+=1;
					res+=this.plateau.getTuile(y, x).getBonus();
				}
			}
		}
		if(nbTerritoires>=10) {
			res+=5;
		}
		return res;
	}
}
