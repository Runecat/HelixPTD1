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
	private String backgroundImageURL = "Images/Route5.png";
	
	private final int WIDTH = 20;
	private final int HEIGHT = 26;
		
	
	public Level1(Game theGame) {
		super();
		super.setGame(theGame);
		super.height = HEIGHT;
		super.width = WIDTH;
		
		theGame.setMap(this);
		loader = new ImageLoader();
		buildGrid(WIDTH, HEIGHT);
		
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
		
		// spawner will be declared for each map specifically.
		Spawner spawn = new Spawner(grid[3][0], waves, this);
		super.setSpawner(spawn);
				
		// TRACK NIGGA (defined specifically in each map)
		grid[3][0].setNextPathTile(grid[3][1]);
		grid[3][1].setNextPathTile(grid[3][2]);
		grid[3][2].setNextPathTile(grid[3][3]);
		grid[3][3].setNextPathTile(grid[3][4]);
		grid[3][4].setNextPathTile(grid[3][5]);
		grid[3][5].setNextPathTile(grid[3][6]);
		grid[3][6].setNextPathTile(grid[3][7]);
		grid[3][7].setNextPathTile(grid[3][8]);
		grid[3][8].setNextPathTile(grid[3][9]);
		grid[3][9].setNextPathTile(grid[3][10]);
		grid[3][10].setNextPathTile(grid[4][10]);
		grid[4][10].setNextPathTile(grid[5][10]);
		grid[5][10].setNextPathTile(grid[5][11]);
		super.buildPath();
		super.setLevels(waves.size());
		
		
		// RIP IN PEACE CHARS

	}
	
	public Image getBackground() {
		return this.background;
	}
}
