package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Slowpoke extends Mob{

	public Slowpoke(BufferedImage[] b) {
		super(b);
		super.name = "Slowpoke";
		super.health = 120;
		super.moveSpeed = 1;
		super.type = Type.PSYCHIC;
		super.money = 10;	
	}
}
