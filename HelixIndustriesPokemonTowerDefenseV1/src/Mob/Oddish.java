package Mob;

import java.awt.image.BufferedImage;
import model.Type;

public class Oddish extends Mob{
	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Oddish(BufferedImage b) {
		super(b);
		name = "Oddish";
		health = 30;
		moveSpeed = 2;
		type = Type.GRASS;
		money = 2;
	}

}
