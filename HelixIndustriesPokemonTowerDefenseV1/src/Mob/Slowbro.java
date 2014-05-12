package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Slowbro extends Mob{

	public Slowbro(BufferedImage[] b) {
		super(b);
		super.name = "Slowbro";
		super.health = 500;
		super.moveSpeed = 1;
		super.type = Type.WATER;
		super.money = 0;	
	}

}
