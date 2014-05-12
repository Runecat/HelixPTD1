package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Tauros extends Mob{

	public Tauros(BufferedImage[] b) {
		super(b);
		super.name = "Tauros";
		super.health = 80;
		super.moveSpeed = 8;
		super.type = Type.NORMAL;
		super.money = 8;
	}
}
