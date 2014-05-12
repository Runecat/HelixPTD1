package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Rapidash extends Mob{

	public Rapidash(BufferedImage[] b) {
		super(b);
		super.name = "Ponyta";
		super.health = 75;
		super.moveSpeed = 9;
		super.type = Type.FIRE;
		super.money = 8;
	}

}
