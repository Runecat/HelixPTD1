package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Dugtrio extends Mob{

	public Dugtrio(BufferedImage[] b) {
		super(b);
		super.name = "Dugtrio";
		super.health = 100;
		super.moveSpeed = 3;
		super.type = Type.NORMAL;
		super.money = 10;
	}
}
