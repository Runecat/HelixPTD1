package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Arcanine extends Mob{

	public Arcanine(BufferedImage[] b) {
		super(b);
		super.name = "Arcanine";
		super.health = 75;
		super.moveSpeed = 10;
		super.type = Type.FIRE;
		super.money = 12;	}

}
