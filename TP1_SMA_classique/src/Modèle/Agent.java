/**
 * Création des différentes particules.
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */
package Modèle;

public class Agent {
	/*Variables*/
	private int[] state = new int[2];
	
	void update(){
		
	}
	
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
	//regarde les cotés des voisins et modifier son pasX ou son pasY
	}
	
	
}
