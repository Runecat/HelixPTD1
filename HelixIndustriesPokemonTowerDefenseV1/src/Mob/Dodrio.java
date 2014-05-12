package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Dodrio extends Mob{

	public Dodrio(BufferedImage[] b) {
		super(b);
		super.name = "Dodrio";
		super.health = 60;
		super.moveSpeed = 11;
		super.type = Type.NORMAL;
		super.money = 7;
	}
}
