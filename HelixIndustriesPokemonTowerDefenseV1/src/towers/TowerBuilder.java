package towers;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import maps.Map;
import model.Tile;
import attacks.Attack;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TowerBuilder 
{
	//handle sprite cutting
	private final int spriteWidth = 60;
  	private final int spriteHeight = 60;
  	private final int spriteRows = 10;
  	private final int spriteColumns = 10;
  	private BufferedImage[] sprites;
  	
	public TowerBuilder()
	{
	    sprites = cutTowerSheet();
	}
	
	private BufferedImage[] cutTowerSheet()
	{
		BufferedImage pokemonSpriteSheet = null;
		try {
			pokemonSpriteSheet = ImageIO.read(new File("Images/CondensedPokemonSprites.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	
	  	BufferedImage[] sprites = new BufferedImage[spriteRows*spriteColumns];
	  	System.out.println("Rows: "+ spriteRows + " Columns: " + spriteColumns);
	  	for(int i = 0; i<spriteColumns;i++)
	  	{
	  		for(int j = 0; j<spriteRows;j++)
	  		{
	  			sprites[(i*spriteRows)+j] = pokemonSpriteSheet.getSubimage(
	  				i*spriteWidth,
	  				j*spriteHeight,
	  				spriteWidth,
	  				spriteHeight);
	  		}
	  	}
	  	
	  	return sprites;
	}
	
	public Tower buildTower(TowerID i, Tile t, Map m)//needs map, tile that is it....
	//public Charmander(ArrayList<Attack> attacks, Tile t, BufferedImage b, Map m)
	{
		Tower tower;
		switch(i)
		{
			case BULBASAUR: tower = new Bulbasaur(t,m);
							tower.setImage(sprites[1]);
				break;
			case IVYSAUR: tower = new Ivysaur(t,m);
						  tower.setImage(sprites[2]);
				break;
			case VENUSAUR: tower = new Venusaur(t,m);
						   tower.setImage(sprites[3]);
				break;
			case CHARMANDER: tower = new Charmander(t,m);
							 tower.setImage(sprites[4]);
				break;
			case CHARMELEON: tower = new Charmeleon(t,m);
							 tower.setImage(sprites[5]);
				break;
			case CHARIZARD: tower = new Charizard(t,m);
							tower.setImage(sprites[6]);
				break;
			case SQUIRTLE: tower = new Squirtle(t,m);
						   tower.setImage(sprites[7]);
				break;
			case WARTORTLE: tower = new Wartortle(t,m);
							tower.setImage(sprites[8]);
				break;
			case BLASTOISE: tower = new Blastoise(t,m);
							tower.setImage(sprites[9]);
				break;
			//case PIKACHU: tower = new Pikachu(t,m);
			//	break;
			//case RAICHU: tower = new Raichu(t,m);
			//	break;
			default: tower = null;
				break;
		}
		return tower;
	}

}
