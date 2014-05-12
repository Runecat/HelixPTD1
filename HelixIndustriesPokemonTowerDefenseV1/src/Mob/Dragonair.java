package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Dragonair extends Mob{

	public Dragonair(BufferedImage[] b) {
		super(b);
		super.name = "Dragonite";
		super.health = 500;
		super.moveSpeed = 7;
		super.type = Type.DRAGON;
		super.money = 0;	}

}
