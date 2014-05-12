package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Machamp extends Mob{

	public Machamp(BufferedImage[] b) {
		super(b);
		super.name = "Machamp";
		super.health = 500;
		super.moveSpeed = 5;
		super.type = Type.FIGHTING;
		super.money = 0;	
	}
}
