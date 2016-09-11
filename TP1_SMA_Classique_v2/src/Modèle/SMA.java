/**
 * Tour de parole pris en compte. (Correspondant Ã  notre MODELE)
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */
package Modèle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Observable;

import Vue.Vue;

public class SMA extends Observable{

	protected Environment environment;
	protected Vue v;

	public SMA(){
		environment =  new Environment();
		v = new Vue(environment);
		this.addObserver(v);
	}
	void run(){
		if(Parameters.nbTicks == 0)
			infiniteLoop();
		else
			loop();
	}

	public void infiniteLoop(){
		while(true){
			mainLoop();
		}
	}
	public void loop(){
		int i = 0; 
		while(i < Parameters.nbTicks){
			mainLoop();
		}
	}
	public void mainLoop(){
		ArrayList<Agent> listAgents = environment.getListAgents();
		Collections.shuffle(listAgents);
		for(int i=0; i < listAgents.size(); i++){
			Agent agent = listAgents.get(i);
			// agent 1 : recuperer le voisin de la direction de l'agent 
			// recuperer la case si il y a mur sur agent 1  ou bille

			Pair p = agent.getP();
			Agent[] voisins = null;
			if(p.getX() + agent.getDirection()[0] >= Parameters.gridSizeX || p.getY() + agent.getDirection()[0] >= Parameters.gridSizeY){
				voisins[0] = new Agent(new int[]{0, 0}, null, null);
				//prendre le voisin qui est au sens inverse (pas opposé appart pour des sens à 90°) 
				//voisins[1] = agent[agent.getP().getX() + ] *********
			}else{
				Pair p1 = new Pair(p.getX() + agent.getDirection()[0], p.getY() + agent.getDirection()[1]);
				voisins[0] = environment.getAgents()[p1.getX()][p1.getY()];
				if(voisins[0] == null){
					voisins[1] = null;
				}else{
					voisins[1] = voisins[0];
				}

			}
			agent.decide(voisins);
			setChanged();
			notifyObservers();

		}
	}
	public Environment getEnvironment() {
		return environment;
	}

}
