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

public class Level2 extends Map{
	
	ImageLoader loader;

	private BufferedImage background;
	private String backgroundImageURL = "Images/36-Gym.png";
	public final int OFFSET = 480;

	private final int WIDTH = 20;
	private final int HEIGHT = 18;
	
	public Level2(Game theGame){
		super();
		super.setGame(theGame);
		super.height = HEIGHT;
		super.width = WIDTH;
		super.setOffset(OFFSET);


		theGame.setMap(this);
		loader = new ImageLoader();
		buildGrid(WIDTH, HEIGHT);

		try {
			this.background = loader.loadImage("Images/36-Gym.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Wave> waves = new ArrayList<Wave>();
		waves.add(new Wave01());
		waves.add(new Wave02());
		waves.add(new Wave03());
		
		Spawner spawn = new Spawner(grid[9][17], waves, this);
		super.setSpawner(spawn);
		
		for(int i = 0; i < HEIGHT; i++){
			grid[6][i].setCanPlaceTower(false);
			grid[13][i].setCanPlaceTower(false);
			grid[i][6].setCanPlaceTower(false);
			grid[i][0].setCanPlaceTower(false);
			grid[i][12].setCanPlaceTower(false);
		}
		
		grid[8][15].setCanPlaceTower(false);
		grid[8][14].setCanPlaceTower(false);
		
		grid[9][17].setNextPathTile(grid[8][17]);
		grid[8][17].setNextPathTile(grid[7][17]);

		grid[7][17].setNextPathTile(grid[7][16]);
		grid[7][16].setNextPathTile(grid[7][15]);
		grid[7][15].setNextPathTile(grid[7][14]);
		grid[7][14].setNextPathTile(grid[7][13]);
		
		grid[7][13].setNextPathTile(grid[8][13]);
		grid[8][13].setNextPathTile(grid[9][13]);
		grid[9][13].setNextPathTile(grid[10][13]);
		grid[10][13].setNextPathTile(grid[11][13]);
		
		grid[11][13].setNextPathTile(grid[11][14]);
		grid[11][14].setNextPathTile(grid[11][15]);//teleport

		grid[11][15].setNextPathTile(grid[19][17]);
		grid[19][17].setNextPathTile(grid[18][17]);
		grid[18][17].setNextPathTile(grid[17][17]);
		
		grid[17][17].setNextPathTile(grid[17][16]);
		grid[17][16].setNextPathTile(grid[17][15]);
		grid[17][15].setNextPathTile(grid[16][15]);
		
		grid[16][15].setNextPathTile(grid[15][15]);
		grid[15][15].setNextPathTile(grid[19][3]);//teleport
		
		grid[19][3].setNextPathTile(grid[19][4]);
		
		grid[19][4].setNextPathTile(grid[18][4]);
		grid[18][4].setNextPathTile(grid[17][4]);
		grid[17][4].setNextPathTile(grid[16][4]);
		grid[16][4].setNextPathTile(grid[15][4]);
		grid[15][4].setNextPathTile(grid[15][5]);//teleport
		
		grid[15][5].setNextPathTile(grid[1][3]);
		grid[1][3].setNextPathTile(grid[2][3]);
		grid[2][3].setNextPathTile(grid[3][3]);
		grid[3][3].setNextPathTile(grid[4][3]);
		
		grid[4][3].setNextPathTile(grid[4][4]);
		grid[4][4].setNextPathTile(grid[4][5]);
		
		grid[4][5].setNextPathTile(grid[3][5]);
		grid[3][5].setNextPathTile(grid[2][5]);
		grid[2][5].setNextPathTile(grid[1][5]);
		grid[1][5].setNextPathTile(grid[11][9]);//teleport
		
		grid[11][9].setNextPathTile(grid[11][10]);
		grid[11][10].setNextPathTile(grid[11][11]);
		
		grid[11][11].setNextPathTile(grid[10][11]);
		grid[10][11].setNextPathTile(grid[9][11]);
		
		grid[9][11].setNextPathTile(grid[9][10]);
		grid[9][10].setNextPathTile(grid[9][9]);
		grid[9][9].setNextPathTile(grid[9][8]);
		grid[9][8].setNextPathTile(grid[9][7]);

		
		super.buildPath();
		super.setLevels(waves.size());


	}

	@Override
	public Image getBackground() {
		// TODO Auto-generated method stub
		return this.background;
	}

}
