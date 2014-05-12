package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Growlithe extends Mob{

	public Growlithe(BufferedImage[] b) {
		super(b);
		super.name = "Growlithe";
		super.health = 50;
		super.moveSpeed = 6;
		super.type = Type.FIRE;
		super.money = 7;	
	}
}
