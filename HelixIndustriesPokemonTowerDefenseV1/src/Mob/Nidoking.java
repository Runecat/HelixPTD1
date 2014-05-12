package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Nidoking extends Mob{

	public Nidoking(BufferedImage[] b) {
		super(b);
		super.name = "Nidoking";
		super.health = 150;
		super.moveSpeed = 4;
		super.type = Type.GROUND;
		super.money = 10;
	}
}
