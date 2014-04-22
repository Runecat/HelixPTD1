package maps;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.LinkedList;

import model.Spawner;
import model.Tile;

public class Level1 extends Map {
	
	private BufferedImage background;
	private Tile[][] grid;
	
	private int width;
	private int height;
	
	private LinkedList<Tile> path;
	private ArrayList<Spawner> spawners;
	

	public Level1(int width, int height, Tile[][] grid) {
		super(width, height, grid);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setBackground(BufferedImage image) {
		background = image;
	}
	
	

	

	
	
}
