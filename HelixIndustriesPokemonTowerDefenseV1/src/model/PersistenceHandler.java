package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
		} catch (IOException ioe) {
			System.out.println("Oh man, you messed up!");
		}
	}
	
	public void read() {
		try {
			FileInputStream rawBytes = new FileInputStream(fileName);
			ObjectInputStream inFile = new ObjectInputStream(rawBytes);
			
			Object anyObject = inFile.readObject();
			
			inFile.close();
			
			this.theGame = (Game) anyObject;
			
		} catch (Exception e) {
			System.out.println("Something is fishy...");
		}
		
	}
	
	public Game getLoaded() {
		return theGame;
	}

}
