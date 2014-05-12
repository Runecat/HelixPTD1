package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Dragonite extends Mob{

	public Dragonite(BufferedImage[] b) {
		super(b);
		super.name = "Dragonite";
		super.health = 700;
		super.moveSpeed = 5;
		super.type = Type.DRAGON;
		super.money = 0;	
	}

}
