package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Jynx extends Mob{

	public Jynx(BufferedImage[] b) {
		super(b);
		super.name = "Jynx";
		super.health = 100;
		super.moveSpeed = 8;
		super.type = Type.FIGHTING;
		super.money = 0;	
	}
}
