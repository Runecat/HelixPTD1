package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Gengar extends Mob{

	public Gengar(BufferedImage[] b) {
		super(b);
		super.name = "Gengar";
		super.health = 600;
		super.moveSpeed = 15;
		super.type = Type.GHOST;
		super.money = 0;	}

}
