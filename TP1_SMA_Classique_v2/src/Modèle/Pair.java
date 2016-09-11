package Modèle;
/**
 * Pair est un objet représentant un couple de int
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */
public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
    
}