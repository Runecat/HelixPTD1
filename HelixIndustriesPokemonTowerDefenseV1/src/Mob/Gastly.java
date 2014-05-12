package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Gastly extends Mob{

	public Gastly(BufferedImage[] b) {
		super(b);
		super.name = "Gastly";
		super.health = 30;
		super.moveSpeed = 8;
		super.type = Type.PSYCHIC;
		super.money = 7;	}

}
