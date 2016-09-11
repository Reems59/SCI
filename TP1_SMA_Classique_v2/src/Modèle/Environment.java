/**
 * Création de l'environnement contenant nos particules (Agent). Il peut être torique ou non.
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */

package Mod�le;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Environment {


	//Tableau d'agents
	private Agent agents[][];
	private ArrayList<Agent> listAgents;

	public Environment(){
		agents = new Agent[Parameters.gridSizeX][Parameters.gridSizeY];
		listAgents = new ArrayList<Agent>();
		fillAgents();
	}

	public Agent[][] getAgents() {
		return agents;
	}
	public void fillAgents(){
		ArrayList<int[]> directions = Parameters.directions;
		Collections.shuffle(directions);

		for(int k = 0; k< Parameters.nbParticles; k++){
			int x = (int) (Math.random() * Parameters.gridSizeX);
			int y = (int) (Math.random() * Parameters.gridSizeY);
			while(agents[x][y] != null){
				x =(int) (Math.random() * Parameters.gridSizeX);
				y = (int) (Math.random() * Parameters.gridSizeY);
			}
			agents[x][y] = new Agent(directions.get(0),new Color((float)Math.random(),
					(float)Math.random(),(float)Math.random()), new Pair(x, y));
			listAgents.add(agents[x][y]);
			Collections.shuffle(directions);
		}
	}

	public ArrayList<Agent> getListAgents() {
		return listAgents;
	}
	


}

//public Environment(Agent[][] agents
/*Fonctions*/

/*SETTERS ET GETTERS*/

