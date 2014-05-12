package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Pidgeot extends Mob{

	public Pidgeot(BufferedImage[] b) {
		super(b);
		super.name = "Pidgeot";
		super.health = 500;
		super.moveSpeed = 10;
		super.type = Type.FLYING;
		super.money = 0;	}

}
