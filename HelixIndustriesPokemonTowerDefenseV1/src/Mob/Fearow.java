package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Fearow extends Mob{

	public Fearow(BufferedImage[] b) {
		super(b);
		super.name = "Fearow";
		super.health = 55;
		super.moveSpeed = 7;
		super.type = Type.FLYING;
		super.money = 7;	
	}

}
