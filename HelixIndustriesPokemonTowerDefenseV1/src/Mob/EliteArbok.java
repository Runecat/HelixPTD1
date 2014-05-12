package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class EliteArbok extends Mob{

	public EliteArbok(BufferedImage[] b) {
		super(b);
		super.name = "Arbok";
		super.health = 350;
		super.moveSpeed = 10;
		super.type = Type.POISON;
		super.money = 0;	
	}

}
