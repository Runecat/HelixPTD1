package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Bellsprout extends Mob{

	
	public Bellsprout(BufferedImage[] b) {
		super(b);
		super.name = "Bellsprout";
		super.health = 40;
		super.moveSpeed = 2;
		super.type = Type.GRASS;
		super.money = 3;
	}

}
