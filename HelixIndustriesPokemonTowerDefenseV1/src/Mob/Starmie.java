package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Starmie extends Mob{

	public Starmie(BufferedImage[] b) {
		super(b);
		super.name = "Starmie";
		super.health = 50;
		super.moveSpeed = 7;
		super.type = Type.WATER;
		super.money = 8;
	}
}
