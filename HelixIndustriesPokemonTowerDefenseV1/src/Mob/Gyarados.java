package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Gyarados extends Mob{

	public Gyarados(BufferedImage[] b) {
		super(b);
		super.name = "Dragonite";
		super.health = 800;
		super.moveSpeed = 3;
		super.type = Type.WATER;
		super.money = 0;	}

}
