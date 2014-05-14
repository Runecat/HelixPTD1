package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public class PersistenceHandler implements Serializable {
	
	private Game theGame;
	private String fileName = "save.out";
	
	public PersistenceHandler(Game theGame) {
		
		this.theGame = theGame;
		read();
		
	}
	
	public void write() {
		
		
		try {
			FileOutputStream bytesToDisk = new FileOutputStream(fileName);
			ObjectOutputStream outFile = new ObjectOutputStream

(bytesToDisk);
			outFile.writeObject(this.theGame);
			outFile.close();
		} catch (IOException ioe) {;
		}
	}
	
	public void read() {
		try {
			FileInputStream rawBytes = new FileInputStream(fileName);
			ObjectInputStream inFile = new ObjectInputStream(rawBytes);
			
			Object anyObject = inFile.readObject();
			
			inFile.close();
			
			this.theGame = (Game) anyObject;
			
		} catch (Exception e) {;
		}
		
	}
	
	public Game getLoaded() {
		return theGame;
	}

}
