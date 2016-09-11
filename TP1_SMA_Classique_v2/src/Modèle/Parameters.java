package Modèle;

import java.util.ArrayList;

public class Parameters {
	public static int equitable = 1;
	public static int sequentielle = 2;
	public static int aléatoire = 3;
	
	public static  int[] mur = {0,0};
	public static  int[] vide = {2,2};
	public static  int[] droite = {1,0};
	public static  int[] gauche = {-1,0};
	public static  int[] haut = {0,-1};
	public static  int[] bas = {0,1};
	public static  int[] diag_haut_droite = {1,-1};
	public static  int[] diag_haut_gauche = {-1,-1};
	public static  int[] diag_bas_droite = {1,1};
	public static  int[] diag_bas_gauche = {-1,1};
	
	public static boolean torique = false;
	public static final int gridSizeX = 10;
	public static final int gridSizeY = 10;
	public static final int canvasSizeX = 500;
	public static final int canvasSizeY = 500;
	public static final int boxSize = 50;
	public static final int delay = 20;
	public static final int scheduling = equitable;
	public static final int nbTicks = 20;
	public static final boolean grid = true;
	public static final boolean trace = true;
	public static final int seed = 0;
	public static final int refresh = 2;
	public static final int nbParticles = 5 ;


	
	public static ArrayList<int[]> directions = new ArrayList<int[]>();
	static{
	directions.add(diag_haut_gauche);
	directions.add(haut);
	directions.add(diag_haut_droite);
	directions.add(droite);
	directions.add(diag_bas_droite);
	directions.add(bas);
	directions.add(diag_bas_gauche);
	directions.add(gauche);
	
	}
}
