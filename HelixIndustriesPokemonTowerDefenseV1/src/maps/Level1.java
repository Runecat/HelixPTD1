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
import Wave.Wave03;


import towers.Tower;
import towers.TowerID;
import view.ImageLoader;

import model.Game;
import model.Spawner;
import model.Tile;

public class Level1 extends Map {
	
	ImageLoader loader;
	
	private BufferedImage background;
	
	
	
	private final int WIDTH = 16;
	private final int HEIGHT = 16;
	private final int TILE_LENGTH = 16;
	
	private LinkedList<Tile> path;
	private ArrayList<Spawner> spawners;
	private Game theGame;
	ArrayList<Attack> attacks = new ArrayList<Attack>();
	ArrayList<Tower> towers = new ArrayList<Tower>();
	private Tile[][] grid;
	
	public Level1(Game theGame) {
		super();
		super.height = HEIGHT;
		super.width = WIDTH;
		super.tileLength = TILE_LENGTH;
		this.theGame = theGame;
		
		theGame.setMap(this);
		loader = new ImageLoader();
		buildGrid(WIDTH, HEIGHT, TILE_LENGTH);
		
		try {
			this.background = loader.loadImage("Images/Route5.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Wave> waves = new ArrayList<Wave>();
		waves.add(new Wave01());
		waves.add(new Wave02());
		waves.add(new Wave03());
		
		grid = super.grid;
		
		// TRACK NIGGA (defined specifically in each map)
		grid[3][0].setNextTile(grid[3][1]);
		grid[3][1].setNextTile(grid[3][2]);
		grid[3][2].setNextTile(grid[3][3]);
		grid[3][3].setNextTile(grid[3][4]);
		grid[3][4].setNextTile(grid[3][5]);
		grid[3][5].setNextTile(grid[3][6]);
		grid[3][6].setNextTile(grid[3][7]);
		grid[3][7].setNextTile(grid[3][8]);
		grid[3][8].setNextTile(grid[3][9]);
		grid[3][9].setNextTile(grid[3][10]);
		grid[3][10].setNextTile(grid[4][10]);
		grid[4][10].setNextTile(grid[5][10]);
		grid[5][10].setNextTile(grid[5][11]);

		
		
		// spawner will be declared for each map specifically.
		Spawner spawn = new Spawner(grid[3][0], waves);
		
		// test creating tower
		theGame.createTower(5, 5, TowerID.CHARMELEON);
		
		
		super.setSpawner(spawn);
		super.setLevels(waves.size());
				
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
