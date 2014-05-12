package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Weepinbell extends Mob{

	public Weepinbell(BufferedImage[] b) {
		super(b);
		super.name = "Weepinbell";
		super.health = 65;
		super.moveSpeed = 3;
		super.type = Type.GRASS;
		super.money = 5;
	}

}
