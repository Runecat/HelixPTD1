package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Raticate extends Mob{

	public Raticate(BufferedImage[] b) {
		super(b);
		super.name = "Raticate";
		super.health = 30;
		super.moveSpeed = 5;
		super.type = Type.NORMAL;
		super.money = 4;	}

}
