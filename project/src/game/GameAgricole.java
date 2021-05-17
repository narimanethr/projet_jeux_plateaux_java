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


/*GameAgricole class  */
public class GameAgricole extends Game    {
	protected JoueurAgricole joueur1; // player 1
	protected JoueurAgricole joueur2;// player 2
	protected PlateauAgricole plateau;
	/* set's GameAgricole
	 * @param p PlateauAgricole
	 * @param j1 JoueurAgricole
	 * @param j2 JoueurAgricole
	 * 
	 */
	public GameAgricole(PlateauGuerre p, JoueurGuerre j1, JoueurGuerre j2, JoueurAgricole joueur1,
			JoueurAgricole joueur2, PlateauAgricole plateau) {
		super(p, j1, j2);
		this.joueur1 = joueur1;
		this.joueur2 = joueur2;
		this.plateau = plateau;
	}
	

	
	/* play's one round 
	 * @param j JoueurAgricole
	 * 
	 * 
	 */
	public void playOneRound(JoueurAgricole j) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
		this.executeActionAlea(j);
		RecolterAgricole R=new RecolterAgricole(this.plateau);
		Remunere N=new Remunere(this.plateau);
		R.execute(j);
		System.out.println(j.getName()+" a recolter ");
		N.execute(j);
		System.out.println(j.getName()+" a remun ");
	}



	
	


	public void playOneRound(Joueur j) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {

		try{
			this.executeActionAlea((JoueurAgricole) j);
			RecolterAgricole R=new RecolterAgricole(this.plateau);
			Remunere N=new Remunere((PlateauAgricole) this.plateau);
			R.execute((JoueurAgricole) j);
			System.out.println(j.getName()+" a recolter ");
			N.execute((JoueurAgricole) j);
			System.out.println(j.getName()+" a remun ");
		}
		catch(Exception e) {
			System.out.println(e);
		}


	}
	/*Execut's a random action 
	 * @param j JoueurAgricole
	 * 
	 */

	public void executeActionAlea(Joueur j) throws RangeOutOfCapacityTileException, NoteFreeTileException, StockEmptyException {
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
			E.execute((JoueurAgricole) j);
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
		System.out.println(this.joueur1.getName()+" a: "+this.comulPointsPers((JoueurAgricole) this.joueur1)+" pieces d or");
		System.out.println(this.joueur2.getName()+" a: "+this.comulPointsPers((JoueurAgricole) this.joueur2)+" pieces d or");
		System.out.println("le gagnant est: "+this.Gagnant((JoueurAgricole)this.joueur1,(JoueurAgricole)this.joueur2).getName());
	}
	/* return's the winner of the game 
	 * @param j1 , player 1
	 * @param j2 , player 2
	 * @return g, the winner 
	 * 
	 */
	
	public Joueur Gagnant(Joueur j1,Joueur j2) {
		Joueur g;
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
