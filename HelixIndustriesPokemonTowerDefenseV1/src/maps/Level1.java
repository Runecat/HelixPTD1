package maps;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.Timer;

import attacks.Attack;
import attacks.Ember;

import Mob.Bellsprout;
import Wave.Wave;
import Wave.Wave01;
import Wave.Wave02;

import towers.Charmander;
import towers.Tower;
import view.ImageLoader;

import model.Game;
import model.Spawner;
import model.Tile;

public class Level1 extends Map {
	
	ImageLoader loader;
	
	
	
	
	private BufferedImage background;
	private Tile[][] grid;
	
	
	
	private final int width = 16;
	private final int height = 16;
	private final int tileDimension = 8;
	
	private LinkedList<Tile> path;
	private ArrayList<Spawner> spawners;
	private Game theGame;
	
	ArrayList<Attack> attacks = new ArrayList<Attack>();
	Charmander chars;
	
	public Level1(Game theGame) {
		super();
		
		this.theGame = theGame;
		
		theGame.setMap(this);
		loader = new ImageLoader();
		
		try {
			this.background = loader.loadImage("Images/Route5.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		grid = new Tile[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				grid[i][j] = new Tile(tileDimension, tileDimension);
			}
		}
		ArrayList<Wave> waves = new ArrayList<Wave>();
		waves.add(new Wave01());
		waves.add(new Wave02());
		
		grid[3][0].setSpawnerTile(new Spawner(grid[3][0], waves));
		
		// TRACK NIGGA
		grid[3][0].setNextTile(grid[3][1]);
		grid[3][1].setNextTile(grid[3][2]);
		grid[3][2].setNextTile(grid[3][3]);
		grid[3][3].setNextTile(grid[3][4]);
		grid[3][4].setNextTile(grid[3][5]);
		grid[3][5].setNextTile(grid[3][6]);
		grid[3][6].setNextTile(grid[3][7]);
		grid[3][7].setNextTile(grid[3][8]);

		grid[3][0].getSpawnerTile().sendWave(1);
		// YEEEAH
		
		attacks.add(new Ember());
		chars = new Charmander(attacks, grid[5][5], null);

		grid[5][5].setObject(chars);
		TowerListener shittyListener = new TowerListener();
		Timer time = new Timer(50, shittyListener);
		time.start();
		
		//grid[3][6].addMobs(new Bellsprout(null));
				
	}
	
	private class TowerListener implements ActionListener {

		//@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("");
			theGame.attack(chars, new Ember());
			System.out.println("IM TRYING");
			
		}
		
	}
	
	public int getGridWidth() {
		return grid.length;
	}
	
	public int getGridHeight() {
		return grid[0].length;
	}
	
	public Tile[][] getGrid() {
		return grid;
	}
	
	
	

	public Image getBackground() {
		return this.background;
	}

	@Override
	public void setTower(int row, int col, Tower tower) {
		grid[row][col].setObject(tower);
		
	}
	
	
	

	
	
	

	

	
	
}
