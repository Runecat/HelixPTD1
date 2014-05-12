package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class EliteRhydon extends Mob{

	public EliteRhydon(BufferedImage[] b) {
		super(b);
		super.name = "Rhydon";
		super.health = 1000;
		super.moveSpeed = 2;
		super.type = Type.GROUND;
		super.money = 0;	}

}
