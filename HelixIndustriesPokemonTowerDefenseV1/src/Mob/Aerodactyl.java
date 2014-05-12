package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Aerodactyl extends Mob{

	public Aerodactyl(BufferedImage[] b) {
		super(b);
		super.name = "Dragonite";
		super.health = 550;
		super.moveSpeed = 10;
		super.type = Type.FLYING;
		super.money = 0;	}

}
