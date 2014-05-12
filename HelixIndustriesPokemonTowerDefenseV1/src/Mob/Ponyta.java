package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Ponyta extends Mob{

	public Ponyta(BufferedImage[] b) {
		super(b);
		super.name = "Ponyta";
		super.health = 60;
		super.moveSpeed = 7;
		super.type = Type.FIRE;
		super.money = 4;
	}
}
