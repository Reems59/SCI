package Vue;
import java.awt.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Modèle.Agent;
import Modèle.Environment;
import Modèle.Parameters;
import Modèle.SMA;

class Grid extends JPanel  {
	private int width, height, rows, columns;
	private Environment env;
	public Grid(Environment e) {
		env = e;
		setSize(Parameters.boxSize * Parameters.gridSizeX, Parameters.boxSize * Parameters.gridSizeY);
		rows = Parameters.gridSizeX;
		columns = Parameters.gridSizeY;
	}
	public void paintComponent(Graphics g) {
		Agent[][] e = env.getAgents();

		int k,j;
		width = getSize().width;
		height = getSize().height;

		int htOfRow = height / (rows);
		for (k = 0; k <= rows; k++)
			g.drawLine(0, k * Parameters.boxSize , Parameters.boxSize*rows, k * Parameters.boxSize);

		int wdOfRow = width / (columns);
		for (k = 0; k <= columns; k++)
			g.drawLine(k*Parameters.boxSize , 0, k*Parameters.boxSize , Parameters.boxSize*columns);

		//g.drawOval(4*htOfRow +5, 4*wdOfRow+5, 40, 40);
		for(k = 0; k< e[0].length; k++)
			for(j = 0; j< e[1].length; j++)
				if(e[k][j] != null){
					g.setColor(e[k][j].getColor());
					g.fillOval(k*Parameters.boxSize +3, j*Parameters.boxSize+3, Parameters.boxSize-5, Parameters.boxSize-5);
				}

	}
}

