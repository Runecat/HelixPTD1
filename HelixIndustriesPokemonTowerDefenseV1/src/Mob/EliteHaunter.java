package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class EliteHaunter extends Mob{

	public EliteHaunter(BufferedImage[] b) {
		super(b);
		super.name = "Haunter";
		super.health = 450;
		super.moveSpeed = 10;
		super.type = Type.GHOST;
		super.money = 0;	}

}
