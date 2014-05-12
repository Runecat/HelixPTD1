package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Nidorino extends Mob{

	public Nidorino(BufferedImage[] b) {
		super(b);
		super.name = "Nidorino";
		super.health = 60;
		super.moveSpeed = 3;
		super.type = Type.GROUND;
		super.money = 5;	
	}
}
