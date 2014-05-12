package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Rhydon extends Mob{

	public Rhydon(BufferedImage[] b) {
		super(b);
		super.name = "Rhydon";
		super.health = 250;
		super.moveSpeed = 5;
		super.type = Type.GROUND;
		super.money = 25;	
	}

}
