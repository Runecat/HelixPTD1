package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class EliteExeggutor extends Mob{

	public EliteExeggutor(BufferedImage[] b) {
		super(b);
		super.name = "Exeggutor";
		super.health = 700;
		super.moveSpeed = 4;
		super.type = Type.GRASS;
		super.money = 0;
	}

}
