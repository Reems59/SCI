/**
 * Création de l'environnement contenant nos particules (Agent). Il peut être torique ou non.
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */

package Mod�le;

public class Environment {


	//Tableau d'agents
	private Agent agents[][];

	public Environment(){
		agents = new Agent[Parameters.gridSizeX][Parameters.gridSizeY];
		fillAgents();
	}

	public Agent[][] getAgents() {
		return agents;
	}
	public void fillAgents(){
		for(int k = 0; k< Parameters.nbParticles; k++){
			
		}
	}
}

//public Environment(Agent[][] agents
/*Fonctions*/

/*SETTERS ET GETTERS*/

