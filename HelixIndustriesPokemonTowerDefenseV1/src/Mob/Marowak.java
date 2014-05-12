package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Marowak extends Mob{

	public Marowak(BufferedImage[] b) {
		super(b);
		super.name = "Articuno";
		super.health = 80;
		super.moveSpeed = 3;
		super.type = Type.GROUND;
		super.money = 10;	}

}
