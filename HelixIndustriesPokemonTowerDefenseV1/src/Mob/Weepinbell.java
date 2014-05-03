package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Weepinbell extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Weepinbell(BufferedImage b) {
		super(b);
		name = "Weepinbell";
		health = 65;
		moveSpeed = 3;
		type = Type.GRASS;
		money = 5;
	}

}
