package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Venonat extends Mob{

	public Venonat(BufferedImage[] b) {
		super(b);
		super.name = "Venonat";
		super.health = 45;
		super.moveSpeed = 3;
		super.type = Type.POISON;
		super.money = 4;
	}

}
