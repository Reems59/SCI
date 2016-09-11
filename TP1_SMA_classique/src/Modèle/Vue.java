/**
 * Visualisation du plateau (Correspondant a notre VUE)
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */
package Modèle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

//public class Vue extends Canvas implements Observer {
public class Vue extends JFrame implements Observer{
	private static final long serialVersionUID = 1L;
	private int taille_case, width_Frame, height_Frame;
	private JFrame frame;
	
	/**
	 * Utilisation de notre JFrame essentiellement
	 * @param width_Frame la largeur de notre frame
	 * @param height_Frame la hauteur de notre frame
	 */
	public Vue(int width_Frame, int height_Frame){
			taille_case = 1;
			//Création de notre frame et dimensions
			frame = new JFrame();
			frame.setTitle("La grille de bille - KROLL & LESCIEUX");
			frame.setPreferredSize(new Dimension((width_Frame*taille_case), (height_Frame*taille_case)));
			
			/*Variables*/
			//ImageIcon grassIcon = new ImageIcon("images/bille.png"); 
			frame.setContentPane(new MyPanel());
			
			
			int gridSizeX = 5;
			int gridSizeY = 5;	
			
			/*Execution*/

			// On crÃ©er la grille
			//JPanel grille = new JPanel(new GridLayout(Environment.getGridSizeX(),Environment.getGridSizeY()));
			//grille.setLayout(new GridLayout(2,2));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
		}
	
	/**
	 * Utilisation d'une JPanel
	 */
	class MyPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g){
	          //draw on g here e.g.
	           g.fillRect(20, 20, 100, 200);
	         }
	}
	
	/**
	 * Mise a jour du terrain
	 */
	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}

}