package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Lickitung extends Mob{

	public Lickitung(BufferedImage[] b) {
		super(b);
		super.name = "Lickitung";
		super.health = 100;
		super.moveSpeed = 2;
		super.type = Type.NORMAL;
		super.money = 10;	
	}

}
