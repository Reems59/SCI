/**
 * Tour de parole pris en compte. (Correspondant à notre MODELE)
 * @author Kroll Remi & Lescieux Yohann
 * @version 1.0
 */
package Mod�le;

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
		

	}
	public Environment getEnvironment() {
		return environment;
	}
	
}
