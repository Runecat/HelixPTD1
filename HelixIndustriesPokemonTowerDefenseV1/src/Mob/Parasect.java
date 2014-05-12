package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Parasect extends Mob{

	public Parasect(BufferedImage[] b) {
		super(b);
		super.name = "Parasect";
		super.health = 50;
		super.moveSpeed = 5;
		super.type = Type.BUG;
		super.money = 5;	
	}

}
