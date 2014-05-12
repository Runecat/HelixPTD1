package Mob;

import java.awt.image.BufferedImage;

import model.Type;

import Mob.Mob;

public class Vileplume extends Mob{

	public Vileplume(BufferedImage[] b) {
		super(b);
		super.name = "Vileplume";
		super.health = 85;
		super.moveSpeed = 4;
		super.type = Type.GRASS;
		super.money = 10;
	}

}
