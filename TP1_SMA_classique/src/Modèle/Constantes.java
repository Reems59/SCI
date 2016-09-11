package Modèle;

import java.util.ArrayList;

public class Constantes {
	public static  int[] mur = {0,0};
	public static  int[] vide = {2,2};
	public static  int[] droite = {1,0};
	public static  int[] gauche = {-1,0};
	public static  int[] haut = {0,1};
	public static  int[] bas = {0,-1};
	public static  int[] diag_haut_droite = {1,1};
	public static  int[] diag_haut_gauche = {-1,1};
	public static  int[] diag_bas_droite = {1,-1};
	public static  int[] diag_bas_gauche = {-1,-1};
	
	
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
