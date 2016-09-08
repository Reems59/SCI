/**
 * Visualisation du plateau (Correspondant à notre VUE)
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */
package Modèle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Observable;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vue extends JFrame {
	private static final long serialVersionUID = 1L;

	public Vue(){
			super("Les petites billes");
			
			/*Variables*/
			//ImageIcon grassIcon = new ImageIcon("images/bille.png"); 
			JPanel grille = new JPanel();
			int width = 500;
			int height = 500;
			setPreferredSize(new Dimension(width, height));
			
			int gridSizeX = 5;
			int gridSizeY = 5;	
			
			/*Execution*/

			// On créer la grille
			//JPanel grille = new JPanel(new GridLayout(Environment.getGridSizeX(),Environment.getGridSizeY()));
			grille.setLayout(new GridLayout(2,2));
	        
			//JLabel lab = new JLabel();
			//lab.setIcon(grassIcon);
			//grille.add(lab);
			getContentPane().add(grille);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pack();
			setVisible(true);
			go();
		}
	private void go(){
	    for(int i = -50; i < pan.getWidth(); i++){
	      int x = pan.getPosX(), y = pan.getPosY();
	      x++;
	      y++;
	      pan.setPosX(x);
	      pan.setPosY(y);
	      pan.repaint();  
	      try {
	        Thread.sleep(10);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }
	  }      
	
	  public void paintComponent(Graphics g){

		    //On choisit une couleur de fond pour le rectangle

		    g.setColor(Color.white);

		    //On le dessine de sorte qu'il occupe toute la surface

		    g.fillRect(0, 0, this.getWidth(), this.getHeight());

		    //On redéfinit une couleur pour le rond

		    g.setColor(Color.red);

		    //On le dessine aux coordonnées souhaitées

		    g.fillOval(-50, -50, 50, 50);

		  }
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

}