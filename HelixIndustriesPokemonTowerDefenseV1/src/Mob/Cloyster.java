package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Cloyster extends Mob{

	public Cloyster(BufferedImage[] b) {
		super(b);
		super.name = "Cloyster";
		super.health = 400;
		super.moveSpeed = 2;
		super.type = Type.ICE;
		super.money = 0;	}

}
