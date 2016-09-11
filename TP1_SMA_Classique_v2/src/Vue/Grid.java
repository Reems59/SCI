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

class Grid extends JPanel implements Observer {
	int width, height, rows, columns;

	public Grid() {
		setSize(Parameters.canvasSizeX, Parameters.canvasSizeY);
		rows = Parameters.gridSizeX;
		columns = Parameters.gridSizeY;
	}
	public void update(Observable o, Object arg) {
		Agent[][] e = ((SMA)o).getEnvironment().getAgents();
		if(o instanceof SMA){
			Graphics g = (Graphics)arg;
			int k,j;
			width = getSize().width;
			height = getSize().height;

			int htOfRow = height / (rows);
			for (k = 0; k < rows; k++)
				g.drawLine(0, k * htOfRow/*Parameters.boxSize */, width, k * htOfRow/*Parameters.boxSize*/);

			int wdOfRow = width / (columns);
			for (k = 0; k < columns; k++)
				g.drawLine(k*htOfRow/*Parameters.boxSize*/ , 0, k*htOfRow/*Parameters.boxSize*/ , height);

			//g.drawOval(4*htOfRow +5, 4*wdOfRow+5, 40, 40);
			for(k = 0; k< e[0].length; k++)
				for(j = 0; j< e[1].length; j++)
					if(e[k][j] != null){
						g.setColor(Color.blue);
						g.fillOval(4*htOfRow +5, 4*wdOfRow+5, 40, 40);
					}

		}
	}

}