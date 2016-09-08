/**
 * Création de l'environnement contenant nos particules (Agent). Il peut être torique ou non.
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */

package Modèle;

public class Environment {

	/*Variables*/
	int gridSizeX, gridSizeY;
	int canvasSizeX, canvasSizeY;
	int boxSize;
	int delay;
	int scheduling;
	int nbTicks;
	boolean grid;
	boolean trace;
	int seed;
	int refresh;
	int nbParticles;
	//Tableaux 2D
	private int Agent[][];
	
	/*Fonctions*/
	
	/*SETTERS ET GETTERS*/
	public void setGridSizeX(int gridSizeX) {
		this.gridSizeX = gridSizeX;
	}
	
	public void setGridSizeY(int gridSizeY) {
		this.gridSizeY = gridSizeY;
	}
	
	public int getGridSizeX() {
		return gridSizeX;
	}
	
	public int getGridSizeY() {
		return gridSizeY;
	}
	
	public void setNbParticles(int nbParticles) {
		this.nbParticles = nbParticles;
	}
	
	public int getNbParticles() {
		return nbParticles;
	}
}
