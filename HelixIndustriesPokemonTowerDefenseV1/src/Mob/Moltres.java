package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Moltres extends Mob{

	public Moltres(BufferedImage[] b) {
		super(b);
		super.name = "Moltres";
		super.health = 200;
		super.moveSpeed = 7;
		super.type = Type.FIRE;
		super.money = 100;	}

}
