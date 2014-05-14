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

public class Level1 extends Map {

	ImageLoader loader;

	private BufferedImage background;
	private String backgroundImageURL = "Images/Route5.png";
	public final int OFFSET = 480;

	private final int WIDTH = 20;
	private final int HEIGHT = 28;

	public Level1(Game theGame) {
		super();
		super.setGame(theGame);
		super.height = HEIGHT;
		super.width = WIDTH;
		super.setOffset(OFFSET);

		theGame.setMap(this);
		loader = new ImageLoader();
		buildGrid(WIDTH, HEIGHT);

		try {
			this.background = loader.loadImage("Images/Route5.png");
		} catch (IOException e) {
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


		// spawner will be declared for each map specifically.
		Spawner spawn = new Spawner(grid[3][0], waves, this);
		super.setSpawner(spawn);

		
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
		grid[16][14].setNextPathTile(grid[16][13]);
		grid[16][13].setNextPathTile(grid[16][12]);
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

	@Override
	public Image getBackground() {
		return this.background;
	}
}
