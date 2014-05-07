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
				pokemonSpriteSheet = ImageIO.read(new File("Images/CondensedPokemonSprites.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int spriteColumns =10;
			int spriteRows = 10;
			int spriteWidth = 60;
			int spriteHeight = 60;
			int offset = 20;
			BufferedImage[] sprites = new BufferedImage[(spriteRows+1)*(spriteColumns+1)];
		  	System.out.println("Rows: "+ spriteRows + " Columns: " + spriteColumns);
		  	for(int i = 0; i<spriteColumns;i++)
		  	{
		  		for(int j = 0; j<spriteRows;j++)
		  		{
		  			/*sprites[(i*spriteRows)+j] = pokemonSpriteSheet.getSubimage(
		  				i*spriteWidth,
		  				j*spriteHeight,
		  				spriteWidth,
		  				spriteHeight);*/
		  			sprites[(i*spriteRows)+j] = pokemonSpriteSheet.getSubimage(
			  				i*spriteWidth,
			  				j*spriteHeight+offset,
			  				spriteWidth,
			  				spriteHeight);
		  			//System.out.println(i*spriteRows+j +","+ i*spriteWidth + "," + ((j*spriteHeight)+offset) + "," + spriteWidth + "," + spriteHeight);
		  			//(60,60,60,60) gives me most of pikachu
		  			//(60,120,60,60) gives me bottom of pikachu plus top of oddish
		  			//120,60,60,60 gives bottom bulba, top rai
		  			
		  			//120,20,60,60  bulba
		  			//180,20,60,60 ivy
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
		  			g.drawImage(sprites[(i*spriteRows)+j],i*60,j*60,60,60,this);//i*spriteRows)+j
		  			g.drawString(""+((i*spriteRows)+j),i*60 ,j*60 );
		  		}
		  	}
		  	for(int k =0;k<=spriteRows*spriteColumns;k++)
		  	{
		  		//g.drawImage(sprites[k],k*60,0,60,60,this);
		  	}
		  	//g.drawImage(sprites[0],0,0,60,60,this);
		  	//g.drawImage(sprites[1],60,0,60,60,this);
		  	//g.drawImage(sprites[2],120,0,60,60,this);
		  	//g.drawImage(sprites[3],180,0,60,60,this);
		  	//g.drawImage(sprites[4],240,0,60,60,this);
		  	//g.drawImage(sprites[5],300,0,60,60,this);
		  	//g.drawImage(sprites[6],360,0,60,60,this);
		  	//g.drawImage(sprites[7],420,0,60,60,this);
			
		}
		
		public void update() {
			// This is where we will repaint the map and other things;
			this.repaint();
			
		}
	}
}
