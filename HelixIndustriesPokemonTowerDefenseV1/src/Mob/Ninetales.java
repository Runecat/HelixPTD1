package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Ninetales extends Mob{

	public Ninetales(BufferedImage[] b) {
		super(b);
		super.name = "Ninetales";
		super.health = 65;
		super.moveSpeed = 6;
		super.type = Type.FIRE;
		super.money = 7;	
	}
}
