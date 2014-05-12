package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Pidgeotto extends Mob{

	public Pidgeotto(BufferedImage[] b) {
		super(b);
		super.name = "Oddish";
		super.health = 50;
		super.moveSpeed = 5;
		super.type = Type.FLYING;
		super.money = 7;
	}

}
