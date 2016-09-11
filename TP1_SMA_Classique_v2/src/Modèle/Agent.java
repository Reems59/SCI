/**
 * Création des différentes particules.
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */
package Mod�le;

import java.awt.Color;

public class Agent {
	/*Variables*/
	private int[] state = new int[2];
	private Color c ;
	void update(Pair p){
		
		p.setX(p.getX() + state[0]);
		p.setY(p.getY() + state[1]);
	}

	public Agent(int[] state, Color c){
		this.state = state;
		this.c = c;
	}
	Pair decide(Agent[] voisins, Pair p){
		Pair coordAgent = p;
		for(int i=0; i<8; i++){
			if(state == Parameters.directions.get(i)){
				if(voisins[i].getState() == Parameters.mur)
					if(voisins[i+4].getState() == Parameters.vide){
						move_inverse(Parameters.directions.get(i));
						update(coordAgent);
					}else{
						move_inverse(Parameters.directions.get(i));
					}
				else if(voisins[i].getState() == Parameters.vide){
					update(coordAgent);
				}
				else 
					echange_direction();
				if(voisins[i+4].getState() == Parameters.vide){
					update(coordAgent);
				}
				break;
			}

		}
		return coordAgent;

	}

	private int[] getState() {
		// TODO Auto-generated method stub
		return state;
	}

	/*Actions*/
	/*MOUVEMENTS BASIQUES

	protected void move_haut() {
		state = Parameters.haut;
	}

	protected void move_bas() {
		state = Parameters.bas;
	}

	protected void move_gauche() {
		state = Parameters.gauche;
	}

	protected void move_droit() {
		state = Parameters.droite;
	}
	 */
	/*MOUVEMENTS DIAGONAUX
	protected void move_diag_haut_droite() {
		state = Parameters.diag_haut_droite;
	}

	protected void move_diag_haut_gauche() {
		state = Parameters.diag_haut_gauche;
	}

	protected void move_diag_bas_droite() {
		state = Parameters.diag_bas_droite;
	}

	protected void move_diag_bas_gauche() {
		state = Parameters.diag_bas_gauche;
	}
	 */
	protected void echange_direction() {
		int state2 = state[0];
		state[0] = state[1];
		state[1] = state2;
	}
	protected void move_inverse(int[] direction) {
		if(direction[0] == 1){
			state[0] = -1;
		}else if (direction[0] == -1){
			state[0] = 1;
		}
		if(direction[1] == 1){
			state[1] = -1;
		}else if (direction[1] == -1){
			state[1] = 1;
		}
	}

}
