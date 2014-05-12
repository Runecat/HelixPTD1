package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class VenusaurMob extends Mob{

	public VenusaurMob(BufferedImage[] b) {
		super(b);
		super.name = "Venasaur";
		super.health = 600;
		super.moveSpeed = 5;
		super.type = Type.GRASS;
		super.money = 0;	}

}
