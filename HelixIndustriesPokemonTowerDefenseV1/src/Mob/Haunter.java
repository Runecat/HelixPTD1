package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Haunter extends Mob{

	public Haunter(BufferedImage[] b) {
		super(b);
		super.name = "Haunter";
		super.health = 50;
		super.moveSpeed = 10;
		super.type = Type.GHOST;
		super.money = 12;	
	}
}
