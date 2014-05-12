package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Hitmonchan extends Mob{

	public Hitmonchan(BufferedImage[] b) {
		super(b);
		super.name = "Hitmonchan";
		super.health = 350;
		super.moveSpeed = 8;
		super.type = Type.FIGHTING;
		super.money = 0;	
	}
}
