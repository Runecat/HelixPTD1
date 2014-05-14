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
		grid[3][10].setNextPathTile(grid[3][11]);
		grid[3][11].setNextPathTile(grid[3][12]);
		grid[3][12].setNextPathTile(grid[3][13]);
		grid[3][13].setNextPathTile(grid[3][14]);
		grid[3][14].setNextPathTile(grid[3][15]);
		grid[3][15].setNextPathTile(grid[3][16]);
		grid[3][16].setNextPathTile(grid[3][17]);
		grid[3][17].setNextPathTile(grid[3][18]);
		grid[3][18].setNextPathTile(grid[3][19]);
		grid[3][19].setNextPathTile(grid[3][20]);
		grid[3][20].setNextPathTile(grid[3][21]);
		grid[3][21].setNextPathTile(grid[3][22]);
		grid[3][22].setNextPathTile(grid[3][23]);
		
		grid[3][23].setNextPathTile(grid[4][23]);
		grid[4][23].setNextPathTile(grid[4][24]);
		
		grid[4][24].setNextPathTile(grid[5][24]);
		grid[5][24].setNextPathTile(grid[6][24]);
		grid[6][24].setNextPathTile(grid[7][24]);
		grid[7][24].setNextPathTile(grid[8][24]);
		grid[8][24].setNextPathTile(grid[9][24]);
		grid[9][24].setNextPathTile(grid[10][24]);
		grid[10][24].setNextPathTile(grid[11][24]);
		grid[11][24].setNextPathTile(grid[12][24]);
		grid[12][24].setNextPathTile(grid[13][24]);
		grid[13][24].setNextPathTile(grid[14][24]);
		grid[14][24].setNextPathTile(grid[15][24]);
		
		grid[15][24].setNextPathTile(grid[15][23]);
		grid[15][23].setNextPathTile(grid[16][23]);
		
		grid[16][23].setNextPathTile(grid[16][22]);
		grid[16][22].setNextPathTile(grid[16][21]);
		grid[16][21].setNextPathTile(grid[16][20]);
		grid[16][20].setNextPathTile(grid[16][19]);
		grid[16][19].setNextPathTile(grid[16][18]);
		grid[16][18].setNextPathTile(grid[16][17]);
		grid[16][17].setNextPathTile(grid[16][16]);
		grid[16][16].setNextPathTile(grid[16][15]);
		grid[16][15].setNextPathTile(grid[16][14]);
		grid[15][14].setNextPathTile(grid[16][13]);
		grid[15][13].setNextPathTile(grid[16][12]);
		grid[16][12].setNextPathTile(grid[16][11]);
		grid[16][11].setNextPathTile(grid[16][10]);
		grid[16][10].setNextPathTile(grid[16][9]);
		grid[16][9].setNextPathTile(grid[16][8]);
		grid[16][8].setNextPathTile(grid[16][7]);
		grid[16][7].setNextPathTile(grid[16][6]);
		grid[16][6].setNextPathTile(grid[16][5]);
		grid[16][5].setNextPathTile(grid[16][4]);
		grid[16][4].setNextPathTile(grid[16][3]);
		grid[16][3].setNextPathTile(grid[16][2]);
		grid[16][2].setNextPathTile(grid[16][1]);
		grid[16][1].setNextPathTile(grid[16][0]);
		super.buildPath();
		super.setLevels(waves.size());
		
		
		// RIP IN PEACE CHARS

	}
	
	public Image getBackground() {
		return this.background;
	}
}
