package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Zapdos extends Mob{

	public Zapdos(BufferedImage[] b) {
		super(b);
		super.name = "Zapdos";
		super.health = 200;
		super.moveSpeed = 7;
		super.type = Type.ELECTRIC;
		super.money = 100;	}

}
