/**
 * Creation des differentes particules.
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */
package Modèle;

import java.awt.Color;
import java.util.Random;

public class Agent {
	/*Variables*/
	private int x,y;
	private Environment env;
	private Color col;
	private int[] state = new int[2];
	
	/*Creation de notre bille à une position aleatoire*/
	Agent(){
		//Positions et couleurs aleatoires dans notre environnement
		Random rand = new Random();
		this.x = rand.nextInt(env.getGridSizeX());
		this.y = rand.nextInt(env.getGridSizeY());
		this.col = randCol();
	}
	
	/*On update la position de notre bille suite au decide*/
	void update(){
		
	}
	
	/*Decision de mouvement par rapport a differentes donnees*/
	void decide(Agent[] voisins){
		for(int i=0; i<8; i++){
			if(state == Constantes.directions.get(i)){
				if(voisins[i].getState() == Constantes.mur)
					if(voisins[i+4].getState() == Constantes.vide)
						move_inverse();
				else if(voisins[i+4].getState() == Constantes.vide)
					move_haut();
				else
					if(voisins[i+4].getState() != Constantes.vide)
						echange_direction();
			}
		}
		
	}
	
	private int[] getState() {
		// TODO Auto-generated method stub
		return state;
	}

	/*Ajout de la couleur a notre bille*/
	private Color randCol(){
		Random rand = new Random();
		Color randomCol = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
		return randomCol;
	}
	
	
	
	
	/*Actions*/
	/*MOUVEMENTS BASIQUES*/
	
	protected void move_haut() {
		state = Constantes.haut;
	}
	
	protected void move_bas() {
		state = Constantes.bas;
	}
	
	protected void move_gauche() {
		state = Constantes.gauche;
	}
	
	protected void move_droit() {
		state = Constantes.droite;
	}
		/*MOUVEMENTS DIAGONAUX*/
	protected void move_diag_haut_droite() {
		state = Constantes.diag_haut_droite;
	}
	
	protected void move_diag_haut_gauche() {
		state = Constantes.diag_haut_gauche;
	}
	
	protected void move_diag_bas_droite() {
		state = Constantes.diag_bas_droite;
	}
	
	protected void move_diag_bas_gauche() {
		state = Constantes.diag_bas_gauche;
	}
	
	protected void echange_direction() {
		int state2 = state[0];
		state[0] = state[1];
		state[1] = state2;
	}
	protected void move_inverse() {
	//regarde les cotÃ©s des voisins et modifier son pasX ou son pasY
	}

	
	
	
	
	
	
	/*GETTERS ET SETTERS*/
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}
	
	
}
