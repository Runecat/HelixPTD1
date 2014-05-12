package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class GravelerMob extends Mob{

	public GravelerMob(BufferedImage[] b) {
		super(b);
		super.name = "Articuno";
		super.health = 200;
		super.moveSpeed = 1;
		super.type = Type.GROUND;
		super.money = 10;	}

}
