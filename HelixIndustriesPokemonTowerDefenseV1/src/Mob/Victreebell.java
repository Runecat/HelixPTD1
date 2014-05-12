package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Victreebell extends Mob{

	public Victreebell(BufferedImage[] b) {
		super(b);
		super.name = "Victreebell";
		super.health = 90;
		super.moveSpeed = 4;
		super.type = Type.GRASS;
		super.money = 10;	}

}
