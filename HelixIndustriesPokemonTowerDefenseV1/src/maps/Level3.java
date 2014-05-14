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
import Wave.Wave04;
import Wave.Wave05PewterGym;
import Wave.Wave06;
import Wave.Wave07;
import Wave.Wave08;
import Wave.Wave09;
import Wave.Wave10CeruleanGym;
import Wave.Wave11;
import Wave.Wave12;
import Wave.Wave13;
import Wave.Wave14;
import Wave.Wave15VermillionGym;
import Wave.Wave16;
import Wave.Wave17;
import Wave.Wave18;
import Wave.Wave19;
import Wave.Wave20CeladonGym;
import Wave.Wave21;
import Wave.Wave22;
import Wave.Wave23;
import Wave.Wave24;
import Wave.Wave25SaffronGym;
import Wave.Wave26;
import Wave.Wave27;
import Wave.Wave28;
import Wave.Wave29;
import Wave.Wave30FuchsiaGym;
import Wave.Wave31;
import Wave.Wave32;
import Wave.Wave33;
import Wave.Wave34;
import Wave.Wave35CinnabarGym;
import Wave.Wave36;
import Wave.Wave37;
import Wave.Wave38;
import Wave.Wave39;
import Wave.Wave40ViridianGym;
import Wave.Wave41;
import Wave.Wave42;
import Wave.Wave43;
import Wave.Wave44;
import Wave.Wave45;
import Wave.Wave46EliteLorelei;
import Wave.Wave47EliteBruno;
import Wave.Wave48EliteAgatha;
import Wave.Wave49EliteLance;
import Wave.Wave50ChampionBlue;
import towers.Tower;
import towers.TowerID;
import view.ImageLoader;
import model.Game;
import model.Spawner;
import model.Tile;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 *
 */

public class Level3 extends Map{
	
	ImageLoader loader;

	private BufferedImage background;
	private String backgroundImageURL = "Images/level3_map.png";
	
	private final int OFFSET = 1224;

	private final int WIDTH = 33;
	private final int HEIGHT = 26;
	
	public Level3(Game theGame){
		super();
		super.setGame(theGame);
		super.height = HEIGHT;
		super.width = WIDTH;
		super.setOffset(OFFSET);


		theGame.setMap(this);
		loader = new ImageLoader();
		buildGrid(WIDTH, HEIGHT);

		try {
			this.background = loader.loadImage("Images/level3_map.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Wave> waves = new ArrayList<Wave>();
		waves.add(new Wave01());
		waves.add(new Wave02());
		waves.add(new Wave03());
		waves.add(new Wave04());
		waves.add(new Wave05PewterGym());
		waves.add(new Wave06());
		waves.add(new Wave07());
		waves.add(new Wave08());
		waves.add(new Wave09());
		waves.add(new Wave10CeruleanGym());
		waves.add(new Wave11());
		waves.add(new Wave12());
		waves.add(new Wave13());
		waves.add(new Wave14());
		waves.add(new Wave15VermillionGym());
		waves.add(new Wave16());
		waves.add(new Wave17());
		waves.add(new Wave18());
		waves.add(new Wave19());
		waves.add(new Wave20CeladonGym());
		waves.add(new Wave21());
		waves.add(new Wave22());
		waves.add(new Wave23());
		waves.add(new Wave24());
		waves.add(new Wave25SaffronGym());
		waves.add(new Wave26());
		waves.add(new Wave27());
		waves.add(new Wave28());
		waves.add(new Wave29());
		waves.add(new Wave30FuchsiaGym());
		waves.add(new Wave31());
		waves.add(new Wave32());
		waves.add(new Wave33());
		waves.add(new Wave34());
		waves.add(new Wave35CinnabarGym());
		waves.add(new Wave36());
		waves.add(new Wave37());
		waves.add(new Wave38());
		waves.add(new Wave39());
		waves.add(new Wave40ViridianGym());
		waves.add(new Wave41());
		waves.add(new Wave42());
		waves.add(new Wave43());
		waves.add(new Wave44());
		waves.add(new Wave45());
		waves.add(new Wave46EliteLorelei());
		waves.add(new Wave47EliteBruno());
		waves.add(new Wave48EliteAgatha());
		waves.add(new Wave49EliteLance());
		waves.add(new Wave50ChampionBlue());
		
		
		Spawner spawn = new Spawner(grid[0][11], waves, this);
		super.setSpawner(spawn);
		
		grid[0][11].setNextPathTile(grid[1][11]);
		grid[1][11].setNextPathTile(grid[2][11]);
		
		grid[2][11].setNextPathTile(grid[2][10]);//path one
		grid[2][10].setNextPathTile(grid[2][9]);
		grid[2][9].setNextPathTile(grid[2][8]);
		grid[2][8].setNextPathTile(grid[2][7]);
		grid[2][7].setNextPathTile(grid[2][6]);
		grid[2][6].setNextPathTile(grid[2][5]);
		grid[2][5].setNextPathTile(grid[2][4]);
		
		grid[2][4].setNextPathTile(grid[3][4]);
		grid[3][4].setNextPathTile(grid[4][4]);
		grid[4][4].setNextPathTile(grid[5][4]);
		grid[5][4].setNextPathTile(grid[6][4]);
		grid[6][4].setNextPathTile(grid[7][4]);
		grid[7][4].setNextPathTile(grid[8][4]);
		grid[8][4].setNextPathTile(grid[9][4]);
		grid[9][4].setNextPathTile(grid[10][4]);
		grid[10][4].setNextPathTile(grid[11][4]);
		grid[11][4].setNextPathTile(grid[12][4]);
		grid[12][4].setNextPathTile(grid[13][4]);
		grid[13][4].setNextPathTile(grid[14][4]);
		
		grid[14][4].setNextPathTile(grid[14][6]);
		grid[14][6].setNextPathTile(grid[14][7]);
		grid[14][7].setNextPathTile(grid[14][8]);
		grid[14][8].setNextPathTile(grid[14][9]);
		grid[14][9].setNextPathTile(grid[14][10]);
		grid[14][10].setNextPathTile(grid[14][11]);
	
		grid[2][11].setNextPathTile(grid[2][12]);//path two
		grid[2][12].setNextPathTile(grid[2][13]);
		grid[2][13].setNextPathTile(grid[2][14]);
		grid[2][14].setNextPathTile(grid[2][15]);
		
		grid[2][15].setNextPathTile(grid[3][15]);
		grid[3][15].setNextPathTile(grid[4][15]);
		grid[4][15].setNextPathTile(grid[5][15]);
		grid[5][15].setNextPathTile(grid[6][15]);
		grid[6][15].setNextPathTile(grid[7][15]);
		grid[7][15].setNextPathTile(grid[8][15]);

		grid[8][15].setNextPathTile(grid[8][14]);
		grid[8][14].setNextPathTile(grid[8][13]);
		grid[8][13].setNextPathTile(grid[8][12]);
		grid[8][12].setNextPathTile(grid[8][11]);
		
		grid[8][11].setNextPathTile(grid[9][11]);
		grid[9][11].setNextPathTile(grid[10][11]);
		grid[10][11].setNextPathTile(grid[11][11]);
		grid[11][11].setNextPathTile(grid[12][11]);
		grid[12][11].setNextPathTile(grid[13][11]);
		
		grid[13][11].setNextPathTile(grid[14][11]);//return to one single path
		grid[14][11].setNextPathTile(grid[14][12]);
		grid[14][12].setNextPathTile(grid[14][13]);
		grid[14][13].setNextPathTile(grid[14][14]);
		grid[14][14].setNextPathTile(grid[14][15]);
		
		grid[14][15].setNextPathTile(grid[15][15]);
		grid[15][15].setNextPathTile(grid[16][15]);
		grid[16][15].setNextPathTile(grid[17][15]);
		grid[17][15].setNextPathTile(grid[18][15]);
		grid[18][15].setNextPathTile(grid[19][15]);
		grid[19][15].setNextPathTile(grid[20][15]);
		grid[20][15].setNextPathTile(grid[21][15]);
		grid[21][15].setNextPathTile(grid[22][15]);

		grid[22][15].setNextPathTile(grid[22][14]);//path one
		grid[22][14].setNextPathTile(grid[22][13]);
		grid[22][13].setNextPathTile(grid[22][12]);
		grid[22][12].setNextPathTile(grid[22][11]);
		
		grid[22][11].setNextPathTile(grid[23][11]);
		grid[23][11].setNextPathTile(grid[24][11]);
		grid[24][11].setNextPathTile(grid[25][11]);
		grid[25][11].setNextPathTile(grid[26][11]);
		grid[26][11].setNextPathTile(grid[27][11]);
		grid[27][11].setNextPathTile(grid[28][11]);
		
		grid[28][11].setNextPathTile(grid[28][12]);
		grid[28][12].setNextPathTile(grid[28][13]);
		grid[28][13].setNextPathTile(grid[28][14]);
		grid[28][14].setNextPathTile(grid[28][15]);
		grid[28][15].setNextPathTile(grid[28][16]);
		grid[28][16].setNextPathTile(grid[28][17]);
		grid[28][17].setNextPathTile(grid[28][18]);
		grid[28][18].setNextPathTile(grid[28][19]);
		
		grid[22][15].setNextPathTile(grid[22][16]);//path two
		grid[22][16].setNextPathTile(grid[22][17]);
		grid[22][17].setNextPathTile(grid[22][18]);
		grid[22][18].setNextPathTile(grid[22][19]);
		
		grid[22][19].setNextPathTile(grid[23][19]);
		grid[23][19].setNextPathTile(grid[24][19]);
		grid[24][19].setNextPathTile(grid[25][19]);
		grid[25][19].setNextPathTile(grid[26][19]);
		grid[26][19].setNextPathTile(grid[27][19]);
		grid[27][19].setNextPathTile(grid[28][19]);

		
		grid[28][19].setNextPathTile(grid[28][20]);//return to one single path
		
		grid[28][20].setNextPathTile(grid[28][21]);
		
		grid[28][21].setNextPathTile(grid[29][21]);
		grid[29][21].setNextPathTile(grid[30][21]);
		grid[30][21].setNextPathTile(grid[31][21]);
		grid[31][21].setNextPathTile(grid[32][21]);
		
		

		
		super.buildPath();
		super.setLevels(waves.size());


	}

	@Override
	public Image getBackground() {
		return this.background;
	}

}
