package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Hitmonlee extends Mob{

	public Hitmonlee(BufferedImage[] b) {
		super(b);
		super.name = "Hitmonlee";
		super.health = 250;
		super.moveSpeed = 10;
		super.type = Type.FIGHTING;
		super.money = 0;	
	}
}
