package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Doduo extends Mob{

	public Doduo(BufferedImage[] b) {
		super(b);
		super.name = "Doduo";
		super.health = 35;
		super.moveSpeed = 10;
		super.type = Type.NORMAL;
		super.money = 4;	}

}
