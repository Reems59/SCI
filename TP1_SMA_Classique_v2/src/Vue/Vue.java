/**
 * Visualisation du plateau (Correspondant Ã  notre VUE)
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */
package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Modèle.SMA;

public class Vue extends JFrame implements Observer{
	private static final long serialVersionUID = 1L;
	private Grid grid;

	public Vue(){
		
		grid = new Grid();
		setTitle("grille de billes");
		getContentPane().add(grid);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		pack();
		setVisible(true);
	}
	public void update(Observable o, Object arg) {
		if(o instanceof SMA)
			grid.update(o, getGraphics());
	}

}