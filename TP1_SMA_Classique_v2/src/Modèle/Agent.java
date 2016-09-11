/**
 * CrÃ©ation des diffÃ©rentes particules.
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */
package Modèle;

import java.awt.Color;

public class Agent {
	/*Variables*/
	private int[] direction = new int[2];
	private Pair p;
	private Color color ;
	void update(){

		p.setX(p.getX() + direction[0]);
		p.setY(p.getY() + direction[1]);
	}

	public Agent(int[] state, Color c, Pair pair){
		this.direction = state;
		this.color = c;
		this.p = pair;
	}
	//refaire la méthode pour mettre une listes de 3 agents (l'un est la futur case en fonction de la direction et
	//l'autre est la case qui peut aller si il tape un mur ou une bille pour tester si il y a une bille et l'opposé

	public void decide(Agent[] voisins){
		Pair coordAgent = p;
		if(voisins[0].getDirection() == Parameters.mur)
			if(voisins[1].getDirection() == Parameters.vide){
				move_inverse(voisins[0].getDirection());
				update();
			}else{
				move_inverse(voisins[0].getDirection());
				echange_direction();
			}
		else if(voisins[0].getDirection() == Parameters.vide){
			update();
		}
		else 
			echange_direction();
			if(voisins[1].getDirection() == Parameters.vide){
				update();
			}else{
				echange_direction();
		}

	}


	public Pair getP() {
		return p;
	}

	public Color getColor() {
		return color;
	}

	protected int[] getDirection() {
		// TODO Auto-generated method stub
		return direction;
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
		int state2 = direction[0];
		direction[0] = direction[1];
		direction[1] = state2;
	}
	protected void move_inverse(int[] direction) {
		if(direction[0] == 1){
			direction[0] = -1;
		}else if (direction[0] == -1){
			direction[0] = 1;
		}
		if(direction[1] == 1){
			direction[1] = -1;
		}else if (direction[1] == -1){
			direction[1] = 1;
		}
	}

}
