package towers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import maps.Level1;
import maps.Map;
import model.Game;
import model.Tile;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public class TestPanel extends JFrame
{
	private static final long serialVersionUID = 1L;
	PokemonPanel PokemonPanel; 
	
	public static void main(String[] args) 
	{
		TestPanel gui = new TestPanel();
	}

	public TestPanel() 
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Helix PTD Pre-Alpha 0.1");
		
		this.setSize(new Dimension(1000, 720));
		
		//MapPanel 
		PokemonPanel = new PokemonPanel();
		PokemonPanel.setPreferredSize(new Dimension(5000, 5000));
		this.add(PokemonPanel);	
		this.setVisible(true);
	}
	
	private class PokemonPanel extends JPanel
	{
		private Map currentMap;
		private Game theGame;
		private BufferedImage grassBackground;
		
		
		public PokemonPanel() 
		{
			//this.setBackground(Color.cyan);
			this.setPreferredSize(new Dimension(5000,5000));
			
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			BufferedImage pokemonSpriteSheet = null;
			try {
				pokemonSpriteSheet = ImageIO.read(new File("Images/CondensedOverworldSprites.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int spriteColumns =16;
			int spriteRows = 7;
			int spriteWidth = 20;
			int spriteHeight = 20;
			int offset = 0;
			BufferedImage[] sprites = new BufferedImage[(spriteRows+1)*(spriteColumns+1)];
		  	System.out.println("Rows: "+ spriteRows + " Columns: " + spriteColumns);
		  	for(int i = 0; i<spriteColumns;i++)
		  	{
		  		for(int j = 0; j<spriteRows;j++)
		  		{
		  			sprites[(i*spriteRows)+j] = pokemonSpriteSheet.getSubimage(
			  				j*spriteWidth,
			  				i*spriteHeight+offset,
			  				spriteWidth,
			  				spriteHeight);
		  		}
		  	}
			//g.setColor(Color.green);
			//TowerBuilder b = new TowerBuilder();
			//Tile t = new Tile(0,0,0);
			//Map m = new Level1(new Game());
			//BufferedImage charmander = b.buildTower(TowerID.CHARMANDER, t, m).getImage();
		  	//g.drawImage(sprites[10],60,60,60,60,this);
		  	//prints out sprite sheet individual sprites
		  	 for(int i = 0;i<spriteRows;i++)
		  	{
		  		for(int j = 0;j<spriteColumns;j++)
		  		{
		  			g.drawImage(sprites[(i*spriteRows)+j],i*20,j*20,20,20,this);//i*spriteRows)+j
		  			g.drawString(""+((i*spriteRows)+j),i*20 ,j*20 );
		  		}
		  	}
		  	for(int k =0;k<=spriteRows*spriteColumns;k++)
		  	{
		  		//g.drawImage(sprites[k],k*20,0,20,20,this);
		  	}
			
		}
		
		public void update() {
			// This is where we will repaint the map and other things;
			this.repaint();
			
		}
	}
}
